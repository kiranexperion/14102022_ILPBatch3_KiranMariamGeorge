package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.service.BankServices;

public class BankUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char mainChoice;

		Scanner scanner = new Scanner(System.in);
		// Product productList[]=new Product[3];
		// here instead of creating object array create a ArrayList for multiple object
		// creation
//		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customer = null;
		do {
			System.out.println("*******Welcome to the Bank*******");
			System.out.println("1. Create Accounts");
			System.out.println("2. Manage Accounts");
			System.out.println("3. Display Accounts");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
//				customerList.add(BankServices.createAccounts(customerList));
				customer = BankServices

				break;

			case 2:
				BankServices.manageAccounts();
				break;

			case 3:
				BankServices.displayAccounts(customerList);
				break;

			case 4:
				System.out.println("Thank you for choosing our Banking...You are now exiting from this portal.");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
			}

			System.out.println("Do you want to continue y/n");
			mainChoice = scanner.next().charAt(0);

		} while (mainChoice == 'y' || mainChoice == 'Y');
	}
}