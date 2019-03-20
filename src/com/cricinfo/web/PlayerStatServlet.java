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
import com.cricinfo.entity.PlayerStats;
import com.cricinfo.service.MatchDAO;
import com.cricinfo.service.PlayerDAO;
import com.cricinfo.service.webimpl.MatchCalenderWSImpl;
import com.cricinfo.service.webimpl.PlayerWSImpl;

/**
 * @author athar
 *
 */

@WebServlet("/playerStats")
public class PlayerStatServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		String id = request.getParameter("id");
		
		PlayerDAO playerService = new PlayerWSImpl();
		PlayerStats stats = playerService.getPlayerStats(id);

		request.setAttribute("player", stats.getPlayer());
		request.setAttribute("bowling", stats.getBowlingData());
		request.setAttribute("batting", stats.getBattingData());

		request.getRequestDispatcher("playerStats.jsp").forward(request, response);
	}

}
