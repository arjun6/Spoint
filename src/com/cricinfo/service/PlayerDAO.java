/**
 * 
 */
package com.cricinfo.service;

import java.util.List;

import com.cricinfo.entity.Player;
import com.cricinfo.entity.PlayerStats;

/**
 * @author athar
 *
 */
public interface PlayerDAO {
	
	public List<Player> getPlayerById(String id);
	public List<Player> getPlayersByCountry(String country);
	public List<Player> getPlayersByName(String name);
	public void addPlayer(Player player);
	public List<Player> getAllPlayer();
	public void delete(String id);
	
	public PlayerStats getPlayerStats(String id);
	}
	
	
