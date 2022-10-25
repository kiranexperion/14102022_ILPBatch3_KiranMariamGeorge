package com.experion.entity;

public class LoanAccount extends Account{

	private double loanBalance;

	public LoanAccount(String accountType, double loanBalance) {
		super(accountType);
		this.loanBalance = loanBalance;
	}

	public double getLoanBalance() {
		return loanBalance;
	}

	public void setLoanBalance(double loanBalance) {
		this.loanBalance = loanBalance;
	}
	
	
}
