package com.easylearnjava.exceptionhandlingdemo;

public class ThrowDemo {

	public static void main(String[] args) {
		ThrowDemo td = new ThrowDemo();
		
		
		try {
			td.devide(5, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println("devide done successfully..");
	}

	public void devide(int a, int b) throws Exception {
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Denominator cannot be zero...");
		}
	}

}
