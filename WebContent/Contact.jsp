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
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

	</head>
	<body>
		<header class="cmpy-header">
			<div class="cmpy-properties">
				<h1>yo!yo!</h1>
				<img src="./images/hotel.png" id="cmpy-logo" alt="company logo"/>
			</div>
			<nav class='nav-bar'>
				<a href="./">LOGIN</a>
				<a href="./">SIGN UP</a>
			</nav>
		</header>
			<h1>CONTACT US</h1>
			<h3>We'd &#10084; to help!</h3>
			<p>We like to create things with fun, open-minded people.feel free to say hello!</p>
			<div class="mail-container">
				<div class="mail-items">
				<form action="mailto:divyakumar304@gmail.com" method="post" enctype="text/plain">
					<table>
						<tr><td><input type="text" id="mail-name" placeholder="Name"/></td></tr>
						<tr><td><input type="mail" id="mail-mailid" placeholder="Email ID"/></td></tr>
						<tr><td><textarea rows="10" cols="50"placeholder="Message"></textarea></td></tr>
					</table>
					<button id="mail-btn" type="submit">Send Mail</button>
				</form>
				</div>
				<div class="mail-items">
				<table>
						<tr><td><i class="fa fa-map-marker fa-lg" aria-hidden="true"></i></td><td><p>YOYO! JBM IT Park,Taramani, Chennai.</p><td></tr>
						<tr><td><i class="fa fa-phone fa-lg" aria-hidden="true"></i></td><td>+91 98564 59023</td></tr>
						<tr><td><i class="fa fa-envelope fa-lg" aria-hidden="true"></i></td><td>yoyo@gmail.com</td></tr>
				</table>
				</div>
			</div>
		<footer class="cmpy-footer">
			<a href="About.jsp">ABOUT US</a>
			<a href="Contact.jsp">CONTACT US</a>
		</footer>
	</body>
</html>