/**
 * 
 */
package com.cricinfo.service.webimpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cricinfo.entity.League;
import com.cricinfo.jdbc.utils.JDBCUtils;
import com.cricinfo.service.LeagueDAO;

/**
 * @author Athar
 *
 */
public class LeagueWSImpl implements LeagueDAO { 
     /* (non-Javadoc)
	 * @see com.cricinfo.jdbc.service.LeagueService#getLeague()
	 */
	@Override
	public ArrayList<League> getLeagues() {

		ArrayList<League> leagues = new ArrayList<>();
		Statement stmt = null;
		String sql = "SELECT * FROM League";
		
		try {
			stmt = JDBCUtils.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				League league=new League();
				league.setId(rs.getString("id"));
				league.setName(rs.getString("name"));
				
				leagues.add(league);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	
		return leagues;
		}

	@Override
	public void addLeague(League league) { {

		Statement stmt = null;
		String sql = "INSERT INTO league VALUES (" + league.getId() + ", '" + league.getName() + "', '"
				+ league.getFormatId() + "')";
		
		System.out.println(league);
		try {
			stmt = JDBCUtils.getConnection().createStatement();
			stmt.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
	public void delete(String id) {

		Statement stmt = null;
		String sql = "DELETE from league where id like '" + id + "'" ;

		try {
			stmt = JDBCUtils.getConnection().createStatement();
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
