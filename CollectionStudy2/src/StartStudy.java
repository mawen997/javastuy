import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.sun.beans.introspect.PropertyInfo.Name;
public class StartStudy {

	public static void main(String[] strings) {
		//使用arraylist进行装箱和解析以及了解json的解析
		var lst=new ArrayList<userinfo>();
		var lm=new userinfo();
		lm.name="sdsd";
		lm.cardid="522728198511053015";
		lst.add(lm);	
		//Collections.sort((List<T>));//排序
		//把list解析为字符串
		String objStr = JSON.toJSONString(lst);
		System.out.println(objStr);		
		
	}
}
