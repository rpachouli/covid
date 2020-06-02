/**
 * 
 */
package com.covid.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.common.CovidConstants;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author rpachoul
 *
 */
@RestController
@RequestMapping(value = CovidConstants.BASE_PATH + "" + CovidConstants.VERSION)
@Api(description = CovidConstants.API_DESRCIPTION, tags = CovidConstants.TITLE)
public class VendorController {
	
	@CrossOrigin
	@GetMapping(value ="/vendorDetails" , produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Display All Vendor Details")
	public ResponseEntity<List<String>> findAllVendorDetails() {
		List<String> vendorDetails = new ArrayList<String>();
		Map<String, String>locationWiseVendor=new HashMap<String, String>();
		vendorDetails.add("Bikanervala - Plot 3-5, Near Leisure Valley Park, Sector 29, Gurgaon");
		vendorDetails.add("KFC - Plot 98, Main Market, Sector 14, Gurgaon");
		vendorDetails.add("McDonald's - SCO 36, Leisure Valley Road, Main Market, Sector 29, Gurgaon");
		vendorDetails.add("KFC - Shop 28, Ground Floor, Dlf City Centre Mall Mg Road, Gurgaon");
		vendorDetails.add("The Cake Story - G66, Baani Square, Sector 50, Gurgaon");
		vendorDetails.add("Om Sweets & Snacks - SCO 17, Main Market, Sector 31, Gurgaon");
		vendorDetails.add("Bikanervala - Suncity Business Tower, Golf Course Road, Gurgaon");
		vendorDetails.add("Whisky Samba - Plaza Level, Two Horizon Center, Golf Course Road, Gurgaon");
		vendorDetails.add("Om Sweets & Snacks, 84-85, Shopping Complex, Sector 14, Gurgaon");
		if (vendorDetails.isEmpty()) {
			return new ResponseEntity<List<String>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<String>>(vendorDetails, HttpStatus.OK);
	}

}
