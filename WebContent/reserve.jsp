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
				<a href="./">SIGN UP</a>
			</nav>
		</header>
		<div class="add_Container">
			<form action="reserve_hotel" name="final_book" method="post" >
				<table>
					<tr>
						<td><label>Hotel Id</label></td>
						<td><label for="booking-date">Booking Date</label></td>
						<td><label for="arrival-date">Arrival Date</label></td>
					</tr>
					<tr>
						<td><input type="text" name="reserve_id" value="<%=request.getParameter("ho_id")%>" readonly="readonly"/></td>
						<td> <input type="date" name="booking-date" id="booking-date"></td>
						<td> <input type="date" name="arrival-date" id="arrival-date"></td>
					</tr>
					<tr>
					</tr>
					<tr>
					<td></td>
					</tr>
					<tr>
					<td></td>
					</tr>
					<tr>
						<td><label for="departure-date">Departure Date</label></td>
						<td><label for="no_of_adults">Number of Adults</label></td>
						<td><label for="no_of_child">Number of Children</label></td>
					</tr>
					<tr>
						<td> <input type="date" name="departure-date" id="departure-date"></td>
						<td> <input type="number" name="no_of_adults" id="no_of_adults"></td>
						<td> <input type="number" name="no_of_child" id="no_of_child"></td>
					</tr>
					<tr>
					<td></td>
					</tr>
					<tr>
					<td></td>
					</tr>
					<tr>
						<td><label for="no_of_nights">Number of Nights</label></td>
						<td><label for="total_room">Total Rooms</label></td>
						<td>Room Type </td>
					</tr>
					<tr>
						<td> <input type="number" name="no_of_nights" id="no_of_nights"></td>
						<td> <input type="number" name="total_room" id="total_room"></td>
						<td><select name="room_type" id="room_type">
						 <option value="">Select Room Type</option>
					    <option value="A/C">A/C</option>
					    <option value="Non A/C">Non A/C</option>
					    </select></td>						
					</tr>
					
					
					<tr>
					<td></td>
					</tr>
					<tr><td colspan=3><center><input type="submit" name="sub" id="sub" value="SUBMIT"/></center></td></tr>
				</table>
			</form>
		</div>
		<footer class="cmpy-footer">
			<a href="About.jsp">ABOUT US</a>
			<a href="Contact.jsp">CONTACT US</a>
		</footer>
	</body>
</html>