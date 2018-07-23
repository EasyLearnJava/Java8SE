package com.easylearnjava.equalsandhashcode;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {
		
		Student s1 = new Student(5, "raghu", 10);
		Student s2 = new Student(5, "raghu", 10);
		Student s3 = new Student(5, "raghu", 10);
		
		Student s4 = new Student(55, "raghu", 100);

		if(s1 == s2){
			System.out.println("Objects are present in the same memory location...");
		}else{
			System.out.println("Different memory locations...");
		}
		
		if(s1.equals(s2)){
			System.out.println("same data in the objects...");
		}else{
			System.out.println("objects with different data...");
		}
		
		Map map = new HashMap();
		/*map.put(123, "abcd");
		map.put(123, "bbcd");*/
		
		System.out.println();
		System.out.println("hash code for s1 : " + s1.hashCode());
		System.out.println("hash code for s2 : " + s2.hashCode());
		System.out.println("hash code for s3 : " + s3.hashCode());
		System.out.println("hash code for s4 : " + s4.hashCode());
		System.out.println();
		
		map.put(s1, "hello...");
		map.put(s2, "hai...");
		map.put(s4, "aabbcc");
		
		System.out.println("map size is : " + map.size());
		System.out.println("map value for s1 key is : " + map.get(s1));
		System.out.println("map value for s2 key is : " + map.get(s2));
		System.out.println("map value for s3 key is : " + map.get(s3));
		System.out.println("map value for s4 key is : " + map.get(s4));
		
		
		
		
	}

}
