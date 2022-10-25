package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	
	
	public static Product createProduct() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the product code: ");
		String productCode = scanner.nextLine();
		
		
		System.out.println("Enter the product name: ");
		String productName = scanner.nextLine();
		 
		
		System.out.println("Enter the product description: ");
		String productDescription = scanner.nextLine();
		
		
		System.out.println("Enter the product price: ");
		double productPrice = scanner.nextDouble();
		
		
		scanner.nextLine();
		
		System.out.println("Enter the openDate: ");
		String openDate = scanner.nextLine();
		
		
		System.out.println("Enter the validityDate: ");
		String validityDate = scanner.nextLine();
		
		
		System.out.println("Enter the expiryDate: ");
		String expiryDate = scanner.nextLine();
		
		
		System.out.println("Active (ture/false): ");
		boolean active = scanner.nextBoolean();
		
		
		Product product = new Product(productCode,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
		return product;		
	}
	
	

	public static void displayProductDetails(Product productList[]) {

		System.out.println("Product Name" + "			" + "Product Decription" + "				" + "Product Price"
				+ "		" + "Open Date" + "		" + "Expiry Date");
		
		for(Product product:productList) {
			if(product!=null)
			System.out.println(product.getProductName() + "		" + product.getProductDescription() + "			" + product.getProductPrice() + "		"
					+ product.getOpenDate() + "		" + product.getExpiryDate());
		}
		

	}
}