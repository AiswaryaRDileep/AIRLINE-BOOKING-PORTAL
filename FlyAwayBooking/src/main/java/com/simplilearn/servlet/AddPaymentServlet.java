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
import com.simplilearn.dao.PaymentDAO;
import com.simplilearn.entity.Booking;
import com.simplilearn.entity.Payment;

@WebServlet("/pay-servlet")
public class AddPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AddPaymentServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("paymentsuccessful.jsp");
//		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int b_id = Integer.parseInt(request.getParameter("b_id"));
		Booking booking = null;
		try {
			booking = BookingDAO.getBookingById(b_id);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		int cardNumber =  Integer.parseInt(request.getParameter("cardNumber"));
		String cardHolder = request.getParameter("cardHolder");
		String expDate = request.getParameter("expDate");
//		int cvv = Integer.parseInt(request.getParameter("cvv"));
		
		Date expiryDate = null;
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			if(expDate != null) {
				expiryDate = (Date)formatter.parse(expDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Payment pay = new Payment();
		pay.setCardNumber(cardNumber);
		pay.setCardHolder(cardHolder);
		pay.setExpDate(expiryDate);
//		pay.setCvv(cvv);
		pay.setBooking(booking);
		PaymentDAO.save(pay);
		
		HttpSession session = request.getSession();
		session.setAttribute("bookId", b_id );
		response.sendRedirect("paymentsuccessful.jsp");
		
	}

}
