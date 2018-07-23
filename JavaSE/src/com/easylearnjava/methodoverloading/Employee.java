package com.easylearnjava.methodoverloading;

public class Employee {

	public double getSalary(int empId){
		return 5000;
	}
	
	public double getSalary(float empId){
		return 5000;
	}
	
	/*public int getSalary(int empId){
		return 5000;
	}*/
	
	public double getSalary(int empId, String type){
		return 5500;
	}
	
	public double getSalary(int empId, int noOfDays, int noOfHours, double payRate){
		return 7000;
	}
	
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.getSalary(3, "FT");
		
	}
}
