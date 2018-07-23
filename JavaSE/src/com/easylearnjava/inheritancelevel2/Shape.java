package com.easylearnjava.inheritancelevel2;

public abstract class Shape {

	//if there is an abstract method in a class then the class also be declared as abstract
	
	public String getColor() {
		return "white";
	}
	
	public abstract double getArea();
	
	
	public Shape(){
		System.out.println("In Shape class default constructor...");
	}

}
