/**
 * 
 */
package com.cricinfo.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cricinfo.entity.MatchCalendar;
import com.cricinfo.service.MatchDAO;
import com.cricinfo.service.webimpl.MatchCalenderWSImpl;

/**
 * @author athar
 *
 */

@WebServlet("/upcomingMatches")
public class MatchServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		MatchDAO matchService = new MatchCalenderWSImpl();
		List<MatchCalendar> matches = matchService.getMatchCalendar();

		request.setAttribute("matches", matches);
		request.getRequestDispatcher("upcomingMatches.jsp").forward(request, response);
	}

}
