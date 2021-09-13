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
import javax.servlet.http.HttpSession;

import com.simplilearn.dao.BookingDAO;
import com.simplilearn.dao.FlightDAO;
import com.simplilearn.entity.Booking;
import com.simplilearn.entity.Flight;

@WebServlet("/add-booking")
public class AddBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddBookingServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("f_id"));
		Flight flight = null;
		try {
			 flight = FlightDAO.getFlightById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String  firstName = request.getParameter("firstName");
		String  lastName = request.getParameter("lastName");
		Double mobileNo = Double.parseDouble(request.getParameter("mobileNo"));
		String  emailId = request.getParameter("emailId");
		String  bookDate = request.getParameter("bookDate");
		int  passengerCount = Integer.parseInt(request.getParameter("passengerCount"));
		String  address = request.getParameter("address");
		
		Date bkDate = null;
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			if(bookDate!=null) {
				bkDate = (Date)formatter.parse(bookDate);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		Booking book = new Booking();
		book.setFirstName(firstName);
		book.setLastName(lastName);
		book.setMobileNo(mobileNo);
		book.setEmailId(emailId);
		book.setBookDate(bkDate);
		book.setPassengerCount(passengerCount);
		book.setAddress(address);
		book.setFlight(flight);
		BookingDAO.save(book);
		
		int bookId = book.getB_id();
		HttpSession session = request.getSession();
		session.setAttribute("bookId", bookId);
		response.sendRedirect("paymentpage.jsp");
		
	}

}
