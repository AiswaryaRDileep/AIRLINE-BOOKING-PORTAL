<%@page import="com.simplilearn.dao.FlightDAO"%>
<%@page import="com.simplilearn.entity.Flight"%>
<%@page import="java.util.List"%>
<%@page import="com.simplilearn.util.*,org.hibernate.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Flight</title>
<style>
label {
font-style: italic;
}
div.container {
position: center;
padding-left: 30%;
padding-right: 30%;
}

</style>
</head>
<body>
<%@ include file="adminheader.jsp" %>


	<%
		int flightId = Integer.parseInt(request.getParameter("f_id"));
		Flight flight = FlightDAO.getFlightById(flightId);
	%>


	<div class = "jumbotron">
	<form method="post" action="update-flight">
	<input type="hidden" name="f_id" value="<%= flight.getF_id() %>" ><br><br>
	  <label for="fname">Flight No.</label>
	  <input type="text" id="flightNo" name="flightNo" value="<%= flight.getFlightNo()  %>" size="100"><br><br>
	  <label for="lname">Flight Name</label>
	  <input type="text" id="flightName" name="flightName" value="<%= flight.getFlightName() %>" size="100"><br><br>
	  <label for="lname">From Destination</label>
	  <input type="text" id="fromCity" name="fromCity" value="<%= flight.getFromCity() %>" size="100"><br><br>
	  <label for="lname">To Destination</label>
	  <input type="text" id="toCity" name="toCity" value="<%= flight.getToCity() %>" size="100"><br><br>
	  <label for="lname">Travel Date</label>
	  <input type="text" id="date" name="date" value="<%= flight.getDate() %>" size="100"><br><br>
	  <label for="lname">Departure Time</label>
	  <input type="text" id="time" name="time" value="<%= flight.getTime() %>" size="100"><br><br>
	  <label for="lname">Travel Duration</label>
	  <input type="text" id="duration" name="duration" value="<%= flight.getDuration() %>" size="100"><br><br>
	  <label for="lname">Airport Name</label>
	  <input type="text" id="airportName" name="airportName" value="<%= flight.getAirportName() %>" size="100"><br><br>
	  <label for="lname">Ticket Price</label>
	  <input type="text" id="ticketPrice" name="ticketPrice" value="<%= flight.getTicketPrice() %>" size="100"><br><br>
	  <input type="submit" value="Submit">
	</form> 
	</div>
</body>
<%@ include file="footer.jsp" %>
</html>