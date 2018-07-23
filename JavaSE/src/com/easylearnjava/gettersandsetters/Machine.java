package com.easylearnjava.gettersandsetters;

public class Machine {

	private int id;
	private String name;

	public static void main(String[] args) {

		Machine m1 = new Machine();
		m1.id = 4;
		m1.name = "mustang";

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
	
	//getters  -- get -- retrieve the data for the variable
	//setters  -- set -- to set the data for the variable
	
	
	
	
	
}
