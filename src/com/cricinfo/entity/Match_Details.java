/**
 * 
 */
package com.cricinfo.entity;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * @author I340660
 *
 */
public class Match_Details {
	private Match Match_id;
	private Country Country_id;
	private Player player_id;
	private String score;
	private String wickets;
	/**
	 * @return the match_id
	 */
	public Match getMatch_id() {
		return Match_id;
	}
	/**
	 * @param match_id the match_id to set
	 */
	public void setMatch_id(Match match_id) {
		Match_id = match_id;
	}
	/**
	 * @return the country_id
	 */
	public Country getCountry_id() {
		return Country_id;
	}
	/**
	 * @param country_id the country_id to set
	 */
	public void setCountry_id(Country country_id) {
		Country_id = country_id;
	}
	/**
	 * @return the player_id
	 */
	public Player getPlayer_id() {
		return player_id;
	}
	/**
	 * @param player_id the player_id to set
	 */
	public void setPlayer_id(Player player_id) {
		this.player_id = player_id;
	}
	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(String score) {
		this.score = score;
	}
	/**
	 * @return the wickets
	 */
	public String getWickets() {
		return wickets;
	}
	/**
	 * @param wickets the wickets to set
	 */
	public void setWickets(String wickets) {
		this.wickets = wickets;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Match_Details [Match_id=" + Match_id + ", Country_id=" + Country_id + ", player_id=" + player_id
				+ ", score=" + score + ", wickets=" + wickets + "]";
	}
	
	
	
	
}
