package com.easylearnjava.inheritancelevel2;

public class Demo {
	
	public static void main(String[] args) {
		
		BBC b = new BBC();
		
		//Shape s = new Shape();
	
		Rectangle r = new Rectangle(5, 2);
		Square s = new Square(3);
	
		Demo d = new Demo();
		d.printShapeName(r);
		d.printShapeName(s);
		
		//d.dummyMethod("abc");
		
		Shape sh = new Rectangle(2, 3);
		double output = sh.getArea();
		System.out.println("Area is : " + output);
		
		sh = new Square(7);
		sh.getArea();
		System.out.println("Area is : " + sh.getArea());
		
		d.printShapeName(sh);
	}
	
	public void dummyMethod(int x){
		
	}
	
	public void printShapeName(Shape ss){
		System.out.println("The shape is : " + ss.getClass().getSimpleName());
	}

}
