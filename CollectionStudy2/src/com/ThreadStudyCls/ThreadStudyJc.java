package com.ThreadStudyCls;
/*
 * �̳�Thread���ʵ��
 */
public class ThreadStudyJc extends Thread {

	@Override
	public void run()
	{
		System.out.println("�̳�Thread���ʵ��");
	}
	public static void main()
	{
		ThreadStudyJc th=new ThreadStudyJc();
		th.start();
		
	}
	public static void Threadsty(userinfo model)
	{
		System.out.println("��ţ�"+model.index+",����:"+model.name);
		long millis=1000;
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
