import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.alibaba.fastjson.JSON;
import com.sun.xml.internal.fastinfoset.util.ValueArrayResourceException;
public class StartStudy {

	public static void main(String[] strings) {
		/*
		 * ��ArrayList������Ҳ��ʵ����List�Ľӿڣ�ʵ���˿ɱ��С�����飬������ʺͱ���Ԫ��ʱ�� �ṩ���õ����ܡ�����Ҳ�Ƿ�ͬ����,�ڶ��̵߳�����²�Ҫʹ�á�
		 * ArrayList ������ǰ���ȵ�50%������ɾ��Ч�ʵ͡�
		  * ʹ�������Ƶ�������б��е�ĳһ��Ԫ�ء�ֻ��Ҫ���б�ĩβ������Ӻ�ɾ��Ԫ�ز���
		 */
		var lst=new ArrayList<userinfo>()
		{{add(new userinfo() {{name="sdsd1";cardid="522728198511053015";sex="��";qqString="403648571";}});
		add(new userinfo() {{name="sdsd2";cardid="522728198511053015";sex="��";qqString="403648571";}});
		add(new userinfo() {{name="sdsd3";cardid="522728198511053015";sex="��";qqString="403648571";}});
		add(new userinfo() {{name="sdsd4";cardid="522728198511053015";sex="��";qqString="403648571";}});
		add(new userinfo() {{name="sdsd5";cardid="522728198511053015";sex="��";qqString="403648571";}});
		add(new userinfo() {{name="sdsd6";cardid="522728198511053015";sex="��";qqString="403648571";}});
		add(new userinfo() {{name="sdsd7";cardid="522728198511053015";sex="��";qqString="403648571";}});
		}};		
		//Collections.sort((List<T>));//����
		//��list����Ϊ�ַ���
		String objStr = JSON.toJSONString(lst);
		//��������
		System.out.println(objStr);		
		lst.forEach((v)->System.out.println("���ݣ�"+v.name));
		/*
		 *�� LinkedList������ʵ����List�ӿڣ�������null���գ�Ԫ�ء���Ҫ���ڴ����������ݽṹ�� 
		 *����û��ͬ���������������߳�ͬʱ����һ��List��������Լ�ʵ�ַ���ͬ����
		 * ������������ڴ���Listʱ����һ��ͬ����List
		 * ʹ�����������Ҫͨ��ѭ�������������б��е�ĳЩԪ�أ���ҪƵ�������б�ͷ���м䡢ĩβ��λ�ý�����Ӻ�ɾ��Ԫ�ز�����
		 */
		
		
	}
}
