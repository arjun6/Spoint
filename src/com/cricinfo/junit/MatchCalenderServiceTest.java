/**
 * 
 */
package com.cricinfo.junit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.cricinfo.entity.MatchCalendar;
import com.cricinfo.service.MatchDAO;
import com.cricinfo.service.webimpl.MatchCalenderWSImpl;

/**
 * @author athar
 *
 */
public class MatchCalenderServiceTest {
	
	MatchDAO matchService = new MatchCalenderWSImpl();
	
	@Test
	public void testgetMatchCalendar() {
		
		List<MatchCalendar> matches = matchService.getMatchCalendar();
		
		
		fail("Not yet implemented");
	}
	
}
