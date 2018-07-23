package com.easylearnjava.constructordemo;

public class Test {
	
	public static void main(String[] args) {
		
		Machine mac = new Machine();
		
		System.out.println("Brand name : " + mac.getBrand());
		System.out.println("id : " + mac.getId());
		
		Machine m1 = new Machine(); // calling default constructor
		System.out.println("The car name : " + m1.getName());
		
		
		Machine m2 = new Machine("Ford");
		System.out.println("The car name : " + m2.getName());
		
		
		Machine m3 = new Machine(1, "Dodge", "GM");
		System.out.println("id is : " + m3.getId());
		
	}

}
