<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
<!DOCTYPE HTML>
<html>
	<head>
		<title>
		</title>
		<link rel="stylesheet" type="text/css" href="./style/style.css"> 
	</head>
	<body>
		<header class="cmpy-header">
			<div class="cmpy-properties">
				<h1>yo!yo!</h1>
				<img src="./images/hotel.png" id="cmpy-logo" alt="company logo"/>
			</div>
			<nav class='nav-bar'>
				<a href="./">HOME</a>
				<a href="signup.js">SIGN UP</a>
			</nav>
		</header>
			<div class="container log">
		<c:if test="${message eq 'false' }">
			<h4 align="center">Invalid Id ,Password or phone number</h4>
		</c:if>
			<form action="LoginServlet">
			
    <ul class="flex-outer">
      <li>
      
        <label for="cust-name">Customer ID</label>
        <input type="text" id="name" name="name"placeholder="Enter your Customer ID">
      </li>
      <li>
        <label for="cust-pass">Password</label>
        <input type="password" id="pass" name="pass" placeholder="Enter your Password">
      </li>
      
	  <li>
        <label for="phone">Contact Number</label>
        <input type="text" id="phone" name="phone" placeholder="Enter your Contact Number" value="+91"/>
	  </li>
	 
      <li>
        <button type="submit" onclick="return login()">Submit</button>
      </li>
    </ul>
  </form>
		</div>
		<footer class="cmpy-footer">
			<a href="About.jsp">ABOUT US</a>
			<a href="Contact.jsp">CONTACT US</a>
		</footer>
	</body>
</html>