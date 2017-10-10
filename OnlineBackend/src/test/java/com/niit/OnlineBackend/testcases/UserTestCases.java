/*package com.niit.OnlineBackend.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.OnlineBackend.dao.UserDAO;
import com.niit.OnlineBackend.model.User;

public class UserTestCases 
{
   private static AnnotationConfigApplicationContext context;
   
   private static UserDAO userDAO;
   
   private User user;
   
   
   @BeforeClass
   public static void init()
   {
	   
	   context=new AnnotationConfigApplicationContext();
	   context.scan("com.niit.OnlineBackend");
	   context.refresh();
	   
	   userDAO=(UserDAO)context.getBean("userDAO");
	   
   }
   
   @Test
   public void testAddUser()
   {
	   
	   user=new User();
       
	   user.setFirstName("rakesh");
	   user.setLastName("mamidala");
	   user.setEmail("rakesh.maamidaala@gmail.com");
	   user.setPassword("rakesh");
	   user.setContactNumber("9985268529");
	   user.setRole("admin");
	   user.setEnabled(true);
	     
	   assertEquals("something went while inserting a new user",true,userDAO.addUser(user));
   }
  /*
   @Test
   public void testGetByEmail()
   {
	   user= userDAO.getByEmail("rakesh.maamidaala@gmail.com");
	   assertEquals("something went wrong while getting user",true,userDAO.getByEmail("rakesh.maamidaala@gmail.com"));
   }
   }
   */
   
   
