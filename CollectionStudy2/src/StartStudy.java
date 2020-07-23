import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import com.alibaba.fastjson.JSON;
import com.cj.entity.CardInsuredperson;
import com.cj.entity.OOrderlog;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
public class StartStudy {

	public static void main(String[] strings) {
		/*
		 * 【ArrayList】该类也是实现了List的接口，实现了可变大小的数组，随机访问和遍历元素时， 提供更好的性能。该类也是非同步的,在多线程的情况下不要使用。
		 * ArrayList 增长当前长度的50%，插入删除效率低。
		  * 使用情况：频繁访问列表中的某一个元素。只需要在列表末尾进行添加和删除元素操作
		 */
		var lst=new ArrayList<userinfo>()
		{{add(new userinfo() {{name="sdsd1";cardid="522728198511053015";sex="男";qqString="403648571";}});
		add(new userinfo() {{name="sdsd2";cardid="522728198511053015";sex="男";qqString="403648571";}});
		add(new userinfo() {{name="sdsd3";cardid="522728198511053015";sex="男";qqString="403648571";}});
		add(new userinfo() {{name="sdsd4";cardid="522728198511053015";sex="男";qqString="403648571";}});
		add(new userinfo() {{name="sdsd5";cardid="522728198511053015";sex="男";qqString="403648571";}});
		add(new userinfo() {{name="sdsd6";cardid="522728198511053015";sex="男";qqString="403648571";}});
		add(new userinfo() {{name="sdsd7";cardid="522728198511053015";sex="男";qqString="403648571";}});
		}};		
		//Collections.sort((List<T>));//排序
		//把list解析为字符串
		String objStr = JSON.toJSONString(lst);
		//遍历集合
		//System.out.println(objStr);		
		lst.forEach((v)->System.out.println("内容："+v.name));
		/*
		 *【 LinkedList】该类实现了List接口，允许有null（空）元素。主要用于创建链表数据结构， 
		 *该类没有同步方法，如果多个线程同时访问一个List，则必须自己实现访问同步，
		 * 解决方法就是在创建List时候构造一个同步的List
		 * 使用情况：你需要通过循环迭代来访问列表中的某些元素，需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
		 */
		List<userinfo> strings2=new LinkedList<userinfo>();
		strings2.add(new userinfo());
		objStr = JSON.toJSONString(lst);
		//遍历集合
		//System.out.println(objStr);		
		GetMysqlData();
	}
	
	  public static void GetMysqlData() { try {
	  
		  //new MySQLGeneratorEntityUtil().parse();
		  
	  var connect =
	  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fyt_ims?serverTimezone=Asia/Shanghai&useSSL=true","wen","8991731mawen");//java这个空填写的是你自己设的密码
	  
	  System.out.println("Success connect Mysql server!"); 
	  var stmt =connect.createStatement();
	  ResultSet rs =stmt.executeQuery("select * from card_insuredperson"); //user 为你表的名称，可以在MySQL命令行用show
	  
	  //tables；显示 
	  //var data=rs.;
      List<CardInsuredperson> strs=new LinkedList<CardInsuredperson>();
      var metadata=rs.getMetaData();
	  var coms=metadata.getColumnCount();
	  var dt=ResultSetConverter.convert(rs,new CardInsuredperson());
	  System.out.println(dt); 
	  while (rs.next()) 
	  {
		 
		  //System.out.println(rs.get); 
		  for (int i = 0; i < coms; i++) {
			 
		}
		  //System.out.println(rs.getString("OdData").toString()); 
		  var tf=rs.getString("Name").toString();
		 // System.out.println(tf); 
		  //JSONObject jsonObject=JSONObject.fromObject(tf);
		//  var mod=JSON.parseObject(tf, OOrderlog.class);
		// strs.add(mod);
		 


			/*
			 * JSONObject jsonObject = JSONObject.fromObject(tf); JSONObject orderJson =
			 * jsonObject.getJSONObject("order"); CardInsuredperson order =
			 * (CardInsuredperson) JSONObject.toBean(orderJson,CardInsuredperson.class);
			 * System.out.println(order.getCardOrderNo());
			 */
		/*
		 * JSONArray productsJson = jsonObject.getJSONArray("products"); // List
		 * products = JSONArray.toList(productsJson,ProductVo.class); List products =
		 * JSONArray.toList(productsJson, new ProductVo(), new JsonConfig());
		 * System.out.println(((ProductVo)(products.get(0))).getName());
		 * System.out.println(orderJson.get("remark"));
		 * 
		 * JSONObject productJson = productsJson.getJSONObject(0);
		 * System.out.println(productJson.get("name"));
		 */


		//  System.out.println(jsonObject); 
	  }
	  System.out.println(JSON.toJSONString(strs)); 
	  } catch
	  (Exception e) { System.out.print("get data error!"); e.printStackTrace(); } 
	 
	  }
	 
}
