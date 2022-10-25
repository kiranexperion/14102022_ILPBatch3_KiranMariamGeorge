package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Cards;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct(String productType) {
		
		Product product = null;
//		BankServices bankServices = new BankServices("SOB100","Online Banking");
		
		ArrayList <BankServices> bankServices = new ArrayList<BankServices>();
		bankServices.add(new BankServices("SOB100","Online Banking"));
		bankServices.add(new BankServices("SOB200","Mobile Banking"));
		bankServices.add(new BankServices("SOB300","Cash Deposit"));

		
		if(productType.compareTo("Cards")==0)
		{
			product = new Cards("PRDMC100","Master Card","Cards","Master");

		}
		else if(productType.compareTo("Accounts")==0)
		{
			product = new Account("PRDWSA100","Womens Savings Account","Account","Savings Account",bankServices);

		}
		
		return product;
		
	}

	public static void displayProductDetails(ArrayList<Product> productList) {
	
		
		Cards cards = null;
		Account account = null;
		
		System.out.println("Product Code"+"		"+"Product Name"+"		"+"ProductType"+"		"+"Account/Card");
		for(Product product: productList)
		{
			if(product instanceof Cards)
			{
				cards = (Cards)product;
				System.out.println(cards.getProductCode()+"		"+cards.getProductName()+"		"+cards.getProductType()+"		"+cards.getCardType());
			}
			else if (product instanceof Account)
			{
				account = (Account)product;
				System.out.println(account.getProductCode()+"		"+account.getProductName()+"		"+account.getProductType()+"		"+account.getAccountType());

				System.out.println("The list of services are given below");
				for(BankServices bankServices :account.getBankservices())
				{
					System.out.println(bankServices.getServiceName());
				}
			}

		}
		
	}

}