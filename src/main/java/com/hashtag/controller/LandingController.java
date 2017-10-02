package com.hashtag.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hashtag.model.Address;
import com.hashtag.service.AddressService;

@RestController
public class LandingController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/request")
	public String addAddress(@RequestBody Address address) throws Exception{
		if (address != null) {

			RestTemplate restTemplate = new RestTemplate();
			String url =  "https://maps.googleapis.com/maps/api/geocode/json?address="
					+address.getUriBuilder()+"&key=AIzaSyCbMXn4Ki-AzXVJJ7mAdkmRHyEYH8_PBH0";
			System.out.println(url);
			String result = restTemplate.getForObject(url, String.class);
			System.out.println(result);
			JSONObject obj = new JSONObject(result);
			JSONArray res = obj.getJSONArray("results"); 
			System.out.println(res);
			String status = obj.optString("status");
			System.out.println(status);
			JSONObject resultsObj = res.getJSONObject(0);
			System.out.println(resultsObj);
			
			if (status.equals("OK")) {
				JSONObject geometry = resultsObj.getJSONObject("geometry");
				System.out.println(geometry);
				JSONObject location = geometry.getJSONObject("location");
				String lat = location.getString("lat");
				String lon = location.getString("lng");
				System.out.println(location);
				address.setLat(Double.valueOf(lat));
				address.setLon(Double.valueOf(lon));
//				address.setLat(lo);
				
				addressService.addAddress(address);
			}
			
		}
	    else {
	    		System.out.println("Not a valid address");
	    }
		return String.valueOf(address.getHashtag());
	}

}
