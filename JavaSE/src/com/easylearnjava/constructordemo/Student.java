package com.easylearnjava.constructordemo;

public class Student {

	// Access modifier --> public, private, protected
	// constructor name --> Is exactly same as the class name
	// arguments --> optional
	// body
	

	//java compiler will check if there are any constructors in the class or not -- > no
	//java compiler will write a default constructor for us.
	
	//java complier will not write a default constructor if the user has already it
	
	
	//default constructor...
	public Student(){
		System.out.println("This is a default constructor... or No arguments constructor");
		schoolName = "BHPV";
	}
	
	

	public void test() {
		int i; // local variables --> declared in a class and inside a method
				// local variables will never be initialized to default values
		// System.out.println(i);
	}

	private int id; // instance variables -- >declared in a class out side any
					// method
	private String name; // instance variables are initialized to their default
							// values
	private int age;
	private String schoolName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
