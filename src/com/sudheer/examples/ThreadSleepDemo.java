package com.sudheer.examples;

public class ThreadSleepDemo extends Thread {

	 @Override
		public void run() {
			 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			 for(int i =0; i<=1000;i++)//running state
			 {
				 
				 System.out.println("thread Child:");
			 } 
			 
			 //terminate state
		 }
	
	public static void main(String[] args) throws InterruptedException {

		ThreadSleepDemo td = new ThreadSleepDemo();
		
		td.start();
		
		
				
				 for(int i =0; i<=1000;i++)//running state
				 {
					 
					 System.out.println("thread main:");
				 } 
				 
	}

}
