package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.CurrentAccount;
import com.experion.entity.Customer;
import com.experion.entity.LoanAccount;
import com.experion.entity.SavingsMaxAccount;

public class BankServices {

	public static Customer createAccounts(ArrayList<Customer> customerList) {
		
		char choice;
		int accChoice;
		Scanner scanner = new Scanner(System.in);
		Customer customer =null;
		ArrayList <Account> accountList =null;
		String customerCode;
		String customerName;
		String accountType;
		double balance = 0.0;
		System.out.println("Are you a new customer (y/n) ?");
		choice = scanner.next().charAt(0);
		if(choice=='y'||choice=='Y')
		{
			System.out.println("You are not yet a customer....Create your first account");

			System.out.println("1. Savings Max Account");
			System.out.println("2. Current Account");
			System.out.println("3. Loan Account");
			System.out.println("Enter your choice: ");
			accChoice = scanner.nextInt();
			
			System.out.println("Enter the customer code:");
			customerCode = scanner.nextLine();
			System.out.println("Enter the customer name:");
			customerName = scanner.nextLine();
			
			switch (accChoice) {
			case 1:
				accountType = "Savings Max Account";
				
				Account savings = new SavingsMaxAccount(accountType,balance);
				accountList.add(savings);
				customer = new Customer(customerCode,customerName,accountList);
				break;
			
			case 2:
				accountType = "Current Account";
				
				Account current= new CurrentAccount(accountType,balance);
				accountList.add(current);
				customer = new Customer(customerCode,customerName,accountList);
				break;

			case 3:
				accountType = "Loan Account";
				
				Account loan= new LoanAccount(accountType,balance);
				accountList.add(loan);
				customer = new Customer(customerCode,customerName,accountList);
				break;

			default:
				System.out.println("Invalid choice");
			}
			

		}
		else
		{
			System.out.println("Enter the customer code:");
			customerCode = scanner.nextLine();
			
			for(Customer loopCustomer:customerList)
			{
				if(customerCode.compareTo(loopCustomer.getCustomerCode())==0)
				{
					System.out.println("1. Savings Max Account");
					System.out.println("2. Current Account");
					System.out.println("3. Loan Account");
					System.out.println("Enter your choice: ");
					accChoice = scanner.nextInt();
					
					switch (accChoice) {
					case 1:
						accountType = "Savings Max Account";
						
						Account savings = new SavingsMaxAccount(accountType,balance);
						
						accountList.add(savings);
						customer = new Customer(customerCode,customerName,accountList);
						break;
					
					case 2:
						accountType = "Current Account";
						
						Account current= new CurrentAccount(accountType,balance);
						accountList.add(current);
						customer = new Customer(customerCode,customerName,accountList);
						break;

					case 3:
						accountType = "Loan Account";
						
						Account loan= new LoanAccount(accountType,balance);
						accountList.add(loan);
						customer = new Customer(customerCode,customerName,accountList);
						break;

					default:
						System.out.println("Invalid choice");
					}
				}
			}
		}
		
		
		return customer;
		
//		Account account = null;
//		BankServices bankServices = new BankServices("SOB100","Online Banking");
//		
//		ArrayList <BankServices> bankServices = new ArrayList<BankServices>();
//		bankServices.add(new BankServices("SOB100","Online Banking"));
//		bankServices.add(new BankServices("SOB200","Mobile Banking"));
//		bankServices.add(new BankServices("SOB300","Cash Deposit"));
//
//		
//		if(productType.compareTo("Cards")==0)
//		{
//			product = new Cards("PRDMC100","Master Card","Cards","Master");
//
//		}
//		else if(productType.compareTo("Accounts")==0)
//		{
//			product = new AccountOld("PRDWSA100","Womens Savings Account","Account","Savings Account",bankServices);
//
//		}
//		
//		return account;
		
	}
	
	public void chooseAccount()
	{
		
	}
	
	
	public static void manageAccounts() {
		
	}

	public static void displayAccounts(ArrayList<Account> accountList) {
	
		
//		Cards cards = null;
//		AccountOld account = null;
//		
//		System.out.println("Product Code"+"		"+"Product Name"+"		"+"ProductType"+"		"+"Account/Card");
//		for(Product product: productList)
//		{
//			if(product instanceof Cards)
//			{
//				cards = (Cards)product;
//				System.out.println(cards.getProductCode()+"		"+cards.getProductName()+"		"+cards.getProductType()+"		"+cards.getCardType());
//			}
//			else if (product instanceof AccountOld)
//			{
//				account = (AccountOld)product;
//				System.out.println(account.getProductCode()+"		"+account.getProductName()+"		"+account.getProductType()+"		"+account.getAccountType());
//
//				System.out.println("The list of services are given below");
//				for(BankServices bankServices :account.getBankservices())
//				{
//					System.out.println(bankServices.getServiceName());
//				}
//			}
//
//		}
		
	}

}