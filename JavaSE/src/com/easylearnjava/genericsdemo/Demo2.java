package com.easylearnjava.genericsdemo;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		
		List<Student> lst = new ArrayList<Student>();
		
		lst.add(new Student());
		lst.add(new Student());
		lst.add(new Student());
		lst.add(new Student());
		//lst.add
		/*lst.add(new Machine());
		lst.add(123);
		lst.add("raghu");*/
		
		Student std = lst.get(0);
		//Integer i = (Integer) lst.get(1);
		
		System.out.println("std value : " + std);
		
		List<Integer> aa = new ArrayList<Integer>();
		aa.add(12344);
		
		
		
		
	}
	
	
}
