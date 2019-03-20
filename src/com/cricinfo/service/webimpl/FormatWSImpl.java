/**
 * 
 */
package com.cricinfo.service.webimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cricinfo.entity.Country;
import com.cricinfo.entity.Format;
import com.cricinfo.entity.Player;
import com.cricinfo.jdbc.utils.JDBCUtils;
import com.cricinfo.service.CountryDAO;
import com.cricinfo.service.FormatDAO;

/**
 * @author athar
 *
 */
public class FormatWSImpl implements FormatDAO {

	@Override
	public ArrayList<Format> getFormatByPlayerName(String name) {
		
		ArrayList<Format>  players= new ArrayList<>();
		/*
		Statement stmt = null;
		String sql = "SELECT * from format join country on format.country_id = country.id where country.name like '%" + countryName + "%'";
		
		try {
			stmt = JDBCUtils.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				Format format=new Player();
				format.setId(rs.getString("id"));
				format.setFirstName(rs.getString("first_name"));
				format.setLastName(rs.getString("last_name"));
				format.setDob(rs.getDate("dob"));
				
				Country country = new Country();
				country.setId(rs.getString("country_id"));
				String countrySql = "SELECT * from Country where id like '" + country.getId() + "'"; 
				stmt = JDBCUtils.getConnection().createStatement();
				ResultSet rsCountry = stmt.executeQuery(countrySql);
				rsCountry.next();
				country.setName(rsCountry.getString("name"));
				country.setShortName(rsCountry.getString("short_name"));
				
				
				player.setPlayerType(rs.getString("ptype"));
				player.setCountry(country);
				players.add(player);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			*/	
		return players;
			
	}


	@Override
	public void getFormatList() { 
		// TODO Auto-generated method stub
		
	}
}

