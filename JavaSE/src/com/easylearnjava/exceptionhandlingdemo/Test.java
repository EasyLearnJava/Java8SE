package com.easylearnjava.exceptionhandlingdemo;

public class Test {

	public static void main(String[] args) {

		try {

			int[] arr = new int[4];
			arr[7] = 33;
			System.out.println("hi");
			String s = null;
			s.getClass();
			System.out.println(5 / 0);
			System.out.println("bye");

		} catch (NullPointerException ex) {
			System.out.println("this is from the null pointer exception block...");
			ex.printStackTrace();
		} catch (ArithmeticException ex) {
			System.out.println("this is from the arithmetic exception block...");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("this is from the exception block...");
			ex.printStackTrace();
		}

		System.out.println("After the try catch block...");
	}

}
