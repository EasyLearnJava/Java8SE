package com.easylearnjava.exceptionhandlingdemo;

public class Sample {
	
	public static void main(String[] args) {
		
		try{
			
			int[] arr = new int[4];
			arr[7] = 33;
			System.out.println("hi");
			String s = null;
			s.getClass();
			System.out.println(5 / 0);
			System.out.println("bye");
			System.out.println("Close DB connection");			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//if db connection is not closed  then execute line 21
			System.out.println("Close DB connection in finally block...");
		}
		
	}

}
