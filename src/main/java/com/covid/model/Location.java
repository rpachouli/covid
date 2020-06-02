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
public class Location {

	private String entity_type;

	private String entity_id;

	private String title;

	private String latitude;

	private String longitude;

	private String city_id;

	private String city_name;

	private String country_id;

	private String country_name;

}
