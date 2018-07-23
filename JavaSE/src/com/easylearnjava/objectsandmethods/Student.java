package com.easylearnjava.objectsandmethods;

public class Student {
	
	//Access modifier --> public, private, protected
	//return type --> void, int, float, String
	//method name
	//arguments --> optional
	//body
	// return statement --> optional

	public static void main(String[] args) {
		
		//edu is a reference variable of type Student pointing to a Student object in the memory 
		Student edu = new Student();
		edu.sayHello();
		System.out.println();
		edu.sayHai("naveen");
		System.out.println();
		String str = edu.sendMessage("rr");
		System.out.println("The value sent from the sendMessage is : " + str);
		System.out.println();
		int output = edu.addTwoNumbers(5, 2);
		System.out.println("The sum of 2 numbers is : " + output);
	}

	
	public void sayHello(){		
		System.out.println("Hello Student...");
		System.out.println("Welcome to BHPV school...");
	}
	
	public void sayHai(String name){
		System.out.println("Hello " + name);
		System.out.println("Welcome to BHPV school...");
	}
	
	public String sendMessage(String name){
		System.out.println("Hello " + name);
		System.out.println("Welcome to BHPV school...");
		return "a simple hello message...";
	}
	
	public int addTwoNumbers(int x, int y){
		return x + y;
	}
	
	public void abc(int a, String b, float y, double d){
		
	}
	
	// 1. Creating methods
	// 2. Calling methods
	
	
	
	
	
	
	
	
	

}
