/**
 * 
 */
package com.cricinfo.service.webimpl;
import com.cricinfo.entity.Match;
import com.cricinfo.entity.MatchCalendar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.cricinfo.service.MatchDAO;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * @author atharS
 *
 */
public class MatchCalenderWSImpl implements MatchDAO{

		@Override
		public List<MatchCalendar> getMatchCalendar() {
			
			List<MatchCalendar> matches = new ArrayList<>(); 			
			try {

			Client client = Client.create();

			WebResource webResource = client
			   .resource("https://cricapi.com/api/matchCalendar?apikey=RrOZAAu9dUXUDWWfqixeFhPDWGe2");

			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			String stringOutput = response.getEntity(String.class);			
			JsonParser parser = new JsonParser(); 
			JsonObject jsonOutput = (JsonObject) parser.parse(stringOutput); 
			
			System.out.println("Output from Server .... \n");
			System.out.println(jsonOutput);
			
			JsonArray data = jsonOutput.getAsJsonArray("data");
			System.out.println(data);
			
			Iterator<JsonElement> it = data.iterator();
			while(it.hasNext()) {
				MatchCalendar matchCalendar = new MatchCalendar(); 
				JsonObject object = it.next().getAsJsonObject();
								
				matchCalendar.setUnique_id(object.getAsJsonPrimitive("unique_id").getAsString());
				matchCalendar.setName(object.getAsJsonPrimitive("name").getAsString());
				matchCalendar.setDate(object.getAsJsonPrimitive("date").getAsString());
				matches.add(matchCalendar);
			}

		  } catch (Exception e) {

			e.printStackTrace();

		  }
			
			return  matches;
		
		}
	
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

		@Override
		public List<Match> getMatches() {
			
			

			
			try {

			Client client = Client.create();

			WebResource webResource = client
			   .resource("https://cricapi.com/api/matches?apikey=CgN2QYOrCfOPxceAIXZ1YpM2LmD3");

			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(output);

		  } catch (Exception e) {

			e.printStackTrace();

		  }
			
			return  null;
		
	
		}

}