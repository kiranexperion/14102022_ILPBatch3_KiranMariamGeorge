package com.experion.entity;

public class SavingsMaxAccount extends Account{

	private double savingsBalance;

	public SavingsMaxAccount(String accountType, double savingsBalance) {
		super(accountType);
		this.savingsBalance = savingsBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
	
}
