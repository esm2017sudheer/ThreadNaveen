package com.sudheer.examples;

public class ThreadYieldDemo extends Thread{

	
	 @Override
	public void run() {
		 
		 
		
		 for(int i =0; i<=1000;i++)//running state
		 {
			 
			 System.out.println("thread Child:");
		 } 
		 
		 //terminate state
	 }
	 
	 
	 public static void main(String[] args) {
		 
		 ThreadYieldDemo td = new ThreadYieldDemo();
		 
		 //td.setPriority(3);
		 td.start();
		 
		 
		 
		 
		 for(int i =0; i<=1000;i++)//running state
		 {
			 //Thread.yield();
			 
			 System.out.println("thread main:");
		 } 
		 
		
	}//main()

}//ThreadYieldDemo
