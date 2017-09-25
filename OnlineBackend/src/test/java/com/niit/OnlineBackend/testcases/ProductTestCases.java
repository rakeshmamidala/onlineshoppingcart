package com.niit.OnlineBackend.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.OnlineBackend.dao.ProductDAO;
import com.niit.OnlineBackend.model.Product;

public class ProductTestCases 
{
	
	private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;

	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.OnlineBackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	/*
	@Test
	public void testGetProduct()
	{
		product=productDAO.get(1);
		assertEquals("Something went wrong while inserting a new product!",true,productDAO.get(1));
	}

	@Test
	public void testAddProduct() 
	{
		
	
		product = new Product();
				
		product.setName("letv 1s");
		product.setBrand("Oppo");
		product.setDescription("This is some description for oppo mobile phones!");
		product.setUnitPrice(25000);
		product.setActive(true);
        product.setCategoryId(4);
		product.setSupplierId(4);
		
		assertEquals("Something went wrong while inserting a new product!",true,productDAO.add(product));		
	}
	
	@Test
	public void testUpdateProduct()
	{
		product = productDAO.get(8);
		product.setName("Samsung Galaxy S7");
		assertEquals("Something went wrong while updating the existing record!",true,productDAO.update(product));		
	}
	
	
	@Test
	public void testDeleteProduct()
	{
		product=productDAO.get(8);
		assertEquals("Something went wrong while deleting the existing record!",true,productDAO.delete(product));		
	}
	
	@Test
	public void testListProduct()
	{
		
		assertEquals("Something went wrong while fetching the list of products!",6,productDAO.list().size());		
	}		
*/
	
	
	@Test
	public void testListActiveProduct() 
	{
	
		assertEquals("Something went wrong while fetching the list of products!",5,productDAO.listActiveProduct().size());				
	} 
	
	/*
	@Test
	public void testListActiveProductByCategory() 
	{
		assertEquals("Something went wrong while fetching the list of products!",3,productDAO.listActiveProductByCategory().size());
		assertEquals("Something went wrong while fetching the list of products!",2,productDAO.listActiveProductByCategory().size());
	} 
	
	@Test
	public void testGetLatestActiveProduct() 
	{
		assertEquals("Something went wrong while fetching the list of products!",3,productDAO.getLatestActiveProducts(3).size());
		
	} 

*/
}
