package com.flipkart.apple.smartphone;

import java.util.*;

public class Flipkart_Mobiles {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Welcome to Flipkart Online Shopping");
		System.out.println("Select Apple Smartphone from below list");
		System.out.println("1. Iphone 14 Pro Max");
		System.out.println("2. Iphone 14 Pro");
		System.out.println("3. Iphone 14 Pro Plus");
		System.out.println("4. Iphone 14");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Selected Apple Smartphone");
		
		int apple_products = scan.nextInt();
		
		switch (apple_products) {
		case 1 :
			System.out.println("Thank You for Purchase Iphone 14 Pro Max");
			break;
		case 2 :
			System.out.println("Thank You for Purchase Iphone 14 Pro");
			break;
		case 3 :
			System.out.println("Thank You for Purchase Iphone 14 Pro Plus");
			break;
		case 4 :
			System.out.println("Thank You for Purchase Iphone 14");
			break;
		default :
			System.out.println("You Enter Wrong Apple Product");
			break;
		
		}
	}

}
