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


	/**  
	 * Search for vanues by name, latitude and longitude
	 * @param name venue's name, default to costa (coffee)
	 * @param near Latitude and longitude of the user's location of format - XX.XX,YY.YY. Default to London 
	 * @return
	 * etc
	 */
	@RequestMapping("/venues/search")
	public Object search(@RequestParam(value = "name", defaultValue = "costa") String name, 
			@RequestParam(value = "near", defaultValue = "51.51,0.13") String near) {
		return this.venueService.search(name, near);
	}

}
