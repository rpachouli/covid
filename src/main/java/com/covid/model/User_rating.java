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
public class User_rating {

	private String aggregate_rating;

	private String rating_text;

	private String rating_color;

	private String votes;

}
