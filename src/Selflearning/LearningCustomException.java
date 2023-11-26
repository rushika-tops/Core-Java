package Selflearning;


import Selflearning.abstraction.Car;

public class LearningCustomException {
	public static void main(String args[]) throws AccountBalanceException {
		int accountBalance = 2000;
		int withdrawAmount = 2500;
		if (withdrawAmount >  accountBalance) {
			throw new AccountBalanceException("Sorry, insufficient balance.You need more 500 rs to perform this transaction.");
		}else {
			accountBalance = accountBalance - withdrawAmount;
			System.out.println("Withdraw successful");
		}
		
			
	}
	/**
	 * Abstraction
	 * Encapsulation
	 * Polymorphism 
	 */
	
	

}
