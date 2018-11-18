package com.sudheer.examples;

public class SynchrinisedDemo {

	public static void main(String[] args) {
		
		
		Display d = new Display();
		
		MyThread t1 = new MyThread(d, "aaaaa");
		
		MyThread t2= new MyThread(d, "ccccc");
		
		t1.start();
		
		t2.start();

	}

}
