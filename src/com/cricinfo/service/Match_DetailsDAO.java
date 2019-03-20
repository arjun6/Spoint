/**
 * 
 */
package com.cricinfo.service;

import java.util.ArrayList;

import com.cricinfo.entity.Match_Details;

/**
 * @author athar
 *
 */
public interface Match_DetailsDAO {
	public ArrayList<Match_Details> getMatchList(); 
	public Match_Details getScoreByPlayer(String player_id);
	public Match_Details getScoreByCountry(String country_id);
	public Match_Details getWicketsByPlayer(String player_id);
	public Match_Details getScoreInMatch(String match_id);
	
	
}
