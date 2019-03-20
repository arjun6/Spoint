/**
 * 
 */
package com.cricinfo.service;

import java.util.ArrayList;

import com.cricinfo.entity.Country;

/**
 * @author athar
 *
 */
public interface CountryDAO {

	public ArrayList<Country> getCountryList();
	public void addCountry(Country country);
	public void delete(String id);
}
