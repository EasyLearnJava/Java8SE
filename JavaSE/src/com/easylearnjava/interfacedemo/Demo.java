package com.easylearnjava.interfacedemo;

public class Demo {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.eat();
		cat.drink();
		//cat.killForSurvival();
		cat.buyDress();
		cat.getMakeUp();
		cat.eatWithHumans();
		cat.takeForAWalk();
		
		Tiger tiger = new Tiger();
		tiger.killForSurvival();
		tiger.eat();
		tiger.drink();
		
	}

}
