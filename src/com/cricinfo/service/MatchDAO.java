/**
 * 
 */
package com.cricinfo.service;

import java.util.ArrayList;
import java.util.List;

import com.cricinfo.entity.Match;
import com.cricinfo.entity.MatchCalendar;

/**
 * @author athar
 *
 */
public interface MatchDAO {
	
	public List<Match> getMatches();
	public List<MatchCalendar> getMatchCalendar();
	public ArrayList<Match> getMatchesByFormat(String format_id);
	public ArrayList<Match> getMatchesByLocation(String location);
	public Match getWinningTeamInMatch();
	public void addMatch(String match);
	
	
}
