package com.easylearnjava.equalsandhashcode;

public class Demo {

	public static void main(String[] args) {

		String s1 = "naveen";
		String s2 = "naveev";
		
		String s3 = new String("naveen");
		String s4 = new String("naveen");

		if (s3.equals(s4)) {
			System.out.println("Strings are equal...");
		} else {
			System.out.println("Strings are not equal...");
		}

	}

}
