package com.easylearnjava.constructordemo;

public class Machine {

	private int id;
	private String name;
	private String brand;
	
	//is there a constructor ?? if yes compiler will not give you any thing
	//is there a constructor ?? if no the compiler will give only default constructor
		
	public Machine(){
		this.brand = "GE";
	}
	
	public Machine(String carName){
		this.name = carName;
	}
	
	public Machine(int id, String carName, String brandName){
		this.id = id;
		this.name = carName;
		this.brand = brandName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
