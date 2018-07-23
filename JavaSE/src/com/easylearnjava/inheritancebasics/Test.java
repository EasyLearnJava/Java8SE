package com.easylearnjava.inheritancebasics;

public class Test {
	
	public static void main(String[] args) {
		Account acc = new Account();
		acc.getBalance(2);
		acc.getInterestRate();
		
		CheckingAccount cAcc = new CheckingAccount();
		cAcc.getBalance(5);
		cAcc.getInterestRate();
		
		SavingsAccount sAcc = new SavingsAccount();
		sAcc.getInterestRate();
	}

}
