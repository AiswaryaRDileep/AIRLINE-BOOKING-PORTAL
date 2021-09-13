<%@page import="com.simplilearn.dao.PaymentDAO"%>
<%@page import="com.simplilearn.entity.Payment"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Booking Report</title>
</head>
<body>
<%@ include file="adminheader.jsp" %>
<br>
<br>
<%
	List<Payment> pay = PaymentDAO.ListPayment();
	request.setAttribute("paylist", pay);

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
	        <th>Passenger Name</th>
	        <th>Email id</th>
	        <th>MobileNo.</th>
	        <th>Address</th>
	        <th>Passenger Count</th>
	        <th>Net Fare</th>
	        <th>AccountNumber</th>
	        <th>Cancel</th>
	        <th>Refund</th>
	      </tr>
	    </thead>
	    <tbody>
	    	
 				<tr>
			        <td>  </td>
			        <td> </td>
			        <td>  </td>
			        <td>  </td>
			        <td>  </td>
			        <td>  </td>
			        <td>  </td>
			        <td>  </td>
			        <td>  </td>
			        <td>  </td>
			        <td>  </td>
			        <td>  </td>
			        <td>  </td>
			        <td><a class="btn btn-danger"> CANCEL </a></td>
			        <td><a class="btn btn-danger"> REFUND </a></td>
			     </tr>
			
	     <!--  -->
	    </tbody>
	  </table>
</div>

</body>
<%@ include file="footer.jsp" %>

</html>