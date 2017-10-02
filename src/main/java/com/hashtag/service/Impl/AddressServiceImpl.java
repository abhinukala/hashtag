package com.hashtag.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashtag.dao.RegisterRepository;
import com.hashtag.model.Address;
import com.hashtag.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private RegisterRepository registerRepository;
	
	@Override
	public String addAddress(Address address) {
		
		registerRepository.save(address);
		System.out.println("Address Inserted");
		return "Successfully inserted record. The hashtag is: " + String.valueOf(address.getHashtag());
	}

}
