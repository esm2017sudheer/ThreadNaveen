package com.sudheer.examples;

public class ThreadB extends Thread{

	
	int total =0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			
			System.out.println("Child thread starts calculation");
			
			for(int i=0;i<=11;i++)
			{
				
				total=total+i;
				
			}//for
			
			this.notify();
			
		}
		
	}
	
	
}//ThreadB
