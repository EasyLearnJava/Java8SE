package com.easylearnjava.stringsdemo;

public class Test {

	public static void main(String[] args) {
		
		//s is a variable of type String which can store the value abc.
		//String is immutable in java
		String s = "abc";
		s = "bbc";
		
		
		String s1 = "raghu";  // 2000
		String s2 = "raghu"; // 2000
		String s3 = "raghu"; // 2000
		String s4 = "Raghu"; // 3000
		String s5 = "raghu"; // 2000
		String s6 = "naveen"; // 5000
		
		s2 = "ram"; // 4000
		s6 = "rama"; //6000
		
		String s8 = new String("raghu"); // 7000
		String s9 = new String("raghu"); // 8000
		
		String x ;
		x = "raghu";
		
		// == or equals
		// == --> compare if both reference variables are pointing to same address location or not
		// equals --> checking if values in the memory locations are same or not
		
		if(s1 == s8){
			System.out.println("Same memory location");
		}else{
			System.out.println("Different memory location");
		}
		System.out.println();
		if(s1.equals(s8)){
			System.out.println("Same value");
		}else{
			System.out.println("Different value");
		}
		
		
		
		
		
	}
	
}

