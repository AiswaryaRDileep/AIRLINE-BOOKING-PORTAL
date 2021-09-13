package com.simplilearn.servlet;

import java.io.IOException;
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

@WebServlet("/add-flight")
public class AddFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddFlightServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("addflight.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String flightNo = request.getParameter("flightNo");
		String flightName = request.getParameter("flightName");
		String fromCity = request.getParameter("fromCity");
		String toCity = request.getParameter("toCity");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String duration = request.getParameter("duration");
		String airportName = request.getParameter("airportName");
		String ticketPrice = request.getParameter("ticketPrice");
		
		Date travelDate = null;
//		Date travelTime = null;
//		DateFormat format = new SimpleDateFormat("HH:mm:ss");
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			if(date != null) {
				travelDate = (Date)formatter.parse(date);
//				travelTime = (Date)format.parse(time);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(fromCity);
		
		Flight f = new Flight();
		f.setFlightNo(Integer.valueOf(flightNo));
		f.setFlightName(flightName);
		f.setFromCity(fromCity);
		f.setToCity(toCity);
		f.setDate(travelDate);
		f.setTime(Float.valueOf(time));
		f.setDuration(Float.valueOf(duration));
		f.setAirportName(airportName);
		f.setTicketPrice(Double.valueOf(ticketPrice));
		
		FlightDAO.save(f);
		
		doGet(request, response);
	}

}
