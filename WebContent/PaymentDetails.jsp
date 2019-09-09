<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML>
<html>
<head>
<title></title>
<link rel="stylesheet" type="text/css" href="./style/style.css">
</head>
<body>
	<header class="cmpy-header">
		<div class="cmpy-properties">
			<h1>yo!yo!</h1>
			<img src="./images/hotel.png" id="cmpy-logo" alt="company logo" />
		</div>
		<nav class='nav-bar'>
			<a href="./">HOME</a> <a href="./">LOG OUT</a>
		</nav>
	</header>
	<div class="admin-container">
		<table>
			<tr>
				<th>Bank Name</th>
				<th>Card number</th>
				<th>Card Type</th>
				<th>Name on Card</th>
				<th>Expiry Date</th>
				<th>CCV</th>
				<th>Account Number</th>
				<th>PIN number</th>
			</tr>
			<tr>
				<td><c:out value="${pay.getBank_name()}"></c:out></td>
				<td><c:out value="${pay.getCard_number()}"></c:out></td>
				<td><c:out value="${pay.getCard_type()}"></c:out></td>
				<td><c:out value="${pay.getName_on_card()}"></c:out></td>
				<td><c:out value="${pay.getExpiry_date()}"></c:out></td>
				<td><c:out value="${pay.getCcv_number()}"></c:out></td>
				<td><c:out value="${pay.getAccount_number()}"></c:out></td>
				<td>****</td>
			</tr>

		</table>
		<button>Back to Home</button>
	</div>
	<footer class="cmpy-footer">
			<a href="About.jsp">ABOUT US</a>
			<a href="Contact.jsp">CONTACT US</a>
		</footer>
</body>
</html>