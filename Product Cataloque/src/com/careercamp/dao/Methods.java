package com.careercamp.dao;

public class Methods implements ProductMethods {
	public void addProduct(Product []p)
	{
		String prodId="p"+(int)(Math.random()*1000);
		String prodName="name"+"p"+(int)(Math.random()*100);
		int price=(int)(Math.random()*300), quantity=(int)(Math.random()*100), discount=(int)Math.floor((Math.random()*10))*10;
		Product newProd=new Product(prodId, prodName, price, quantity, discount);
		
		int i=0;
		while(p[i]!=null)
		{
			i++;
		}
		p[i]=newProd;
	}
	public void displayAll(Product []p)
	{
		int i=0;
		System.out.println("Total Products:");
		while(p[i]!=null)
		{
			System.out.println("Product ID= "+p[i].prodId);
			System.out.println("Product Name= "+p[i].prodName);
			System.out.println("Price= "+p[i].price);
			System.out.println("Quantity= "+p[i].quantity);
			System.out.println("Discount= "+p[i].discount);
			System.out.println();
			System.out.println();
			i++;
		}	
	}
	public void deleteProductById(Product p[], String prodId)
	{
		int i=0;
		while(p[i]!=null && !(p[i].prodId.equals(prodId)))
		{
			i++;
		}
		
		if(p[i]==null)
				System.out.println("Product not found!");
		else
		{
			
				p[i]=null;
		
				i++;
				while(p[i]!=null)
				{
					p[i-1]=p[i];
					i++;
				}
			
			System.out.println("Product deleted!");	
		}
	}
	public void updateProduct(Product p[], String id)
	{
		int i=0;
		while(p[i]!=null)
		{
			if(p[i].prodId.equals(id))
			{
				break;
			}
			i++;
		}
		if(p[i]!=null)
		{
			String prodId="p"+(int)(Math.random()*1000);
			String prodName="name"+"p"+(int)(Math.random()*100);
			int price=(int)(Math.random()*300), quantity=(int)(Math.random()*100), discount=(int)Math.floor((Math.random()*10))*10;
			p[i]=new Product(prodId, prodName, price, quantity, discount);
			System.out.println("Product updated!");
		}
		else
		{
			System.out.println("Product not found!");
		}
	}
	public void searchById(Product p[], String id)
	{
		int i=0;
		while(p[i]!=null)
		{
			if(p[i].prodId.equals(id))
			{
				break;
			}
			i++;
		}
		if(p[i]==null)
			System.out.println("Product not found!");
		else
		{
			System.out.println("Product ID= "+p[i].prodId);
			System.out.println("Product Name= "+p[i].prodName);
			System.out.println("Price= "+p[i].price);
			System.out.println("Quantity= "+p[i].quantity);
			System.out.println("Discount= "+p[i].discount);
			System.out.println();
			System.out.println();
		}
	}
	public void searchByProdName(Product p[], String prodName)
	{
		int i=0;
		while(p[i]!=null)
		{
			if(p[i].prodName.equals(prodName))
			{
				break;
			}
			i++;
		}
		if(p[i]==null)
			System.out.println("Product not found!");
		else
		{
			System.out.println("Product ID= "+p[i].prodId);
			System.out.println("Product Name= "+p[i].prodName);
			System.out.println("Price= "+p[i].price);
			System.out.println("Quantity= "+p[i].quantity);
			System.out.println("Discount= "+p[i].discount);
			System.out.println();
			System.out.println();
		}
	}
	public void displayAscendingPrice(Product p[])
	{
		 
			 for(int i=0; p[i]!=null; i++)
		        {
		            int j=i+1;
		            
		            int val;
		            if(p[j]==null)
		            	break;
		            val=(int)p[j].price;
		            System.out.println("after this");
		            while(j-1>-1 && val<p[j-1].price)
		            {
		                p[j].price=p[j-1].price;
		                j--;
		                System.out.println("inner");
		            }
		            p[j].price=val;
		        }
		 displayAll(p);
	}
	public void displayAscendingDiscount(Product p[])
	{
		for(int i=0; p[i]!=null; i++)
        {
            int j=i+1;
            if(p[j]==null)
            	break;
            int val=p[j].discount;
            while(j-1>-1 && val<p[j-1].discount)
            {
                p[j].discount=p[j-1].discount;
                j--;
            }
            p[j].discount=val;
        }
		displayAll(p);
	}
	
	
	
	
	
	
}
