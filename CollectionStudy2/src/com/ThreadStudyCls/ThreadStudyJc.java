package com.ThreadStudyCls;
/*
 * 继承Thread类的实现
 */
public class ThreadStudyJc extends Thread {

	@Override
	public void run()
	{
		System.out.println("继承Thread类的实现");
	}
	public static void main()
	{
		ThreadStudyJc th=new ThreadStudyJc();
		th.start();
		
	}
	public static void Threadsty(userinfo model)
	{
		System.out.println("序号："+model.index+",名称:"+model.name);
		long millis=1000;
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
