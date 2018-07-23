package com.easylearnjava.statickeyword;

public class Student {

	private String name; //Instance variable
	private static String schoolName; //class level variable

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}

}
