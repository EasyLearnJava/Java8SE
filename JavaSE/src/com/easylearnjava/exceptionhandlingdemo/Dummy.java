package com.easylearnjava.exceptionhandlingdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Dummy {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:/java/abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
