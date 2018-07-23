package com.easylearnjava.collectionsdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map map = new HashMap();
		System.out.println(map.size());
		
		map.put(1, "raghu");
		map.put(2, 55);
		map.put(3.2, new Student());
		map.put("abcd", "hello");
		map.put("xyz", 123456);
		map.put(3.2, new Machine());
		map.put("xyz", "naveen");
		
		System.out.println(map.get(2));
		
		Set set = map.keySet();
		System.out.println();
		for(Object obj : set){
			System.out.println("The value for the key : " +  obj + " is : " + map.get(obj));
		}
		
		
		
	}

}
