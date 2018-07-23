package com.easylearnjava.conditionsandloops;

public class BreakStatement {
	
	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++){
			
			System.out.println();
			System.out.println("Before priniting i value...");
			System.out.println("The value of i is : " + i);
			System.out.println("After printing i value...");
			
			if(i == 5){
				break;
			}
			
		}
		
	}

}
