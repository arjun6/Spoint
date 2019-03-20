/**
 * 
 */
package com.cricinfo.web;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cricinfo.entity.Country;
import com.cricinfo.entity.League;
import com.cricinfo.entity.Player;
import com.cricinfo.service.CountryDAO;
import com.cricinfo.service.LeagueDAO;
import com.cricinfo.service.PlayerDAO;
import com.cricinfo.service.impl.CountryDAOImpl;
import com.cricinfo.service.impl.LeagueDAOImpl;
import com.cricinfo.service.impl.PlayerDAOImpl;

/**
 * @author athar
 *
 */


@WebServlet("/addCountry")
public class AddCountryServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		Country country = new Country();
		country.setId((String) request.getParameter("id"));
		country.setName((String) request.getParameter("name"));
		country.setShortName((String) request.getParameter("shortname"));
		
		CountryDAO countryService = new CountryDAOImpl();

		countryService.addCountry(country);;

		response.sendRedirect("success.jsp");
	}

}
