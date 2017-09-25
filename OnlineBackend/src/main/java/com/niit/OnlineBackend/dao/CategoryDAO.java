package com.niit.OnlineBackend.dao;

import java.util.List;

import com.niit.OnlineBackend.model.Category;

public interface CategoryDAO 
{
  List<Category> list();
  
  Category get(int id);
    
  boolean add(Category category);
  
  boolean update(Category category);
  
  boolean delete(Category category);
}
