<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" href="assets\css\adminlogin.css">
</head>
<body>
<%@ include file="header.jsp" %>

<form action="admin-login" method="post">
	  <div class="imgcontainer">
	    <img src="assets/avatar.jpg" alt="Avatar" class="avatar">
	  </div>
	
	  <div class="container">
		    <div class="sizing">
		    <input type="text" placeholder="Enter Username" name="userName" required><br>
		    
		    <input type="password" placeholder="Enter Password" name="password" required><br>
		    
		    <button type="submit">Login</button><br>
		  	</div>
		</div> 
	  <div class="container" style="background-color:#f1f1f1">
		    <a href="index.jsp" class="btn btn-danger">Cancel</a>
		    <span class="psw">Forgot <a href="#">password?</a></span>
	  </div><br>
</form>
 
</body>
<%@ include file="footer.jsp" %>
</html>