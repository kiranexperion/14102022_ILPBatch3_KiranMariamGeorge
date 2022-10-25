package com.bank.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Service;
import com.bank.service.BankService;

public class BankUtility {

	public static void main(String[] args) {


		char mainChoice;
		Customer customer = null;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Service> allServicesList = new ArrayList<Service>();
		allServicesList = BankService.createServices();


		do {
			System.out.println("*******Welcome to the Bank*******");
			System.out.println("1. Create Accounts");
			System.out.println("2. Manage Accounts");
			System.out.println("3. Display Accounts");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();

			scanner.nextLine();
			switch (choice) {
			case 1:
				customer = BankService.createAccounts(allServicesList);
				break;

			case 2:
				System.out.println("Enter the customer code: ");
				String customerCode = scanner.nextLine();
				if (customer != null) {
					if (customerCode.compareTo(customer.getCustomerCode()) == 0)
						BankService.manageAccounts(customer);
					else
						System.out.println("Customer code not found!!");

				} 
				else
					System.out.println("Customer code not found!!");
				break;

			case 3:
				BankService.displayAccounts(customer);
				break;

			case 4:
				System.out.println("Thank you for choosing our Bank...You are now exiting from this portal.");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
			}


			System.out.println("Do you want to continue to other bank services? (y/n)");
			mainChoice = scanner.next().charAt(0);

		} while (mainChoice == 'y' || mainChoice == 'Y');

	}
}
