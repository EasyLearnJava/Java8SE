package com.easylearnjava.inheritancebasics;

public class Demo {

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.getBalance(1);
		acc.getInterestRate();
		
		CheckingAccount cAcc = new CheckingAccount();
		cAcc.getBalance(2);
		cAcc.getInterestRate();
		
		
		SavingsAccount sAcc = new SavingsAccount();
		sAcc.getBalance(3);
		sAcc.getInterestRate();
		sAcc.sendGifts();
		
		SpecialSavingsAccount spSAcc = new SpecialSavingsAccount();
		spSAcc.getBalance(4);
		spSAcc.getInterestRate();
		spSAcc.sendGifts();
		
		
		
		
	}
	
}
