package com.easylearnjava.inheritancelevel2;

public class Rectangle extends Shape {

	private int length;
	private int breadth;
	
	public Rectangle(int len, int breadth){
		this.length = len;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return this.length * this.breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
