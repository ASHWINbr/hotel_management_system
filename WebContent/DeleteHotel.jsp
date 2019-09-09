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
		<script src="./js/DeleteHotel_js.js"></script>
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
			<p align="center">Successfully deleted.<a href="EditGetIdServlet">Click here</a> to continue</p>
		</c:if>
		<div class="add_Container">
		
			<form action=DeleteDataServlet>
				<table>
					<tr>
						<td><label for="hotel-id">Hotel ID</label></td>
						<td><label for="hotel-country">Country</label></td>
						<td><label for="hotel-city">City</label></td>
						<td><label for="hotel-rooms">Total Rooms</label></td>
					</tr>
					<tr>
						<td> <input type="text" name="hotel-id" value="${list.hotelId}" readonly="readonly" id="hotel-id"></td>
						<td> <input type="text"  name="hotel-country"  value="<c:out value="${list.country }"/>" id="hotel-country" disabled></td>
						<td> <input type="text" id="hotel-city" name="hotel-city" value="<c:out value="${list.city }"/>" disabled></td>
						<td> <input type="number" id="hotel-rooms" name="hotel-rooms"  value="<c:out value="${total}"/>" disabled></td>
					</tr>
					<tr>
						<td><label for="hotel-name">Hotel Name</label></td>
						<td> <label for="no_AC_Rooms">Number of AC Rooms</label></td>
						<td> <label for="no_Non_AC_Rooms">Number of NON AC Rooms</label></td>
					</tr>
					<tr>
						<td> <input type="text" id="hotel-name" name="hotel-name" value="<c:out value="${list.hotelName }"/>" disabled ></td>
						<td> <input type="number" id="no_AC_Rooms" name="no_AC_Rooms"  value="<c:out value="${list.numberOfAcRooms}"/>" disabled ></td>
						<td> <input type="number" id="no_Non_AC_Rooms"name="no_Non_AC_Rooms" value="<c:out value="${list.numberOfNonAcRooms }"/>" disabled ></td>
						
					</tr>
					<tr><td><label><span id="success">Rate per night for child</span></label></td><tr>
					<tr>
						<td> <label for="rate_AC_child">IN AC ROOM</label></td>
						<td> <label for="rate_Non_AC_child">IN NON AC Rooms</label></td>
					</tr>
					<tr>
						<td> <input type="number" id="rate_AC_child" name="rate_AC_child"  value="<c:out value="${list.ratePerNightForChildAc }"/>" disabled ></td>
						<td> <input type="number" id="rate_Non_AC_child" name="rate_Non_AC_child" value="<c:out value="${list.ratePerNightForChildNonAc }"/>" disabled ></td>
					</tr>
					<tr><td><label><span id="success">Rate per night for Adult<span></label></td><tr>
					<tr>
						<td> <label for="rate_adult">IN AC ROOM</label></td>
						<td> <label for="rate_Non_AC_adult">IN NON AC Rooms</label></td>
					</tr>
					<tr>
						<td> <input type="number" name="rate_adult" id="rate_adult" disabled value="<c:out value="${list.ratePerNightForAdultAc }"/>"></td>
						<td> <input type="number" name="rate_Non_AC_adult" id="rate_Non_AC_adult" disabled value="<c:out value="${list.ratePerNightForAdultNonAc }"/>"></td>
					</tr>
					<tr>
						<td> <label for="description">Hotel Details</label></td>
						
					</tr>	
					<tr>
						<td><input type="text" name="description" id="description"  value="<c:out value="${list.hotelDescription}"/>" rows="5" disabled cols="50"></textarea></td>
						
					</tr>
					<tr><td><button id="delete-hotel">DELETE</button></td></tr>
				</table>
			</form>
		</div>
		<footer class="cmpy-footer">
			<a href="About.jsp">ABOUT US</a>
			<a href="Contact.jsp">CONTACT US</a>
		</footer>
	</body>
</html>