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

import com.cricinfo.entity.Player;
import com.cricinfo.service.PlayerDAO;
import com.cricinfo.service.webimpl.PlayerWSImpl;

/**
 * @author athar
 *
 */

@WebServlet("/findPlayers")
public class PlayerListServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		String name = request.getParameter("name");

		PlayerDAO playerService = new PlayerWSImpl();

		List<Player> players =  playerService.getPlayerById(name);

		request.setAttribute("players", players);
		
        request.getRequestDispatcher("playersDetails.jsp").forward(request, response);;
	}

}
