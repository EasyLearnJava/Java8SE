package com.easylearnjava.genericsdemo;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List lst = new ArrayList();
		
		lst.add(new Student());
		lst.add(new Student());
		lst.add(new Student());
		lst.add(new Student());
		lst.add(new Machine());
		lst.add(new Machine());
		lst.add(new Machine());
		
		Student std =  (Student) lst.get(0);
		Integer i = (Integer) lst.get(1);
		
		System.out.println("std value : " + std);
		
		
	}
	
	
}
