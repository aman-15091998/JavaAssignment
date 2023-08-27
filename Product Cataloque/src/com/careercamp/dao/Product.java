package com.careercamp.dao;

public class Product{
	String prodId;
	String prodName;
	int price, quantity, discount;
	public Product(String prodId, String prodName, int price, int quantity, int discount)
	{
		this.prodId=prodId;
		this.prodName=prodName;
		this.price=price;
		this.quantity=quantity;
		this.discount=discount;
	}
}
