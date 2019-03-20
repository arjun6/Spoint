/**
 * 
 */
package com.cricinfo.service.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cricinfo.entity.Country;
import com.cricinfo.entity.Player;
import com.cricinfo.entity.PlayerStats;
import com.cricinfo.jdbc.utils.JDBCUtils;
import com.cricinfo.service.PlayerDAO;

/**
 * @author athar
 *
 */
public class PlayerDAOImpl implements PlayerDAO {

	/* (non-Javadoc)
	 * @see com.cricinfo.jdbc.service.PlayerService#getPlayerById(java.lang.String)
	 */
	@Override
	public Player getPlayerById(String id) {
		Player player = new Player();
		Statement stmt = null;
		String sql = "SELECT * FROM player WHERE id = " + id;
		
		try {
			stmt = JDBCUtils.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				player.setId(rs.getString("id"));
				player.setFirstName(rs.getString("first_name"));
				player.setLastName(rs.getString("last_name"));
				player.setDob(rs.getDate("dob"));
				
				Country country = new Country();
				country.setId(rs.getString("country_id"));
				player.setPlayerType(rs.getString("ptype"));
				player.setCountry(country);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return player;
	}

	/* (non-Javadoc)
	 * @see com.cricinfo.jdbc.service.PlayerService#getPlayersByCountry(java.lang.String)
	 */
	@Override
	public ArrayList<Player> getPlayersByCountry(String countryName) {
		
		 ArrayList<Player>  players= new ArrayList<>();
		Statement stmt = null;
		String sql = "SELECT * from player join country on player.country_id = country.id where country.name like '%" + countryName + "%'";
		
		try {
			stmt = JDBCUtils.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				Player player=new Player();
				player.setId(rs.getString("id"));
				player.setFirstName(rs.getString("first_name"));
				player.setLastName(rs.getString("last_name"));
				player.setDob(rs.getDate("dob"));
				
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
		return players;
	}

	/* (non-Javadoc)
	 * @see com.cricinfo.jdbc.service.PlayerService#getPlayersByFirstName(java.lang.String)
	 */
	@Override
	public ArrayList<Player> getPlayersByName(String name) {
		 ArrayList<Player>  players= new ArrayList<>();
		Statement stmt = null;
		String sql = "SELECT * from player where first_name like '%" + name + "%' or last_name like '%" + name + "%'";
		
		try {
			stmt = JDBCUtils.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				Player player=new Player();
				player.setId(rs.getString("id"));
				player.setFirstName(rs.getString("first_name"));
				player.setLastName(rs.getString("last_name"));
				player.setDob(rs.getDate("dob"));
				
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
		return players;
	}

	@Override
	public void addPlayer(Player player) {

		Statement stmt = null;
		String sql = "INSERT INTO Player (id, first_name, last_name, country_id) VALUES (" + player.getId() + ", '" + player.getFirstName() + "', '"
				+ player.getLastName() + "', '" + player.getCountry().getId() + "')";

		try {
			stmt = JDBCUtils.getConnection().createStatement();
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Player> getAllPlayer() {
		
		ArrayList<Player>  players= new ArrayList<>();
		Statement stmt = null;
		String sql = "SELECT * from player";
		
		try {
			stmt = JDBCUtils.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				Player player=new Player();
				player.setId(rs.getString("id"));
				player.setFirstName(rs.getString("first_name"));
				player.setLastName(rs.getString("last_name"));
				player.setDob(rs.getDate("dob"));
				System.out.println(player);
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
				
				System.out.println(player);
				
				players.add(player);
			}
			System.out.println(players);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return players;
	}

	@Override
	public void delete(String id) {

		Statement stmt = null;
		String sql = "DELETE from player where id like '" + id + "'" ;

		try {
			stmt = JDBCUtils.getConnection().createStatement();
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public PlayerStats getPlayerStats(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
