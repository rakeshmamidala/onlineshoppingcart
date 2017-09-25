package com.niit.OnlineBackend.daoimpl;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.OnlineBackend.dao.UserDAO;
import com.niit.OnlineBackend.model.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO 
{
    @Autowired
	private SessionFactory sessionFactory;
    
	@Override
	public boolean addUser(User user) 
	{
		try
		{
			sessionFactory.getCurrentSession().persist(user);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User getByEmail(String email) 
	{
	    String selectQuery="From USER WHERE email=:email";
	    try
	    {
	    	return sessionFactory.getCurrentSession().createQuery(selectQuery,User.class).setParameter("email",email).getSingleResult();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	return null;
	    }
	    	
	}

	
	
}
