package com.hibernate.sanket.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.sanket.dao.PizzaDao;
import com.hibernate.sanket.model.Pizza;

@Repository
@Transactional
public class PizzaDaoImpl implements PizzaDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	public List<Pizza> getAllPizza() {
		
		Criteria criteria=sessionFactory.getCurrentSession().createCriteria(Pizza.class);
		
		return criteria.list();
	}

}
