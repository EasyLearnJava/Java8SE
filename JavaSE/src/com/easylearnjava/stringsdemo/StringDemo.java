package com.easylearnjava.stringsdemo;

public class StringDemo {
	
	public static void main(String[] args) {
				
		String str = "raghu"; // 2000
		String s1 = "raghu"; // 2000
		String s2 = "Raghu"; // 3000
		String s3 = "naveen"; // 4000
		
		str = "ram"; // 5000
		str = "naveen";// 4000
		
		String s4 = new String("raghu"); //6000
		String s5 = new String("raghu"); //7000
		String s6 = new String("mat"); // 8000
		
		//==, equals()
		// == --> compares address
		//equals() --> compares values inside the address locations
		
		if(s4 == s1){
			System.out.println("both are pointing to same address...");
		}else{
			System.out.println("Both are pointing to different memory location...");
		}
		
		if(s1.equals(s4)){
			System.out.println("same value...");
		}else{
			System.out.println("Different value...");
		}
		
		
		
		
		
		
		
		
	}

}
