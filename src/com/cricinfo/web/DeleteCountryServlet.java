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

import com.cricinfo.service.CountryDAO;
import com.cricinfo.service.impl.CountryDAOImpl;

/**
 * @author athar
 *
 */

@WebServlet("/deleteCountry")
public class DeleteCountryServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String id = (String) request.getParameter("id");
		CountryDAO countryDAO = new CountryDAOImpl();
		countryDAO.delete(id);

		response.sendRedirect("success.jsp");
		
	}

}
