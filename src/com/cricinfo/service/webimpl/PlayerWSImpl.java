/**
 * 
 */
package com.cricinfo.service.webimpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.cricinfo.entity.Country;
import com.cricinfo.entity.MatchCalendar;
import com.cricinfo.entity.Player;
import com.cricinfo.entity.PlayerData;
import com.cricinfo.entity.PlayerStats;
import com.cricinfo.service.PlayerDAO;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/**
 * @author 
 *
 */
public class PlayerWSImpl implements PlayerDAO {

	/* (non-Javadoc)
	 * @see com.cricinfo.jdbc.service.PlayerService#getPlayerById(java.lang.String)
	 */
	@Override
	public List<Player> getPlayerById(String id) { 
		
		List<Player> player = new ArrayList<>();
		
			try {

			Client client = Client.create();

			WebResource webResource = client
			   .resource("https://cricapi.com/api/playerFinder?apikey=CgN2QYOrCfOPxceAIXZ1YpM2LmD3&name=" + id);

			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			String stringOutput = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(stringOutput);
			
			JsonParser parser = new JsonParser();
			JsonObject jsonOutput = (JsonObject) parser.parse(stringOutput); 
			
			JsonArray data = jsonOutput.getAsJsonArray("data");
			System.out.println(data);
			
			Iterator<JsonElement> it = data.iterator();
			while(it.hasNext()) {
				Player findplayers = new Player(); 
				JsonObject object = it.next().getAsJsonObject();
								
				findplayers.setId(object.getAsJsonPrimitive("pid").getAsString());
				findplayers.setFullName(object.getAsJsonPrimitive("fullName").getAsString());
				findplayers.setName(object.getAsJsonPrimitive("name").getAsString());
				player.add(findplayers);
			}
			}
			

		  
 catch (Exception e) {

			e.printStackTrace();

		  }
			
			return  player;
		
		
	} 

	/* (non-Javadoc)
	 * @see com.cricinfo.jdbc.service.PlayerService#getPlayersByCountry(java.lang.String)
	 */
	@Override
	public ArrayList<Player> getPlayersByCountry(String countryName) {
		
		ArrayList<Player>  players= new ArrayList<>();
		//TODO
		
		
		return players;
	}

	/* (non-Javadoc)
	 * @see com.cricinfo.jdbc.service.PlayerService#getPlayersByFirstName(java.lang.String)
	 */
	@Override
	public ArrayList<Player> getPlayersByName(String name) {
		ArrayList<Player>  players= new ArrayList<>();
		
		//TODO
		
		
		return players;
	}

	@Override
	public void addPlayer(Player player) {
		
		//TODO


	}

	@Override
	public ArrayList<Player> getAllPlayer() {
		
		ArrayList<Player>  players= new ArrayList<>();
	
		//TODO
		return players;
	}

	@Override
	public void delete(String id) {

		//TODO
	}

