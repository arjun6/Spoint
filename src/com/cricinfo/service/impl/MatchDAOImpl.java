/**
 * 
 */
package com.cricinfo.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cricinfo.entity.Match;
import com.cricinfo.entity.MatchCalendar;
import com.cricinfo.jdbc.utils.JDBCUtils;
import com.cricinfo.service.MatchDAO;

/**
 * @author atharS
 *
 */
public class MatchDAOImpl implements MatchDAO{

		@Override
		public List<MatchCalendar> getMatchCalendar() {
		Match match = new Match();
		Statement stmt = null;
		String sql = "SELECT * FROM match WHERE id = ";
			

		try {
			stmt = JDBCUtils.getConnection().createStatement();

			ResultSet rs = stmt.executeQuery(sql);
				
			while(rs.next()){
					
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return null;
		}

		@Override
		public List<Match> getMatches() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<Match> getMatchesByFormat(String format_id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<Match> getMatchesByLocation(String location) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Match getWinningTeamInMatch() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void addMatch(String match) {
			// TODO Auto-generated method stub
			
		}

}