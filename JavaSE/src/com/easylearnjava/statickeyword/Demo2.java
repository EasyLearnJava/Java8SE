package com.easylearnjava.statickeyword;

public class Demo2 {
	
	static{
		System.out.println("This is a static block...");
	}
	
	static{
		System.out.println("This is a second static block...");
	}
	
	static{
		System.out.println("This is a third static block...");
	}

	public Demo2(){
		System.out.println("Default constructor...");
	}
	
	public static void main(String[] args) {
		
		Demo2 d2 = new Demo2();
		System.out.println();
		
		Demo2 d3 = new Demo2();
	}
	
	
}
