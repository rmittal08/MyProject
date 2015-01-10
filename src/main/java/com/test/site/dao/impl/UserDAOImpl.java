package com.test.site.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.test.site.dao.UserDAO;
import com.test.site.model.User;

@Service
public class UserDAOImpl implements UserDAO{

	@PersistenceContext
    private EntityManager em;
	
	
	public Long saveUser(User user) {
		return em.merge(user).getId();
	}

	public User getUser(String username) {
		return em.find(User.class, username);
	}

}
