package com.ycai.foursquare.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VenueService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private final static String apiUrl = "https://api.foursquare.com/v2/venues/search?client_id=%s&client_secret=%s&v=%s&ll=40.7,-74&query=sushi";
	private final static String clientId = "3YDA54LX4FLNLGWNIXUM1AULMSCRRJCYVDK3X0CR2QESIOPT";
	private final static String clientSecret = "PQZV2DE0X5STSSIDPWK2YY345SFTV0RFSG1QMCGOAANDCR2Z";
	private final static String version = "20170519";
	
	public Object search() {
		String[] args = {clientId, clientSecret, version};
		String url = String.format(apiUrl, args);
		return restTemplate.getForObject(url, Object.class);
	}

}
