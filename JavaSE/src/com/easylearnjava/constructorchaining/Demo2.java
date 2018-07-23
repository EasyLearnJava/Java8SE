package com.easylearnjava.constructorchaining;

public class Demo2 extends Demo{

	public Demo2(){
		System.out.println("In Demo2 class default constructor...");
	}
	
	public Demo2(int x){
		this("abc", 5f);
		System.out.println("In Demo2 class 1 parameter constructor...");
	}
	
	public Demo2(String x, float y){
		System.out.println("In Demo2 class with 2 parameter constructor...");
	}
	
}
