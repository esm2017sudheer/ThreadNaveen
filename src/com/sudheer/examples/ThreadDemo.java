package com.sudheer.examples;

public class ThreadDemo extends Thread
{
	ThreadGroup td2;
	
	/*ThreadDemo(ThreadGroup tg,String threadName)
	{
		super(tg,threadName);
	}*/
	

	 @Override
	public void run() {
		 
		 for(int i =0; i<=11;i++)//running state
		 {
			 
			 System.out.println("thread Child:"+Thread.currentThread().getName());
		 } 
		 
		 //terminate state
	 }

	 
	 public static void main(String[] args) {
		 
		 
		 
		 ThreadGroup threadGroup = new ThreadGroup("sudheer");
			
			
		 ThreadDemo td = new ThreadDemo();
		 //ThreadDemo td = new ThreadDemo(threadGroup,"first");//new state
		 
		 ThreadDemo td1 = new ThreadDemo();
		 
		 td.start();//runnable state
	
		 td1.start();
		 for(int i =0; i<=11;i++)
		 {
			 
			 System.out.println("thread main"+Thread.currentThread().getPriority()+Thread.currentThread().getThreadGroup().getName());
		 } 
		
	}
}//ThreadDemo
