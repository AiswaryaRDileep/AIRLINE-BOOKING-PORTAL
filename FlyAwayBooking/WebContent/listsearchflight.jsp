<%@page import="com.simplilearn.dao.FlightDAO"%>
<%@page import="com.simplilearn.entity.Flight"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Flight</title>
</head>
<body>
<%@ include file="header.jsp" %>
<br>
<br>

	<%
		String fromCity = (String)session.getAttribute("fromCity");
		String toCity = (String)session.getAttribute("toCity");
		List<Flight> flight = FlightDAO.SearchFlight(fromCity, toCity);
		request.setAttribute("flightlist", flight);
	%>
	<div class = "container">
       <table class="table table-bordered">
	    <thead>
	      <tr>
	        <th>Flight No.</th>
	        <th>Flight Name</th>
	        <th>From City</th>
	        <th>To City</th>
	        <th>Date</th>
	        <th>Time</th>
	        <th>Duration</th>
	        <th>Airport Name</th>
	        <th>Ticket Price</th>
	        <th>Book</th>
	      </tr>
	    </thead>
	    <tbody>
	    	<core:forEach var="fly" items="${flightlist}">
 				<tr>
			        <td> ${fly.getFlightNo()} </td>
			        <td> ${fly.getFlightName()} </td>
			        <td> ${fly.getFromCity()} </td>
			        <td> ${fly.getToCity()} </td>
			        <td> ${fly.getDate()} </td>
			        <td> ${fly.getTime()} </td>
			        <td> ${fly.getDuration()} </td>
			        <td> ${fly.getAirportName()} </td>
			        <td> ${fly.getTicketPrice()} </td>
			        <td><a href="addbooking.jsp?f_id=<core:out value='${fly.getF_id()}'/>" 
			        						class="btn btn-primary">BOOK</a></td>

			     </tr>
			</core:forEach>	

	    </tbody>
	  </table>
</div>
</body>
<%@ include file="footer.jsp" %>
</html>