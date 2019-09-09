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
		<script src="./js/search_script.js"></script>
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
		<div class="container">
			<form action="SearchHotels" id="searchform" method="get">
			<center>
			<br/><label class="id_label">Hotel Id :</label>
		<c:choose>
		<c:when test="${hotelid eq null}">
		
					<select class="hotelid" id="hotelid" name="hotelid" onchange="callServlet();">
							<option value="">Select Hotel Id</option>
							<c:forEach items="${idlist}" var="item1">
					  			<option value="${item1}">${item1}</option>
  							</c:forEach>
					</select>
	   </c:when>
		<c:otherwise>
					<select class="hotelid" id="hotelid" name="hotelid" onchange="callServlet();">
							<option value="${hotelid}">${hotelid}</option>	
							<c:forEach items="${idlist}" var="item1">
					  			<option value="${item1}">${item1}</option>
  							</c:forEach>
					</select>
					</center>

<br/>
<br/>
</form>
<div class="display_div">
<pre class="display_detail">

<label id="display_label">Hotel id: </label><c:out value="${hotellist.hotel_id}"></c:out>				<label id="display_label">Hotel Name: </label><c:out value="${hotellist.hotel_name}">,</c:out> <c:out value="${hotellist.city}">,</c:out> <c:out value="${hotellist.country}"></c:out>

<label id="display_label">Total Rooms Available: </label><c:out value="${total}"></c:out>		<label id="display_label">Rate per night for adult		</label><label id="display_label">Rate per night for child</label>
	<label id="display_label">A/C Rooms: </label><c:out value="${hotellist.ac_room}"></c:out>				<label id="display_label">A/c: </label><c:out value="${hotellist.rate_adult_ac}"></c:out>				<label id="display_label">A/c: </label><c:out value="${hotellist.rate_child_ac}"></c:out>
	<label id="display_label">Non A/C Rooms: </label><c:out value="${hotellist.non_ac_room}"></c:out>			<label id="display_label">Non A/C: </label><c:out value="${hotellist.rate_adult_non_ac}"></c:out>			<label id="display_label">Non A/C: </label><c:out value="${hotellist.rate_child_non_ac}"></c:out>

<label id="display_label">About Hotel:</label>
</pre>
<span class="display_detail">
<c:out value="${hotellist.hotel_des}"></c:out>
<br/>
<br/>
</span>
<form action="reserve.jsp">
<input type="hidden" name="ho_id" value="${hotellist.hotel_id}"/>
<span><input type="submit" class="book_button" value="Reserve" ></span>

<br/>
</form>
</div>
<br/>


	  </c:otherwise>
	  </c:choose>
					
	   </div>
		
		<footer class="cmpy-footer">
			<a href="About.jsp">ABOUT US</a>
			<a href="Contact.jsp">CONTACT US</a>
		</footer>
	</body>
</html>