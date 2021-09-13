<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Details</title>
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
<%@ include file="header.jsp" %>
<%
	int flightId = Integer.parseInt(request.getParameter("f_id"));
%>
<div class = "container">
<div class="jumbotron">
	<form method="post" action="add-booking">
	<input type="hidden" name="f_id" value="<%= flightId %>" ><br><br>
	<div class="form-group">
	  <label for="book">First Name*</label>
	  <input type="text" id="firstName" name="firstName" value="" size="85"><br><br>
	 </div>
	 <div class="form-group">
	  <label for="book">Last Name*</label>
	  <input type="text" id="lastName" name="lastName" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="book">Mobile No.*</label>
	  <input type="text" id="mobileNo" name="mobileNo" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="book">Email Id*</label>
	  <input type="text" id="emailId" name="emailId" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="book">Booking Date*</label>
	  <input type="text" id="bookDate" name="bookDate" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="book">Passenger Count*</label>
	  <input type="text" id="passengerCount" name="passengerCount" value="" size="85"><br><br>
	  </div>
	  <div class="form-group">
	  <label for="book">Address</label>
	  <input type="text" id="address" name="address" value="" size="85"><br><br>
	  </div>
	 
	  <input type="submit" value="Submit">
	</form> 
	</div>
</div>
</body>
<%@ include file="footer.jsp" %>
</html>