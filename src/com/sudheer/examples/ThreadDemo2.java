package com.sudheer.examples;

public class ThreadDemo2  implements Runnable{

	@Override
	public void run() {
		 for(int i =0; i<=11;i++)//running state
		 {
			 
			 System.out.println("thread Child:"+Thread.currentThread().getPriority()+Thread.currentThread().getThreadGroup().getName());
		 } 
		 
		
	}

	
	
 public static void main(String[] args) {
		 
		 
	 	ThreadDemo2 td = new ThreadDemo2();//new state
	 	
	 	 
		 ThreadGroup threadGroup = new ThreadGroup("sudheer");
		
		 
		 
	 	Thread t = new Thread(threadGroup,td);
	 	
	 
	 	t.setPriority(10);
		 
		 t.start();//runnable state
	
		 
		 for(int i =0; i<=11;i++)
		 {
			 
			 System.out.println("thread main"+Thread.currentThread().getPriority());
		 } 
		
	}
}
