package com.easylearnjava.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//ArrayList
		//ArrayList arr = new ArrayList();
		
		List lst = new ArrayList();
		List ls = new ArrayList(15);
		
		System.out.println("Size of list lst is : " + lst.size());
		System.out.println("Size of list ls is : " + ls.size());
		
		lst.add(12);
		lst.add(new Student());
		
		Machine m1 = new Machine();
		
		lst.add(m1);
		
		int x =5;
		Integer y =10;
		
		lst.add(x);
		
		System.out.println();
		System.out.println("Size of list lst is : " + lst.size());
		
		
	}
	
	
	public void add(Object a, Object b){
		
	}
	
	

}
