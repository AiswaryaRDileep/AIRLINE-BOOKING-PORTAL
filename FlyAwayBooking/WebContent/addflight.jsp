
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Flight</title>
<style>
label {
font-style: italic;
}
div.container {
position: center;
padding-left: 5%;
padding-right: 5%;
padding-top:5%;
padding-bottom:5%;
}

</style>
</head>
<body>
<%@ include file="adminheader.jsp" %>

<div class="container">
	<div class="jumbotron">
	<form method="post" action="add-flight">
	<div class="form-group">
	  <label for="fname">Flight No.</label>
	  <input type="text" id="flightNo" name="flightNo" value="" size="85"><br><br>
	 </div>
	 <div class="form-group">
	  <label for="lname">Flight Name</label>
	  <input type="text" id="flightName" name="flightName" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="namel">From Destination</label>
	  <input type="text" id="fromCity" name="fromCity" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="lname">To Destination</label>
	  <input type="text" id="toCity" name="toCity" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="lname">Travel Date</label>
	  <input type="text" id="date" name="date" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="lname">Departure Time</label>
	  <input type="text" id="time" name="time" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="lname">Travel Duration</label>
	  <input type="text" id="duration" name="duration" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="lname">Airport Name</label>
	  <input type="text" id="airportName" name="airportName" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="lname">Ticket Price</label>
	  <input type="text" id="ticketPrice" name="ticketPrice" value="" size="85"><br><br>
	  </div>
	  <input type="submit" value="Submit">
	</form> 
	</div>
</div>
</body>
<%@ include file="footer.jsp" %>
</html>