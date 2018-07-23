package com.easylearnjava.comparisiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		Student s1 = new Student(5, "raghu", 10);
		Student s2 = new Student(3, "naveen", 11);
		Student s3 = new Student(4, "ram", 9);

		List<Student> lst = new ArrayList<Student>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);

		for (Student std : lst) {
			System.out.println(std);
		}
		
		Collections.sort(lst);
		
		System.out.println();
		for (Student std : lst) {
			System.out.println(std);
		}
		
		Collections.sort(lst, new StudentAgeComparator());
		System.out.println();
		for (Student std : lst) {
			System.out.println(std);
		}
		
		Collections.sort(lst, new StudentNameComparator());
		System.out.println();
		for (Student std : lst) {
			System.out.println(std);
		}

	}

}
