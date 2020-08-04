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

import com.ThreadStudyCls.ThreadStudyJc;
import com.ThreadStudyCls.userinfo;
import com.alibaba.fastjson.JSON;
import com.cj.entity.CardInsuredperson;
import com.cj.entity.OOrderlog;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class StartStudy {

	public static void main(String[] strings) {

		//集合类的学习
		ArrayListSty();
		synlinkedlist();
		//多线程的学习
		ThreadStudy();
	}
    /*
     * 多线程的学习，实现多线程编程的方式有两种，一种是继承 Thread 类，
     * 另一种是实现 Runnable 接口。使用继承 Thread 类创建线程，最大的局限就是不能多继承，
     * 所以为了支持多继承，完全可以实现 Runnable 接口的方式。需要说明的是，
     * 这两种方式在工作时的性质都是一样的，没有本质的区别
     */
	public static void ThreadStudy() {
		//继承 thread 类
		ThreadStudyJc.main();
		//实现runnable接口
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("实现runnable接口");
				
			}
		}).start();
		//使用同步的list
		var data=Collections.synchronizedList(synlinkedlist());
		 var th1=new Thread(new Runnable() {
				@Override
				public void run() {			
					new ThreadStudyJc().Threadsty(data.get(1));
				}
			});
		 th1.setName("th1");
		 var th2=new Thread(new Runnable() {
				@Override
				public void run() {			
					new ThreadStudyJc().Threadsty(data.get(2));
				}
			});
		 var th3=new Thread(new Runnable() {
				@Override
				public void run() {			
					new ThreadStudyJc().Threadsty(data.get(3));
				}
			});
		 var th4=new Thread(new Runnable() {
				@Override
				public void run() {			
					new ThreadStudyJc().Threadsty(data.get(4));
				}
			});
		 var th5=new Thread(new Runnable() {
				@Override
				public void run() {			
					new ThreadStudyJc().Threadsty(data.get(5));
				}
			});
		  th1.start();
		  th2.start();
		  th3.start();
		  th4.start();
		  th5.start();
		  
			/*
			 * for (int i = 0; i < data.size(); i++) { final int j=i; var th=new Thread(new
			 * Runnable() {
			 * 
			 * @Override public void run() { new ThreadStudyJc().Threadsty(data.get(j)); }
			 * }); th.start();
			 * 
			 * }
			 */
		
		
	}

	public static void Threadsty(userinfo model)
	{
		System.out.println("序号："+model.index+",名称:"+model.name);
	}
	/*
	 * 多线程访问linkedlist集合时解决数据同步的问题
	 */
	public static List<userinfo> synlinkedlist() {
		var lst = Collections.synchronizedList(new LinkedList<userinfo>());
		var count=100;
		var usdata = new userinfo() {
			{
				name = "sdsd1";
				cardid = "522728198511053015";
				sex = "男";
				qqString = "403648571";
			}
		};
		var starttime = System.currentTimeMillis();
		usdata.name="0";
		for (int i = 0; i < count; i++) {
			//usdata.name+=i;
			usdata.index++;
			lst.add(usdata);
		}
		var endtime = System.currentTimeMillis();
		System.out.println("LinkedList同步情况下：" + (endtime-starttime)+"ms");
		
		lst =new LinkedList<userinfo>();
		 starttime = System.currentTimeMillis();
		usdata.name="0";
		for (int i = 0; i < count; i++) {
			var usdatas = new userinfo();
			usdatas.index=i;
			usdatas.name="测试"+i;
			lst.add(usdatas);
		}
	    endtime = System.currentTimeMillis();
		System.out.println("LinkedList异步情况下：" + (endtime-starttime)+"ms");
		return lst;
	}
	/*
	 * Vector的学习，Vector非常类似ArrayList，但是Vector是同步的。由Vector创建的Iterator， 虽然和
	 * ArrayList创建的Iterator是同一接口，但是，因为Vector是同步的，当一个Iterator被创建而且正在被使用， 另一个线程改变了
	 * Vector的状态（例如，添加或删除了一些元素）， 这时调用Iterator的方法时将抛出
	 * ConcurrentModificationException，因此必须捕获该异常
	 */
	public static void VectorSty() {

	}

	/*
	 * ArrayList实现了可变大小的数组。它允许所有元素，包括null。ArrayList没有同步。
	 * size，isEmpty，get，set方法运行时间为常数。但是add方法开销为分摊的常数，添加n个元素需要O(n)的时间。其他的方法运行时间为线性。
	 * 每个ArrayList实例都有一个容量（Capacity），即用于存储元素的数组的大小。这个容量可随着不断添加新元素而自动增加，但是增长算法 并没有定义。
	 * 当需要插入大量元素时，在插入前可以调用ensureCapacity方法来增加ArrayList的容量以提高插入效率。
	 * 和LinkedList一样，ArrayList也是非同步的（unsynchronized）。
	 */
	public static void ArrayListSty() {
		// var alist=new ArrayList<userinfo>();
		var usdata = new userinfo() {
			{
				name = "sdsd1";
				cardid = "522728198511053015";
				sex = "男";
				qqString = "403648571";
			}
		};
		var usdata2 = new userinfo() {
			{
				name = "sdsd1";
				cardid = "522728198511053015";
				sex = "男";
				qqString = "403648571";
			}
		};
		var usdata3 = new userinfo() {
			{
				name = "sdsd1";
				cardid = "522728198511053015";
				sex = "男";
				qqString = "403648571";
			}
		};
		var count = 10000;
		var lst = new ArrayList<userinfo>();
		var starttime = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			usdata.name+=i;
			lst.add(usdata);
		}
		var endtime = System.currentTimeMillis();
		System.out.println("没有使用ensureCapacity：" + (endtime-starttime)+"ms");
		//使用ensureCapacity
		lst.clear();
		lst.ensureCapacity(count);
		starttime = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			usdata2.name+=i;
			lst.add(usdata2);
		}
		endtime = System.currentTimeMillis();
		System.out.println("使用ensureCapacity：" + (endtime-starttime)+"ms");
		//使用LinkedList
		List<userinfo> strings2 = new LinkedList<userinfo>();
		starttime = System.currentTimeMillis();
		usdata.name="0";
		for (int i = 0; i < count; i++) {
			usdata3.name+=i;
			strings2.add(usdata3);
		}
		endtime = System.currentTimeMillis();
		System.out.println("使用LinkedList：" + (endtime-starttime)+"ms");
		
		
	}

	public static void GetMysqlData() {
		try {

			// new MySQLGeneratorEntityUtil().parse();

			var connect = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/fyt_ims?serverTimezone=Asia/Shanghai&useSSL=true", "wen",
					"8991731mawen");// java这个空填写的是你自己设的密码

			System.out.println("Success connect Mysql server!");
			var stmt = connect.createStatement();
			// 链接数据库获取数据
			ResultSet rs = stmt.executeQuery("select * from card_insuredperson"); // user 为你表的名称，可以在MySQL命令行用show
			// 把数据转换为list实体
			List<CardInsuredperson> dt = ResultSetConverter.convert(rs, CardInsuredperson.class);
			// 遍历list
			for (int i = 0; i < dt.size(); i++) {
				// 取出某个字段的值
				var df = dt.get(i).getCardId();
				System.out.println(df);
			}
			// System.out.println(JSON.toJSONString(strs));
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}

	}

}
