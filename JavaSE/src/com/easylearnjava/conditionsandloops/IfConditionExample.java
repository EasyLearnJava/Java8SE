package com.easylearnjava.conditionsandloops;

public class IfConditionExample {
	
	public static void main(String[] args) {
		
		int x = 4, y =7;
		
		if(x > y){
			System.out.println("Hi...");
			System.out.println("How are you...");
		}else{
			System.out.println("Did not go in to If condition block...");
		}
		
		
		if(x < 10){
			System.out.println("1111111111111111111111111111111");
		}else if(x == y){
			System.out.println("101010101010101001");
		}else if (x > 10 &&  x < 20){
			System.out.println("222222222222222222222222222222222222");
		}else if (x > 20 && x <30){
			System.out.println("sdjfdkjfbskdfbdskjbfsdkjbfsdjf");
		}else {
			System.out.println("nothing matched....");
		}
		
		
	}

}
