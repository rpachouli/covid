/**
 * 
 */
package com.covid.model;

import java.util.List;

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
public class LocationDetails {
	
	private Popularity PopularityObject;
	 
	private Location LocationObject;
	
	private List < Object > best_rated_restaurants;

}
