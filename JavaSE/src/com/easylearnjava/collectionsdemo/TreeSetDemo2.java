package com.easylearnjava.collectionsdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		Set set = new TreeSet();
		System.out.println(set.size());
		String s = null;
		
		
		set.add(12);
		set.add(15);
		//set.add("raghu");
		//set.add("naveen");
		//set.add(s);
		set.add(55);
		set.add(79);	
		set.add(44);
		set.add(112);
		set.add(155);
		//set.add(s);
		//set.add(s);
		//set.add(s);
		set.add(55);
		set.add(759);
		set.add(12);
		set.add(15);
		//set.add(s);
		set.add(55);
		set.add(79);
		
		System.out.println("size of set : " +  set.size());
		
		System.out.println(set.add(111));
		System.out.println(set.add(111));
		
		
		System.out.println();
		for(Object te : set){
			System.out.println(te);
		}
		
		
		//is sorted
		//not ordered
		//no duplicates
		// no null values
		
		
		
	}
	
	
}
