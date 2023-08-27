package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		Product prod1 = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		prod1.setNome(sc.nextLine());
		
		System.out.println("Price: ");
		prod1.setPrice(sc.nextDouble());
		
		System.out.println("Quantity in stock: ");
		prod1.addProducts(sc.nextInt());
		
		System.out.println("");
		System.out.println("Product data: " +prod1);
		
		System.out.println("Enter the number of products to be added in stock:  ");
		prod1.addProducts(sc.nextInt());
		
		System.out.println("");
		System.out.println("Product data: " +prod1);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		prod1.removeProducts(sc.nextInt());
		
		System.out.println("");
		System.out.println("Product data: " +prod1);
		
		
		
		
		sc.close();
	}

}
