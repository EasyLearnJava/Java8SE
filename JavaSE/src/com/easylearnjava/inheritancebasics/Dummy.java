package com.easylearnjava.inheritancebasics;

public class Dummy {

	public static void main(String[] args) {

		int x = 5;
		x = 7;

		//left side of equals at compile time
		
		
		// acc is a reference variable of type Account
		// acc is pointing to an Account object in memory
		Account acc = new Account();
		acc.getBalance(1);
		acc.getInterestRate();

		// acc is a reference variable of type Account
		// acc is pointing to an CheckingAccount object in memory
		acc = new CheckingAccount();
		acc.getBalance(23);
		acc.getInterestRate();
		
		// acc is a reference variable of type Account
		// acc is pointing to an SavingAccount object in memory
		acc = new SavingsAccount();
		acc.getBalance(23);
		acc.getInterestRate();	
		
		// acc is a reference variable of type Account
		// acc is pointing to an SpecialSavingsAccount object in memory
		acc = new SpecialSavingsAccount();
		acc.getBalance(23);
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
