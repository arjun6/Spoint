/**
 * 
 */
package com.cricinfo.service.webimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cricinfo.entity.Country;
import com.cricinfo.jdbc.utils.JDBCUtils;
import com.cricinfo.service.CountryDAO;

/**
 * @author I340660
 *
 */
public class CountryWSImpl implements CountryDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cricinfo.jdbc.service.CountryService#getCountryList()
	 */
	@Override
	public ArrayList<Country> getCountryList() {

		ArrayList<Country> countryList = new ArrayList<>();
		Statement stmt = null;
		String sql = "SELECT * FROM Country";

		try {
			stmt = JDBCUtils.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Country country = new Country();
				country.setId(rs.getString("id"));
				country.setName(rs.getString("name"));
				country.setShortName(rs.getString("short_name"));
				countryList.add(country);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return countryList;
	}

	@Override
	public void addCountry(Country country) {

		Statement stmt = null;
		String sql = "INSERT INTO COUNTRY VALUES (" + country.getId() + ", '" + country.getName() + "', '"
				+ country.getShortName() + "')";

		try {
			stmt = JDBCUtils.getConnection().createStatement();
			stmt.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void delete(String id) {

		Statement stmt = null;
		String sql = "DELETE from country where id like '" + id + "'" ;

		try {
			stmt = JDBCUtils.getConnection().createStatement();
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
