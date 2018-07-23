package com.easylearnjava.conditionsandloops;

public class ForLoop {

	public static void main(String[] args) {
		
		int j = 5;
		j = j+1;
		j++;
		
		for(int i=1; i<=10; i++){
			System.out.println("The value of i is : " + i);
		}
		
		System.out.println();
		
		// 8 7 6 5 4 
		for(int i=8; i>=4; i--){
			System.out.println("The value of i is : " + i);
		}
		
	}
	
}
