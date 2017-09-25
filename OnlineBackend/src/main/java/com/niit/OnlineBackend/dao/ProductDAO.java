package com.niit.OnlineBackend.dao;

import java.util.List;

import com.niit.OnlineBackend.model.Product;

public interface ProductDAO 
{
	
	Product get(int productId);
	
	List<Product> list();
	
	boolean add(Product product);
	
	boolean update(Product product);
	
	boolean delete(Product product);
	
	List<Product> listActiveProduct();
	
	List<Product> listActiveProductByCategory();
	
	List<Product> getLatestActiveProducts(int count);
	
}
