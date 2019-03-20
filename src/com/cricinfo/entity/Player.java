/**
 * 
 */
package com.cricinfo.entity;

import java.util.Date;
import java.util.List;

/**
 * @author athar
 *
 */
public class Player {
	
	private String id;
	private String firstName; 
	private String lastName;
	private Date dob;
	private String playerType; 
	private Country country;
	private String role;
	private List<String> majorTeams;
	private String battingStyle; 
	private String bowlingStyle;
	
	
	private String name; 
	private String fullName;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getMajorTeams() {
		return majorTeams;
	}
	public void setMajorTeams(List<String> majorTeams) {
		this.majorTeams = majorTeams;
	}
	public String getBattingStyle() {
		return battingStyle;
	}
	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}
	public String getBowlingStyle() {
		return bowlingStyle;
	}
	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the playerType
	 */
	public String getPlayerType() {
		return playerType;
	}
	/**
	 * @param playerType the playerType to set
	 */
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Player [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", playerType=" + playerType + ", country=" + country + "]";
	}
	

}
