package com.sudheer.examples;

public class ThreadA {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadB b = new ThreadB();
		
		b.start();
		
		synchronized (b) {

			
			System.out.println("Main thread waiting for b object");
			
			b.wait();
			
			System.out.println("child thread notified");
			
			System.out.println("total:"+b.total);
			
			
			System.out.println("total:"+b.total);	
			System.out.println("total:"+b.total);	
			System.out.println("total:"+b.total);	
			System.out.println("total:"+b.total);
		}
		
		
		
		
	}//main

}///ThreadA
