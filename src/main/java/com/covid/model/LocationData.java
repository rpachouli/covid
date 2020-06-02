/**
 * 
 */
package com.covid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rpachoul
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationData {
	
	private String address;

    private String locality;

    private String city;

    private String latitude;

    private String longitude;

    private String zipcode;

    private String country_id;



}
