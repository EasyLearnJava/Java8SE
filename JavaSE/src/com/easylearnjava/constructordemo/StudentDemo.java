package com.easylearnjava.constructordemo;

public class StudentDemo {

	public static void main(String[] args) {

		Student std = new Student();

		Student s1 = new Student();
		System.out.println();
		System.out.println("The new student s1 school name is : " + s1.getSchoolName());
		
		
		std.test();
		System.out.println();
		System.out.println("id : " + std.getId());
		System.out.println("name : " + std.getName());
		System.out.println("age : " + std.getAge());
		System.out.println("school name : " + std.getSchoolName());
	}

}
