package com.easylearnjava.gettersandsetters;

public class MachineDemo {
	
	public static void main(String[] args) {
		
		Machine mc = new Machine();
		//mc.id = 5;
		
		
		mc.setId(1000); // setting the value for id;
		mc.setName("Challenger");
		
		System.out.println("The value of machine id is : " + mc.getId() );
		
		
	}

}
