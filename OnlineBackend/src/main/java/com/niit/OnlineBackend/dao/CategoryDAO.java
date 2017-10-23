package com.niit.OnlineBackend.dao;
import java.util.List;

import com.niit.OnlineBackend.model.Category;


public interface CategoryDAO {

	
	
	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
	
}
