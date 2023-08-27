package com.careercamp.dao;

public interface ProductMethods {
	void addProduct(Product []p);
	void displayAll(Product []p);
	void deleteProductById(Product p[], String prodId);
	void updateProduct(Product p[], String id);
	void searchById(Product p[], String propId);
	void searchByProdName(Product p[], String prodName);
	void displayAscendingPrice(Product p[]);
	void displayAscendingDiscount(Product p[]);
}
