package com.hashtag.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hashtag.model.Address;

@Repository
public interface RegisterRepository extends CrudRepository<Address, Integer>{
	
	List<Address> findAll();
		
}
