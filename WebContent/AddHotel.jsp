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
		<script type = "text/javascript" src ="./js/AddHotel_js.js"></script>
	</head>
	<body>
		<header class="cmpy-header">
			<div class="cmpy-properties">
				<h1>yo!yo!</h1>
				<img src="./images/hotel.png" id="cmpy-logo" alt="company logo"/>
			</div>
			<nav class='nav-bar'>
				<a href="./">HOME</a>
				<a href="./">LOG OUT</a>
			</nav>
		</header>
		<c:if test="${status eq 'true' }">
			<p align="center">Successfully added.<a href="EditGetIdServlet">Click here</a> to continue</p>
		</c:if>
		<div class="add_Container">
		
			<form action="AddServlet">
				<table>
				
					<tr>
						<td><label for="hotel-name">Hotel Name</label></td>
						<td><label for="hotel-country">Country</label></td>
						<td><label for="hotel-city">City</label></td>
					</tr>
					<tr>
					    
						<td> <input type="text" id="hotel-name" name="hotel-name" placeholder="Enter Hotel name"></td>
						<td> <input type="text" id="hotel-country" name="hotel-country" placeholder="Enter Country"></td>
						<td> <input type="text" id="hotel-city" name="hotel-city" placeholder="Enter City"></td>
					</tr>
					<tr>
						<td> <label for="no_AC_Rooms">Number of AC Rooms</label></td>
						<td> <label for="no_Non_AC_Rooms">Number of NON AC Rooms</label></td>
					</tr>
					<tr>
						<td> <input type="number" id="no_AC_Rooms" name="no_AC_Rooms" placeholder="Enter no of AC rooms available"></td>
						<td> <input type="number" id="no_Non_AC_Rooms" name="no_Non_AC_Rooms"placeholder="Enter no of NON AC rooms available"></td>
						
					</tr>
					<tr><td><label><span id="success">Rate per night for child</span></label></td><tr>
					<tr>
						<td> <label for="rate_AC_child">IN AC ROOM</label></td>
						<td> <label for="rate_Non_AC_child">IN NON AC Rooms</label></td>
					</tr>
					<tr>
						<td> <input type="number" id="rate_AC_child" name="rate_AC_child" placeholder="Enter rate per night for child in AC rooms"></td>
						<td> <input type="number" id="rate_Non_AC_child" name="rate_Non_AC_child" placeholder="Enter rate per night for child in NON AC rooms"></td>
					</tr>
					<tr><td><label><span id="success">Rate per night for Adult<span></label></td><tr>
					<tr>
						<td> <label for="rate_adult">IN AC ROOM</label></td>
						<td> <label for="rate_Non_AC_adult">IN NON AC Rooms</label></td>
					</tr>
					<tr>
						<td> <input type="number" id="rate_adult" name="rate_adult" placeholder="Enter rate per night for Adult in AC rooms"></td>
						<td> <input type="number" id="rate_Non_AC_adult" name="rate_Non_AC_adult" placeholder="Enter rate per night for Adult in NON AC rooms"></td>
					</tr>
					<tr>
						<td> <label for="description">Description</label></td></tr>
					<tr>
						<td><textarea id="description" name="description" rows="5" cols="50"></textarea></td>
					</tr>
					<tr><td><button onclick="return AddHotel_validation()">ADD HOTEL</button></td></tr>
				</table>
			</form>
		</div>
		<footer class="cmpy-footer">
			<a href="About.jsp">ABOUT US</a>
			<a href="Contact.jsp">CONTACT US</a>
		</footer>
	</body>
</html>