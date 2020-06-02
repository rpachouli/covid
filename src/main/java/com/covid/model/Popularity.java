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
public class Popularity {

	private String popularity;

	private String nightlife_index;

	private List<String> top_cuisines;

}
