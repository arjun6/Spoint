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

import com.cricinfo.entity.League;
import com.cricinfo.entity.Player;
import com.cricinfo.service.LeagueDAO;
import com.cricinfo.service.PlayerDAO;
import com.cricinfo.service.impl.LeagueDAOImpl;
import com.cricinfo.service.impl.PlayerDAOImpl;

/**
 * @author athar
 *
 */

@WebServlet("/deletePlayer")
public class DeletePlayer extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String id = (String) request.getParameter("id");
		PlayerDAO playerDAO = new PlayerDAOImpl();
		playerDAO.delete(id);

		response.sendRedirect("success.jsp");
		
	}

}
