package com.simplilearn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.dao.FlightDAO;

@WebServlet("/search-flight")
public class SearchFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SearchFlightServlet() {
        super(); 
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fromCity = request.getParameter("fromCity");
		String toCity = request.getParameter("toCity");
		FlightDAO.SearchFlight(fromCity, toCity);
		
		HttpSession session = request.getSession();
		session.setAttribute("fromCity", fromCity );
		session.setAttribute("toCity", toCity);
		response.sendRedirect("listsearchflight.jsp");
		
//		RequestDispatcher dispatcher = 	request.getRequestDispatcher("listsearchflight.jsp");
//		dispatcher.forward(request, response);
	}

}
