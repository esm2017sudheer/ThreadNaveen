package com.sudheer.examples;

public class ThreadDemoJoin extends Thread{

	
	@Override
	public void run() {
		 
		 
		
		 for(int i =0; i<=10;i++)//running state
		 {
			 
			 System.out.println("thread Child:");
			 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 } 
		 
		 //terminate state
	 }
	 
	 
	 public static void main(String[] args) throws InterruptedException {
		 
		 ThreadDemoJoin td = new ThreadDemoJoin();
		 
		 //td.setPriority(3);
		 td.start();
		 
		 
		 
		 
		 for(int i =0; i<=10;i++)//running state
		 {
			 //Thread.yield();
			
			 
			 
			 System.out.println("thread main:");
			
		 } 
		 
		
	}//main()
}//ThreadDemoJoin
