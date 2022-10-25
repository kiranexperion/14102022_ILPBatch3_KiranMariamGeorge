package com.experion.entity;

public class CurrentAccount extends Account{

	private double currentBalance;

	public CurrentAccount(String accountType, double currentBalance) {
		super(accountType);
		this.currentBalance = currentBalance;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	
}
