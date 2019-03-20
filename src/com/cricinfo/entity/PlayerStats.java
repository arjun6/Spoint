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
public class PlayerStats {
	
	private Player player;
	private PlayerData bowlingData;
	private PlayerData battingData;
	private PlayerData example;
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public PlayerData getBowlingData() {
		return bowlingData;
	}
	public void setBowlingData(PlayerData bowlingData) {
		this.bowlingData = bowlingData;
	}
	public PlayerData getBattingData() {
		return battingData;
	}
	public void setBattingData(PlayerData battingData) {
		this.battingData = battingData;
	}
}
