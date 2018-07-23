package com.easylearnjava.collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	private static String s;
	
	public static void main(String[] args) {

		List lst = new ArrayList();
		System.out.println("Size of list lst is : " + lst.size());

		lst.add(10);
		lst.add(2);
		lst.add(3);
		lst.add(s);
		lst.add(s);
		lst.add(101);
		lst.add(22);
		lst.add(34);
		lst.add(s);
		lst.add(106);
		lst.add(2);
		lst.add(3);
		lst.add(s);
		lst.add(105);
		lst.add(2);
		lst.add(3);
		
		System.out.println("Size of list lst is : " + lst.size());
		System.out.println("The element at index 0 is : " + lst.get(11));
		System.out.println();
		for(int i=0; i<lst.size(); i++){
			System.out.println("The elements at index " + i + " are : " + lst.get(i));
		}
		
		System.out.println();
		
		//list is order		
		//list is not sorted
		//list can store duplicate values...
		//can store multiple null values
		
		Iterator itr = lst.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		System.out.println();
		//what is the type of output -- Object
		for(Object abcd : lst){
			System.out.println(abcd);
		}
		
	}

}
