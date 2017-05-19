package com.ycai.foursquare.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ycai.foursquare.api.service.VenueService;

@RestController
public class VenueController {

	@Autowired
	private VenueService venueService;

	@RequestMapping("/venue/search")
	public Object search(@RequestParam(value = "name", defaultValue = "World") String name) {
		return this.venueService.search();
	}

}
