package com.easylearnjava.objectsandmethods;

public class Demo {
	
	String ss = "abc";

	public static void main(String[] args) {
		
		Student std = new Student();
		std.sayHello();
		std.abc(5, "abc", 5.2f, 6.8);
		
		int output = std.addTwoNumbers(2, 3);
		System.out.println("After calling addTwo Numbers the out put is : " + output);
		
	}
	
}
