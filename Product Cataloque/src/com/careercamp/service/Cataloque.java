package com.careercamp.service;
import com.careercamp.dao.*;
import java.util.Scanner;
public class Cataloque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p[]=new Product[10];
		Methods m=new Methods();
		Scanner sc=new Scanner(System.in);
		char c=0;
		while(c!='.')
			{
			System.out.println("Choose from the following options: (Press '.' to exit).");
			System.out.println("Enter 1 to add a product.");
			System.out.println("Enter 2 to display all products.");
			System.out.println("Enter 3 to delete a product using product ID.");
			System.out.println("Enter 4 to update a product.");
			System.out.println("Enter 5 to search a product by product id.");
			System.out.println("Enter 6 to search a product by product name.");
			System.out.println("Enter 7 to sort in ascending order by price.");
			System.out.println("Enter 8 to sort in ascending order by discount.");
			String id;
			c=sc.next().charAt(0);
			switch(c)
			{
			case '0': System.out.println("Welcome to the digital product catalogue!");
				break;
			case '1': m.addProduct(p);
				break;
			
			case '2': m.displayAll(p);
				break;
			
			case '3': 
				System.out.print("Enter product id to delete= ");
				id=sc.next();
				m.deleteProductById(p, id);
				break;
				
			case '4':
				System.out.println("Enter the product id:");
				id=sc.next();
				m.updateProduct(p, id);
				break;
			
			case '5': 
				System.out.println("Enter the product id:");
				id=sc.next();
				m.searchById(p, id);
			
			case'6':
				System.out.println("Enter the product name:");
				id=sc.next();
				m.searchByProdName(p, id);
			
			case '7':
				m.displayAscendingPrice(p);
				break;
			
			case '8':
				m.displayAscendingDiscount(p);
				break;
			
			case '.': 
				System.out.println("Catalogue closed!");
				break;
			
			default:
				System.out.println("Not a valid input! Please try again");
			}
		}
		
		
		
	}

}
