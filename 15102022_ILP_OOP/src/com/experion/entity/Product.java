package com.experion.entity;

import java.util.Scanner;

public class Product {

	String productCode;
	String productName;
	String productDescription;
	double productPrice;
	String openDate;
	String validityDate;
	String expiryDate;
	boolean active;

	public void inputProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the product code: ");
		productCode = scanner.nextLine();
		System.out.println("Enter the product name: ");
		productName = scanner.nextLine();
		System.out.println("Enter the product description: ");
		productDescription = scanner.nextLine();
		System.out.println("Enter the product price: ");
		productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter the open date: ");
		openDate = scanner.nextLine();
		System.out.println("Enter the validity date: ");
		validityDate = scanner.nextLine();
		System.out.println("Enter the expiry date: ");
		expiryDate = scanner.nextLine();
		System.out.println("Enter whether the product is active: ");
		active = scanner.nextBoolean();
	}

	public void displayProductDetails() {

		System.out.println("Product Name" + "			" + "Product Decription" + "				" + "Product Price"
				+ "		" + "Open Date" + "		" + "Expiry Date");
		System.out.println(productName + "		" + productDescription + "			" + productPrice + "		" + openDate
				+ "		" + expiryDate);

	}
}
