package com.easylearnjava.arraydemo;

public class Test {
	
	public static void main(String[] args) {
		
		int j;
		
		int x =5;
		
		System.out.println("The value of x is : " + x);
		//System.out.println("The value of j : " + j);
		
		//array :- sequential storage of similar kind of data
		int[] arr = new int[5]; 
		
		//int[] a = { a[0], a[1] };
		
		float[] f = new float[7];	
		f[2] = 8.006f;
		
		
		arr[0] = 70;
		arr[1] = 55;
		
		System.out.println("The value at index location 2 is : " + arr[2]);
		System.out.println("The value at index location 2 is : " + f[2]);
		
				
		
	}

}
