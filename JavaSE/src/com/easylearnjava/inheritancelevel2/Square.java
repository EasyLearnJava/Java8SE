package com.easylearnjava.inheritancelevel2;

public class Square extends Shape {

	private int side;

	public Square(int s){
		this.side =s;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.side * this.side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
