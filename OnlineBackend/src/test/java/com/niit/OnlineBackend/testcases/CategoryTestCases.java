package com.niit.OnlineBackend.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.OnlineBackend.dao.CategoryDAO;
import com.niit.OnlineBackend.model.Category;

public class CategoryTestCases
{
   private static AnnotationConfigApplicationContext context;
   
   private static CategoryDAO categoryDAO;
   
   private Category category;
   
   @BeforeClass
   public static void init()
   {
	   context =new AnnotationConfigApplicationContext();
	   context.scan("com.niit.OnlineBackend");
	   context.refresh();
	   categoryDAO=(CategoryDAO)context.getBean("categoryDAO");	   
   }
   
   @Test
   public void testAddCategory()
   {	   
	   category=new Category();
	   category.setName("xxxxx");
	   category.setDescription("tis is some description");
	   category.setImageURL("download6.png");
	   assertEquals("susscefully add a category inside a table",true,categoryDAO.add(category));
	   
   }
 /*
   @Test
   public void testGetCategory()
   {
	   
	   category=categoryDAO.get(1);
	   assertEquals("succesfully fetched single category from table","Television",category.getName()); 
	   
   }
   
   @Test
   public void testUpdateCategory()
   {
	   
	   category=categoryDAO.get(3);
	   category.setName("TV");
	   assertEquals("sucessfully updated a single category in to table",true,categoryDAO.update(category));
	   	   
   }
   
   @Test
   public void testDeleteCategory()
   {
	   
	   category=categoryDAO.get(1);
	   assertEquals("sucessfully delete a category from the table",true,categoryDAO.delete(category));
	   
   }
   
   @Test
   public void testListCategory()
   {
	   assertEquals("sucessfully fetched the list of category from the table",3,categoryDAO.list().size());
   }
   
  */
}
	