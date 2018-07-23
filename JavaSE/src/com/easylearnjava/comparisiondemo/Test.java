package com.easylearnjava.comparisiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		
		lst.add(12);
		lst.add(34);
		lst.add(17);
		lst.add(4);
		lst.add(99);
		lst.add(2);
		
		for(Integer i : lst){
			System.out.println("The value is : " + i);
		}
		
		Collections.sort(lst);
		
		System.out.println();
		for(Integer i : lst){
			System.out.println("The value is : " + i);
		}
		
		
	}
	
}
