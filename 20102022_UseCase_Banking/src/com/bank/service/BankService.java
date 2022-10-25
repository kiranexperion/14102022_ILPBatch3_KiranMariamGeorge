package com.bank.service;

import java.util.ArrayList;

import com.bank.entity.Product;
import com.bank.entity.Service;

public class BankService {

	public ArrayList<Service> createServices()
	{
		ArrayList<Service> allServiceList = new ArrayList<Service>();
		allServiceList.add(new Service("Mobile Banking"));
		allServiceList.add(new Service("ATM Withdrawal"));
		allServiceList.add(new Service("Cash Deposit"));
		allServiceList.add(new Service("Cheque Deposit"));
		
		return allServiceList;

		
	}
	
	public ArrayList<Product> createProduct(ArrayList<Service> allServiceList)
	{
		ArrayList<Product> productList = new ArrayList<Product>();
		createSavingsMaxAccount(allServiceList);
		createLoanAccount(allServiceList);
		createCurrentAccount(allServiceList);
		
		return productList;
	}

	private void createCurrentAccount(ArrayList<Service> allServiceList) {

		
	}

	private void createLoanAccount(ArrayList<Service> allServiceList) {

		ArrayList<Service> 
	}

	private void createSavingsMaxAccount(ArrayList<Service> allServiceList) {
		// TODO Auto-generated method stub
		
	}
}
