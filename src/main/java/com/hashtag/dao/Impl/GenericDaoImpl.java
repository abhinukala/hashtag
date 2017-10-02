package com.hashtag.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hashtag.dao.GenericDao;

public class GenericDaoImpl<T> implements GenericDao<T>{

private final Class<T> persistentClass;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected GenericDaoImpl(final Class<T> entityClass) {
		super();
		this.persistentClass = entityClass;
	}
	public Class<T> getPersistentClass(){
		return this.persistentClass;
	}
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public List<T> getAll() {
		
		return this.getSession().createCriteria(this.getPersistentClass()).
				setCacheable(true).list();
	}
}
