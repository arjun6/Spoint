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


@WebServlet("/countries")
public class CountryServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
//		String name = request.getParameter("name");

		CountryDAO countryService = new CountryDAOImpl();

		ArrayList<Country> countries =  countryService.getCountryList();

		request.setAttribute("countries", countries);

        request.getRequestDispatcher("countries.jsp").forward(request, response);;
	}

}
