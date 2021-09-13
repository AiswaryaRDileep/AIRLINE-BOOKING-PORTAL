<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>FlyAway</title>
<style>

input[type=text], input[type=password] {
  width: 45%;
  padding: 10px 18px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
button {
  background-color: #87CEEB;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 90%;
}

button:hover {
  opacity: 0.8;
}
</style> 
</head>
<body>
<%@ include file="header.jsp" %>


<div class=container4 style="padding-left:50px; padding-top:50px; Font-style:italic; color:	#87CEEB;">
  <p>Welcome to FlyAway Booking!<p>
</div>
<br>

<div class="jumbotron">
	<form action="search-flight" method="post">
	  <div class="container">
		 
		    <input type="text" placeholder="Depart From" name="fromCity" required>
		    <input type="text" placeholder="Arrive To" name="toCity" required>
		    <button type="submit">Search</button>
		  
		</div> 
	
</form>

</div>


</body>
<%@ include file="footer.jsp" %>
</html>