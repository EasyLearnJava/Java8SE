package com.easylearnjava.statickeyword;

public class Demo4 {

	private int x;
	private static int y;

	public void m1() {

	}

	public static void m2() {

	}

	public void m3() {

		System.out.println(x);
		System.out.println(y);
		m1();
		m2();
		
	}

	public static void m4() {

		m2();
		System.out.println(y);
		
		/*m1();
		System.out.println(x);*/
		
		Demo4 d = new Demo4();
		d.m1();
		System.out.println(d.x);
		
		
	}

}
