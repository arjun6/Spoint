/**
 * 
 */
package com.cricinfo.web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cricinfo.service.LeagueDAO;
import com.cricinfo.service.impl.LeagueDAOImpl;

/**
 * @author athar
 *
 */

@WebServlet("/deleteLeague")
public class DeleteLeagueServlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String id = (String) request.getParameter("id");
		LeagueDAO leagueDAO = new LeagueDAOImpl();
		leagueDAO.delete(id);

		response.sendRedirect("success.jsp");
		
	}

}
