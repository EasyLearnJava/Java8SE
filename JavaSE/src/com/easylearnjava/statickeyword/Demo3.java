package com.easylearnjava.statickeyword;

public class Demo3 {

	public static void main(String[] args) {
		
		Student.setSchoolName("BHPV");
		
		Student s1 = new Student();
		s1.setName("raghu");
		//s1.setSchoolName("BHPV");
		
		
		
		Student s2 = new Student();
		s2.setName("naveen");
		
		Student.setSchoolName("VIKAS");
		
		Student s3 = new Student();
		s3.setName("ram");

		System.out.println("s1 school name : " + s1.getSchoolName());
		System.out.println("s2 school name : " + s2.getSchoolName());
		System.out.println("s3 school name : " + s3.getSchoolName());
		
	}
	
	
}
