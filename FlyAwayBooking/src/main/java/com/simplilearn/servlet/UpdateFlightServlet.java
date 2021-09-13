package com.simplilearn.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.dao.FlightDAO;
import com.simplilearn.entity.Flight;


@WebServlet("/update-flight")
public class UpdateFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateFlightServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("flightreport.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("f_id"));
		System.out.println(id);
		int flightNo = Integer.parseInt(request.getParameter("flightNo"));
		String flightName = request.getParameter("flightName");
		String fromCity = request.getParameter("fromCity");
		String toCity = request.getParameter("toCity");
		String date = request.getParameter("date");
		float time = Float.parseFloat(request.getParameter("time"));
		float duration = Float.parseFloat(request.getParameter("duration"));
		String airportName = request.getParameter("airportName");
		double ticketPrice = Double.parseDouble(request.getParameter("ticketPrice"));
		
		Date travelDate = null;
//		Date travelTime = null;
//		DateFormat format = new SimpleDateFormat("HH:mm:ss");
		
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			if(date != null && time != null) {
//				travelDate = (Date)formatter.parse(date);
//				travelTime = (Date)format.parse(time);
//			}
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		}
		
		try {
			if(date != null) {
				travelDate = (Date)formatter.parse(date);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		
		Flight flight = new Flight(id,flightNo,flightName,fromCity,toCity,travelDate,time,duration,airportName,ticketPrice);
		try {
			FlightDAO.updateFlight(flight);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