	@Override
	public PlayerStats getPlayerStats(String id) { 
		
		PlayerStats stats = new PlayerStats();
		PlayerData bowlingData = new PlayerData();
		PlayerData battingData = new PlayerData();
		 		
		try {

		Client client = Client.create();

		WebResource webResource = client
		   .resource("https://cricapi.com/api/playerStats?apikey=CgN2QYOrCfOPxceAIXZ1YpM2LmD3&pid=" + id);

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
		
		Player player = new Player();
		player.setFullName(jsonOutput.getAsJsonPrimitive("fullName").getAsString());
		player.setName(jsonOutput.getAsJsonPrimitive("name").getAsString());
		Country country = new Country();
		country.setName(jsonOutput.getAsJsonPrimitive("country").getAsString());
		player.setCountry(country);
		stats.setPlayer(player);

		
		JsonObject data = jsonOutput.getAsJsonObject("data");
		JsonObject bowlingDataJson = data.getAsJsonObject("bowling");
		JsonObject battingDataJson = data.getAsJsonObject("batting");
		
		Map<String, String> listA = new HashMap<>(); 
		JsonObject listAjsonJson = bowlingDataJson.getAsJsonObject("listA");
		listA.put("Econ", listAjsonJson.getAsJsonPrimitive("Econ").getAsString());
		listA.put("Inns", listAjsonJson.getAsJsonPrimitive("Inns").getAsString());
		listA.put("Balls", listAjsonJson.getAsJsonPrimitive("Balls").getAsString());
		listA.put("Runs", listAjsonJson.getAsJsonPrimitive("Runs").getAsString());
		listA.put("Mat", listAjsonJson.getAsJsonPrimitive("Mat").getAsString());		
		listA.put("Wkts", listAjsonJson.getAsJsonPrimitive("Wkts").getAsString());
		listA.put("Mat", listAjsonJson.getAsJsonPrimitive("Mat").getAsString());		
		bowlingData.setListA(listA);	
		
		Map<String, String> firstClass = new HashMap<>(); 
		JsonObject firstClassJson = bowlingDataJson.getAsJsonObject("firstClass");
		firstClass.put("Econ", firstClassJson.getAsJsonPrimitive("Econ").getAsString());
		firstClass.put("Inns", firstClassJson.getAsJsonPrimitive("Inns").getAsString());
		firstClass.put("Balls", firstClassJson.getAsJsonPrimitive("Balls").getAsString());
		firstClass.put("Runs", firstClassJson.getAsJsonPrimitive("Runs").getAsString());
		firstClass.put("Mat", firstClassJson.getAsJsonPrimitive("Mat").getAsString());		
		firstClass.put("Wkts", firstClassJson.getAsJsonPrimitive("Wkts").getAsString());
		firstClass.put("Mat", firstClassJson.getAsJsonPrimitive("Mat").getAsString());
		bowlingData.setFirstClass(firstClass);
		
		Map<String, String> t20s = new HashMap<>(); 
		JsonObject t20sJson = bowlingDataJson.getAsJsonObject("T20Is");
		t20s.put("Econ", t20sJson.getAsJsonPrimitive("Econ").getAsString());
		t20s.put("Inns", t20sJson.getAsJsonPrimitive("Inns").getAsString());
		t20s.put("Balls", t20sJson.getAsJsonPrimitive("Balls").getAsString());
		t20s.put("Runs", t20sJson.getAsJsonPrimitive("Runs").getAsString());
		t20s.put("Mat", t20sJson.getAsJsonPrimitive("Mat").getAsString());		
		t20s.put("Wkts", t20sJson.getAsJsonPrimitive("Wkts").getAsString());
		t20s.put("Mat", t20sJson.getAsJsonPrimitive("Mat").getAsString());
		bowlingData.setT20s(t20s);
		
		Map<String, String> odi = new HashMap<>(); 
		JsonObject odiJson = bowlingDataJson.getAsJsonObject("ODIs");
		odi.put("Econ", odiJson.getAsJsonPrimitive("Econ").getAsString());
		odi.put("Inns", odiJson.getAsJsonPrimitive("Inns").getAsString());
		odi.put("Balls", odiJson.getAsJsonPrimitive("Balls").getAsString());
		odi.put("Runs", odiJson.getAsJsonPrimitive("Runs").getAsString());
		odi.put("Mat", odiJson.getAsJsonPrimitive("Mat").getAsString());		
		odi.put("Wkts", odiJson.getAsJsonPrimitive("Wkts").getAsString());
		odi.put("Mat", odiJson.getAsJsonPrimitive("Mat").getAsString());
		bowlingData.setODIs(odi);
		
		Map<String, String> test = new HashMap<>(); 
		JsonObject testJson = bowlingDataJson.getAsJsonObject("tests");
		test.put("Econ", testJson.getAsJsonPrimitive("Econ").getAsString());
		test.put("Inns", testJson.getAsJsonPrimitive("Inns").getAsString());
		test.put("Balls", testJson.getAsJsonPrimitive("Balls").getAsString());
		test.put("Runs", testJson.getAsJsonPrimitive("Runs").getAsString());
		test.put("Mat", testJson.getAsJsonPrimitive("Mat").getAsString());		
		test.put("Wkts", testJson.getAsJsonPrimitive("Wkts").getAsString());
		test.put("Mat", testJson.getAsJsonPrimitive("Mat").getAsString());
		bowlingData.setTest(test);
		
		stats.setBowlingData(bowlingData);
		
	
		//batting
		Map<String, String> listAbatting = new HashMap<>(); 
		JsonObject listAjsonbat = battingDataJson.getAsJsonObject("listA");
		listAbatting.put("50", listAjsonbat.getAsJsonPrimitive("50").getAsString());
		listAbatting.put("100", listAjsonbat.getAsJsonPrimitive("100").getAsString());
		listAbatting.put("Inns", listAjsonbat.getAsJsonPrimitive("Inns").getAsString());
		listAbatting.put("Ave", listAjsonbat.getAsJsonPrimitive("Ave").getAsString());
		listAbatting.put("Runs", listAjsonbat.getAsJsonPrimitive("Runs").getAsString());
		listAbatting.put("Mat", listAjsonbat.getAsJsonPrimitive("Mat").getAsString());		
		listAbatting.put("Mat", listAjsonbat.getAsJsonPrimitive("Mat").getAsString());		
		battingData.setListA(listAbatting);	
		
		Map<String, String> firstClassBatting = new HashMap<>(); 
		JsonObject firstClassBattingJson = battingDataJson.getAsJsonObject("firstClass");
		firstClassBatting.put("50", firstClassBattingJson.getAsJsonPrimitive("50").getAsString());
		firstClassBatting.put("Inns", firstClassBattingJson.getAsJsonPrimitive("Inns").getAsString());
		firstClassBatting.put("100", firstClassBattingJson.getAsJsonPrimitive("100").getAsString());
		firstClassBatting.put("Ave", firstClassBattingJson.getAsJsonPrimitive("Ave").getAsString());
		firstClassBatting.put("Runs", firstClassBattingJson.getAsJsonPrimitive("Runs").getAsString());
		firstClassBatting.put("Mat", firstClassBattingJson.getAsJsonPrimitive("Mat").getAsString());		
		firstClassBatting.put("Mat", firstClassBattingJson.getAsJsonPrimitive("Mat").getAsString());
		battingData.setFirstClass(firstClassBatting);
		
		Map<String, String> t20sBatting = new HashMap<>(); 
		JsonObject t20sBattingJson = battingDataJson.getAsJsonObject("T20Is");
		t20sBatting.put("50", t20sBattingJson.getAsJsonPrimitive("50").getAsString());
		t20sBatting.put("Inns", t20sBattingJson.getAsJsonPrimitive("Inns").getAsString());
		t20sBatting.put("100", t20sBattingJson.getAsJsonPrimitive("100").getAsString());
		t20sBatting.put("Runs", t20sBattingJson.getAsJsonPrimitive("Runs").getAsString());
		t20sBatting.put("Mat", t20sBattingJson.getAsJsonPrimitive("Mat").getAsString());		
		t20sBatting.put("Ave", t20sBattingJson.getAsJsonPrimitive("Ave").getAsString());
		t20sBatting.put("Mat", t20sBattingJson.getAsJsonPrimitive("Mat").getAsString());
		battingData.setT20s(t20sBatting);
		
		Map<String, String> odiBatting = new HashMap<>(); 
		JsonObject odiBattingJson = battingDataJson.getAsJsonObject("ODIs");
		odiBatting.put("50", odiBattingJson.getAsJsonPrimitive("50").getAsString());
		odiBatting.put("Inns", odiBattingJson.getAsJsonPrimitive("Inns").getAsString());
		odiBatting.put("100", odiBattingJson.getAsJsonPrimitive("100").getAsString());
		odiBatting.put("Runs", odiBattingJson.getAsJsonPrimitive("Runs").getAsString());
		odiBatting.put("Mat", odiBattingJson.getAsJsonPrimitive("Mat").getAsString());		
		odiBatting.put("Ave", odiBattingJson.getAsJsonPrimitive("Ave").getAsString());
		odiBatting.put("Mat", odiBattingJson.getAsJsonPrimitive("Mat").getAsString());
		battingData.setODIs(odiBatting);
		
		Map<String, String> testbatting = new HashMap<>(); 
		JsonObject testJsonbatting = battingDataJson.getAsJsonObject("tests");
		testbatting.put("50", testJsonbatting.getAsJsonPrimitive("50").getAsString());
		testbatting.put("Inns", testJsonbatting.getAsJsonPrimitive("Inns").getAsString());
		testbatting.put("100", testJsonbatting.getAsJsonPrimitive("100").getAsString());
		testbatting.put("Runs", testJsonbatting.getAsJsonPrimitive("Runs").getAsString());
		testbatting.put("Mat", testJsonbatting.getAsJsonPrimitive("Mat").getAsString());		
		testbatting.put("Ave", testJsonbatting.getAsJsonPrimitive("Ave").getAsString());
		testbatting.put("Mat", testJsonbatting.getAsJsonPrimitive("Mat").getAsString());
		battingData.setTest(testbatting);
		
		stats.setBattingData(battingData);
		
		
		

	  } catch (Exception e) {

		e.printStackTrace();

	  }
		
		return  stats;
	
	

	}

}
