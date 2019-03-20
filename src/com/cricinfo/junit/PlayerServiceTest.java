/**
 * 
 */
package com.cricinfo.junit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.cricinfo.entity.MatchCalendar;
import com.cricinfo.entity.Player;
import com.cricinfo.service.PlayerDAO;
import com.cricinfo.service.webimpl.PlayerWSImpl;

import junit.framework.Assert;

/**
 * @author athar
 *
 */
public class PlayerServiceTest {
	
	PlayerDAO service = new PlayerWSImpl();

	/**
	 * Test method for {@link com.cricinfo.jdbc.dao.impl.PlayerDAOImpl#getPlayerById(java.lang.String)}.
	 */
	@Test
	public void testGetPlayerById() { 
		String id = "raina"; 
		
		/*Player player1 = new Player(); 
		player1.setId(id); 
		player.setFirstName("Sachin"); 
		player.setLastName("Tendulkar");*/ 
		
		Player player2 = service.getPlayerById(id); 
		
		System.out.println(player2.toString()); 
		
		fail("Not yet implemented"); 

	}

	/**
	 * Test method for {@link com.cricinfo.jdbc.dao.impl.PlayerDAOImpl#getPlayersByCountry(java.lang.String)}.
	 */
	@Test
	public void testGetPlayersByCountry() {
		
//		List<MatchCalendar> matches = matchService.getMatchCalendar();
		
		
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cricinfo.jdbc.dao.impl.PlayerDAOImpl#getPlayersByName(java.lang.String)}.
	 */
	@Test
	public void testGetPlayersByFirstName() {
		fail("Not yet implemented");
	}

}
