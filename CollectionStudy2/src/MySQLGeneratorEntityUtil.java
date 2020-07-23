import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MySQLGeneratorEntityUtil {

	//����
    private String tableName;
     //��������
    private String[] colNames;
     //������������
    private String[] colTypes; 
    //������С����
    private int[] colSizes; 
    //����ע��
    private Map colNamesComment = new HashMap(); 
     //�Ƿ���Ҫ�����java.util.*
    private boolean needUtil = false;
     //�Ƿ���Ҫ�����java.sql.*
    private boolean needSql = false; 
    //�Ƿ���Ҫ�����java.math.BigDecimal
    private boolean needBigDecimal = false; 
     //�Ƿ񴴽�EntityHelper
    private boolean needEntityHelper = true;
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final String SQL = "SELECT * FROM ";// ���ݿ����
 
    // ���ݿ�������Ϣ
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/fyt_ims";
    private static final String NAME = "wen";
    private static final String PASS = "8991731mawen";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    //ָ��ʵ���������ڰ���·��
    private static String basePath = new File("").getAbsolutePath();
    //ָ������
    private static String packageOutPath = "com.cj.entity";
    //��������
    private String authorName = "�ź�";
    //ָ����Ҫ���ɵı�ı�����ȫ����������Ϊnull
    private String[] generateTables = null;
     //����
    private static String pk;
 
    MySQLGeneratorEntityUtil() {
    	
    }
 
    /**
     * @description ����class����������
     */
    public String parse() {
        StringBuffer sb = new StringBuffer();
        sb.append("package " + packageOutPath + ";\r\n");
        sb.append("\r\n");
        // �ж��Ƿ��빤�߰�
        if (needUtil) {
            sb.append("import java.util.Date;\r\n");
         }
        if (needSql) {
            sb.append("import java.sql.*;\r\n");
         }
         
       for (int i = 0; i < colNames.length; i++) {
    	   String hasbd = sqlType2JavaType(colTypes[i]);
    	   if(hasbd =="BigDecimal" || "BigDecimal".equals(hasbd)) {needBigDecimal=true;}
        }
       if(needBigDecimal) {
    	   sb.append("import java.math.BigDecimal;\r\n");
        }
         // ע�Ͳ���
        sb.append("/**\r\n");
        sb.append(" * table name:  " + tableName + "\r\n");
        sb.append(" * author name: " + authorName + "\r\n");
        sb.append(" * create time: " + SDF.format(new Date()) + "\r\n");
        sb.append(" */ \r\n");
        // ʵ�岿��
        String classExtends = "";
        if(needEntityHelper) {
        	classExtends=" extends EntityHelper";
          }
        sb.append("public class " + under2camel(tableName, true) + classExtends + "{\r\n\r\n");
        
        processAllAttrs(sb);// ����
        sb.append("\r\n");
        processConstructor(sb);//���캯��
        processAllMethod(sb);// get set����
        processToString(sb);
        if(needEntityHelper) {
        	 processEntityHelper(sb,pk);
          }
        sb.append("}\r\n");
        return sb.toString();
    }
 
    /**
     * @param sb
     * @description �������г�Ա������ע��
     * @author paul
     * @version V1.0
     */
    private void processAllAttrs(StringBuffer sb) {
        for (int i = 0; i < colNames.length; i++) {
        	if(colNamesComment.get(colNames[i])!=null &&!"".equals(colNamesComment.get(colNames[i]))) {
        		sb.append("\t/*"+colNamesComment.get(colNames[i])+"*/\r\n");
        	}
          sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " " + colNames[i] + ";\r\n");
        }
    }
    /**
     * EntityHelper
     * @param sb
     * @param pk
     */
   private void processEntityHelper(StringBuffer sb,String pk) {
	   sb.append("\t@Override\r\n");
	   sb.append("\tpublic String getPrimaryKey() {\r\n");
	   sb.append("\t\treturn \""+pk+"\";\r\n");
	   sb.append("\t}\r\n");
   }
    /**
     * ��дtoString()����
     * @param sb
     */
    private void processToString(StringBuffer sb) {
        sb.append("\t@Override\r\n\tpublic String toString() {\r\n");
        sb.append("\t\treturn \"" +tableName + "[\" + \r\n");
        for (int i = 0; i < colNames.length; i++) {
            if (i != 0)
                sb.append("\t\t\t\", ");
            if (i == 0)
                sb.append("\t\t\t\"");
            sb.append(colNames[i] + "=\" + "
                    + colNames[i]).append(" + \r\n");
            if (i == colNames.length - 1) {
                sb.append("\t\t\t\"]\";\r\n");
            }
        }
        sb.append("\t}\r\n");
    }
    /**
     * ���캯��
     * @param sb
     */
    private void processConstructor(StringBuffer sb) {
    	 StringBuffer p = new StringBuffer();
    	 StringBuffer v = new StringBuffer();
    	 for(int i = 0; i < colNames.length; i++) {
    		 p.append(sqlType2JavaType(colTypes[i])+" "+colNames[i]);
    		 if(i!=colNames.length-1) {
    			 p.append(",");
    		 }
    		 v.append("\t\tthis."+colNames[i]+"="+colNames[i]+";\r\n");
    	 }
    	 //�޲������캯��
        sb.append("\tpublic "+under2camel(tableName,true)+"() {\r\n");
        sb.append("\t\tsuper();\r\n");
        sb.append("\t}\r\n");
         //���ι��캯��
        sb.append("\tpublic "+under2camel(tableName,true)+"("+p.toString()+") {\r\n");
        sb.append(v.toString());
        sb.append("\t}\r\n");
    }
 
    /**
     * @param sb
     * @description ��������get/set����
     */
    private void processAllMethod(StringBuffer sb) {
        for (int i = 0; i < colNames.length; i++) {
            sb.append("\tpublic void set" + initCap(colNames[i]) + "(" + sqlType2JavaType(colTypes[i]) + " "
                    + colNames[i] + "){\r\n");
            sb.append("\t\tthis." + colNames[i] + "=" + colNames[i] + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + initCap(colNames[i]) + "(){\r\n");
            sb.append("\t\treturn " + colNames[i] + ";\r\n");
            sb.append("\t}\r\n");
        }
    }
 
    /**
     * @param str �����ַ���
     * @return
     * @description �������ַ���������ĸת�ɴ�д
     */
    private String initCap(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z')
            ch[0] = (char) (ch[0] - 32);
        return new String(ch);
    }
 
    /**
      * ���ܣ��»�������ת�շ�����
     * @param s
     * @param fistCharToUpperCase ����ĸ�Ƿ��д
     * @author �ź�
     * @return
     */
    private String under2camel(String s,boolean fistCharToUpperCase) {
       String separator = "_";
    	String under="";
    	s = s.toLowerCase().replace(separator, " ");
    	String sarr[]=s.split(" ");
    	for(int i=0;i<sarr.length;i++)
    	{
    		String w=sarr[i].substring(0,1).toUpperCase()+sarr[i].substring(1);
    		under +=w;
    	}
    	if(!fistCharToUpperCase) {
    		under = under.substring(0,1).toLowerCase()+under.substring(1);
    	}
        return under;
    }
 
    /**
     * @return
     * @description ����sql�ֶ���������Ӧ��Java����
     */
    private String sqlType2JavaType(String sqlType) {
        if (sqlType.equalsIgnoreCase("bit")) {
            return "boolean";
        } else if (sqlType.equalsIgnoreCase("tinyint")) {
            return "byte";
        } else if (sqlType.equalsIgnoreCase("smallint")) {
            return "short";
        } else if (sqlType.equalsIgnoreCase("int")) {
            return "int";
        } else if (sqlType.equalsIgnoreCase("bigint")) {
            return "long";
        } else if (sqlType.equalsIgnoreCase("float")) {
            return "float";
        } else if (sqlType.equalsIgnoreCase("numeric")
                || sqlType.equalsIgnoreCase("real") || sqlType.equalsIgnoreCase("money")
                || sqlType.equalsIgnoreCase("smallmoney")) {
            return "double";
        } else if (sqlType.equalsIgnoreCase("varchar") || sqlType.equalsIgnoreCase("char")
                || sqlType.equalsIgnoreCase("nvarchar") || sqlType.equalsIgnoreCase("nchar")
                || sqlType.equalsIgnoreCase("text")|| sqlType.equalsIgnoreCase("longtext")) {
            return "String";
        } else if (sqlType.equalsIgnoreCase("datetime")) {
            return "Date";
        } else if (sqlType.equalsIgnoreCase("image")) {
            return "Blod";
         }else if (sqlType.equalsIgnoreCase("decimal")) {
             return "BigDecimal";
         }
        return null;
    }
    /**
     * ���ܣ���ȡ������ʵ�����ڵ�·��Ŀ¼
     * @return
     */
    private static String pkgDirName() {
       String dirName = basePath + "/src/" + packageOutPath.replace(".", "/");
       File dir = new File(dirName);
       if (!dir.exists()) {dir.mkdirs();System.out.println("mkdirs dir ��" + dirName + "��");}
       return dirName;
    }
    /**
     * ����EntityHelper
     */
    private void EntityHelper() {
    	String dirName = MySQLGeneratorEntityUtil.pkgDirName();
    	String javaPath = dirName + "/EntityHelper.java";
       try {
    	   StringBuffer sb = new StringBuffer();
          sb.append("package " + packageOutPath + ";\r\n");
          sb.append("\r\n");
          sb.append("public abstract class EntityHelper{\r\n\r\n");
          sb.append("\tpublic abstract String getPrimaryKey();\r\n");
          sb.append("\r\n");
          sb.append("}\r\n");
			FileWriter fw = new FileWriter(javaPath);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(sb.toString());
          pw.flush();
          if (pw != null){pw.close();}
          System.out.println("create class ��EntityHelper��");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    /**
     * @description ���ɷ���
     */
    private void generate() throws Exception {
        //�����ݿ������
        Connection con;
        PreparedStatement pStemt = null;
        Class.forName(DRIVER);
        con = DriverManager.getConnection(URL, NAME, PASS);
        System.out.println("connect database success..."+con);
        //��ȡ���ݿ��Ԫ����
        DatabaseMetaData db = con.getMetaData();
        //�Ƿ���ָ�����ɱ���ָ����ֱ����ָ����û����ȫ������
        List<String> tableNames = new ArrayList<>();
        if (generateTables == null) {
            //��Ԫ�����л�ȡ�����еı���
            ResultSet rs = db.getTables(null, null, null, new String[] { "TABLE" });
            while (rs.next()) tableNames.add(rs.getString(3));
        } else {
            for (String tableName : generateTables) tableNames.add(tableName);
        }
       if(needEntityHelper) {
         EntityHelper();
        }
        String tableSql;
        PrintWriter pw = null;
        for (int j = 0; j < tableNames.size(); j++) {
            tableName = tableNames.get(j);
            tableSql = SQL + tableName;
            pStemt = con.prepareStatement(tableSql);
            ResultSetMetaData rsmd = pStemt.getMetaData();
            ResultSet rsk = con.getMetaData().getPrimaryKeys(con.getCatalog().toLowerCase(), null, tableName);
            if (rsk.next()) {
           	 String primaryKey = rsk.getString("COLUMN_NAME");
           	 pk=primaryKey;
               }
            int size = rsmd.getColumnCount();
            colNames = new String[size];
            colTypes = new String[size];
            colSizes = new int[size];
            //��ȡ�������Ϣ
            for (int i = 0; i < size; i++) {
                colNames[i] = rsmd.getColumnName(i + 1);
                colTypes[i] = rsmd.getColumnTypeName(i + 1);
                if (colTypes[i].equalsIgnoreCase("datetime"))
                    needUtil = true;
                if (colTypes[i].equalsIgnoreCase("image") || colTypes[i].equalsIgnoreCase("text"))
                    needSql = true;
                colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
            }
            //��ȡ�ֶ�ע��
          ResultSet rsComment = pStemt.executeQuery("show full columns from " + tableName);
          while (rsComment.next()) {
        	  	colNamesComment.put(rsComment.getString("Field"), rsComment.getString("Comment"));
            }
          //��������ʵ��java�ļ�����������
        String content = parse();
          //��������ļ�
        String dirName = MySQLGeneratorEntityUtil.pkgDirName();
        String javaPath = dirName + "/" + under2camel(tableName, true) + ".java";
        FileWriter fw = new FileWriter(javaPath);
        pw = new PrintWriter(fw);
        pw.println(content);
        pw.flush();
        System.out.println("create class ��" + tableName + "��");
        }
        if (pw != null)
            pw.close();
    }
 
    public static void main(String[] args) {
    	MySQLGeneratorEntityUtil instance = new MySQLGeneratorEntityUtil();
    	//instance.basePath=""; //ָ�����ɵ�λ��,Ĭ���ǵ�ǰ����
        try {
        	  instance.generate();
            System.out.println("generate Entity to classes successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
