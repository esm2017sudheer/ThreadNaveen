package com.sudheer.examples;

public class MyThread extends Thread {
	
	Display d;
	
	String name;
	
	MyThread(Display d,String name)
	{
		this.d	=	d;
		this.name	=	name;
	}//MyThread
	
	public void run() {
		d.wish(name);

	}//run()

}//MyThread
