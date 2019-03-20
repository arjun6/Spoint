/**
 * 
 */
package com.cricinfo.entity;

/**
 * @author I340660
 *
 */
public class Match {
	    private String id;
		private Format format_id;
		private League league_id;
		private String location;
		private String winning_team;
		private Country toss_winning_team;
		private Country toss_decision;
		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}
		/**
		 * @return the format_id
		 */
		public Format getFormat_id() {
			return format_id;
		}
		/**
		 * @param format_id the format_id to set
		 */
		public void setFormat_id(Format format_id) {
			this.format_id = format_id;
		}
		/**
		 * @return the league_id
		 */
		public League getLeague_id() {
			return league_id;
		}
		/**
		 * @param league_id the league_id to set
		 */
		public void setLeague_id(League league_id) {
			this.league_id = league_id;
		}
		/**
		 * @return the location
		 */
		public String getLocation() {
			return location;
		}
		/**
		 * @param location the location to set
		 */
		public void setLocation(String location) {
			this.location = location;
		}
		/**
		 * @return the winning_team
		 */
		public String getWinning_team() {
			return winning_team;
		}
		/**
		 * @param winning_team the winning_team to set
		 */
		public void setWinning_team(String winning_team) {
			this.winning_team = winning_team;
		}
		/**
		 * @return the toss_winning_team
		 */
		public Country getToss_winning_team() {
			return toss_winning_team;
		}
		/**
		 * @param toss_winning_team the toss_winning_team to set
		 */
		public void setToss_winning_team(Country toss_winning_team) {
			this.toss_winning_team = toss_winning_team;
		}
		/**
		 * @return the toss_decision
		 */
		public Country getToss_decision() {
			return toss_decision;
		}
		/**
		 * @param toss_decision the toss_decision to set
		 */
		public void setToss_decision(Country toss_decision) {
			this.toss_decision = toss_decision;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "match [id=" + id + ", format_id=" + format_id + ", league_id=" + league_id + ", location="
					+ location + ", winning_team=" + winning_team + ", toss_winning_team=" + toss_winning_team
					+ ", toss_decision=" + toss_decision + "]";
		}
		
		
		
		
		
		
}
