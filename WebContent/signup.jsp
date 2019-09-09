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
		<script src="./js/signup_js.js"></script>
	</head>
	<body>
		<header class="cmpy-header">
			<div class="cmpy-properties">
				<h1>yo!yo!</h1>
				<img src="./images/hotel.png" id="cmpy-logo" alt="company logo"/>
			</div>
			<nav class='nav-bar'>
				<a href="./">HOME</a>
				<a href="signup.jsp">SIGN UP</a>
			</nav>
		</header>
		<div class="alert-msg" id="alert-id">
			<p id="alert-para"></p>
			<button class="alert-btn" id="btn">X</button>
		</div>
		<div class="container">
		<c:if test="${status eq 'true' }">
			<p align="center">Successfully registered.your Unique ID is <c:out value="${id}"/><a href="login.jsp">Click here</a> to continue</p>
		</c:if>
		
			<form action="SignUp" method="post">
    <ul class="flex-outer">
      <li>
        <label for="cust-name">Customer Name</label>
        <input type="text" id="cust-name" name="cname" placeholder="Enter your name" required >
      </li>
      <li>
        <label for="cust-pass">Password</label>
        <input type="password" id="cust-pass" name="pass" placeholder="Enter your Password" required >
      </li>
      <li>
        <label for="cust-cpass">Confirm Password</label>
        <input type="password" id="cust-cpass" name="cpass" placeholder="Enter Password again" required >
      </li>
      <li>
        <label for="DOB">Date of Birth</label>
        <input type="date" name="dob" id="DOB">
      </li>
	  <li>
        <label for="phone">Contact Number</label>
        <input type="text" name="phno" id="phone" placeholder="Enter your Contact Number" value="+91"/ required >
	  </li>
	  <li>
        <label for="cust-mail">Email</label>
        <input type="email" name="mail" id="cust-mail" placeholder="Enter your Email ID"/ required >
	  </li>
	  <li>
        <label for="cust-country">Country</label>
        <input type="text" name="country" id="cust-country" placeholder="Enter your Country"/ required >
	  </li>
	  <li>
        <label for="cust-city">City</label>
        <input type="text" name="city" id="cust-city" placeholder="Enter your City"/ required >
	  </li>
     <li>
        <label for="pincode">Pincode</label>
        <input type="number" name="pin" id="pincode" placeholder="Enter your Pincode"/ required >
	  </li>
      <li>
        <button type="submit" onclick="return save()">Submit</button>
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