<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<title></title>
<link rel="stylesheet" type="text/css" href="./style/style.css">
<script src="./js/Payment_js.js"></script>
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
	<div class="add_Container" id="pay-container">
		<form action="PaymentServlet">
			<table>
				<tr>
					<td><label for="bank-name">Bank Name</label> <input
						type="text" id="bank-name" name="bank-name" placeholder="Enter bank name" required/></td>
					<td><label for="exp-date">Expiry Date</label> <input
						type="text" id="exp-date" name="exp-date" placeholder="MM/YY" required/></td>
				</tr>
				<tr>
					<td><label for="card-type" id="card-type-label">Card
							Type</label> <select id="card-type" name="card-type" required>
							<option>select card type</option>
							<option>credit card</option>
							<option>debit card</option>
					</select></td>
					<td><label for="ccv">CCV Number</label> <input type="number"
						id="ccv" name="ccv" placeholder="Enter CCV Number" required/></td>
				</tr>
				<tr>
					
					<td><label for="card-no">Card Number</label> <input
						type="text" id="card-no" name="card-no" placeholder="Enter card number" required/>
					</td>
					<td><label for="acc-no">Account number Number</label> <input
						type="text" id="acc-no" name="acc-no" placeholder="Enter account Number" required/></td>
				</tr>
				<tr>
					<td><label for="card-name">Name on card</label> <input
						type="text" id="card-name" name="card-name" placeholder="Enter name on card" required/></td>
					<td><label for="pin-no">Pin Number</label> <input
						type="password" id="pin-no" name="pin-no" placeholder="Enter pin Number" required/></td>
				</tr>
				<tr>
					<td><button onclick="return validatePayment()">Pay</button></td>
				</tr>
			</table>
		</form>
	</div>
	<footer class="cmpy-footer">
			<a href="About.jsp">ABOUT US</a>
			<a href="Contact.jsp">CONTACT US</a>
		</footer>
</body>
</html>
