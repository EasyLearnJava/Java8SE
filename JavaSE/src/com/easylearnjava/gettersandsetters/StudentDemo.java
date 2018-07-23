package com.easylearnjava.gettersandsetters;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student std = new Student();
		std.id = 10;  // --> setting the value for id property
		std.name = "ram";
		std.age = 11111;
		
		System.out.println("The value of id is : " + std.id); // --> retrieving/getting the value of id
	}
	
}
