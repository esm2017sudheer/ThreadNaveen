package com.sudheer.examples;

import java.util.ArrayList;

import com.sudheer.examples2.A;

public class Display {
	
	ArrayList<String> al = new ArrayList<>();
	
	
	
	//A a = new A();
	public void wish(String name)	
	{
		
		al.add("aaaaaaaaaaaaa");
		al.add("aaaaaaaaaaaaa");
		al.add("aaaaaaaaaaaaa");
		al.add("aaaaaaaaaaaaa");
		
		System.out.println(Thread.currentThread().getName());
		
		synchronized (Display.class) {
			
			for(int i=0;i<al.size();i++)
			{
				
				System.out.println("Hello:"+al+"-"+Thread.currentThread().getName());
			}//for()
			
		}
	
	}//wish()
}//Display