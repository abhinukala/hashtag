package com.hashtag.configuration;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HashtagConfiguration {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	@Bean
	public SessionFactory sessionFactory() {
		return this.entityManagerFactory.unwrap(SessionFactory.class);
	}
}
