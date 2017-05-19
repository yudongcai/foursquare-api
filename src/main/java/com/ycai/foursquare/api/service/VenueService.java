package com.ycai.foursquare.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ycai
 *
 */
@Service
public class VenueService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private final static String apiUrl = "https://api.foursquare.com/v2/venues/search?client_id=%s&client_secret=%s&v=%s&ll=%s&query=%s";
	private final static String clientId = "3YDA54LX4FLNLGWNIXUM1AULMSCRRJCYVDK3X0CR2QESIOPT";
	private final static String clientSecret = "PQZV2DE0X5STSSIDPWK2YY345SFTV0RFSG1QMCGOAANDCR2Z";
	private final static String version = "20170519";
	
	/**  
	 * Search for vanues by name, latitude and longitude
	 * @param name Name of venue
	 * @param ll Latitude and longitude of format xx.xx,yy.yy
	 * @return
	 * etc
	 */
	public Object search(String name, String ll) {
		String[] args = {clientId, clientSecret, version, ll, name};
		String url = String.format(apiUrl, args);
		return restTemplate.getForObject(url, Object.class);
	}

}
