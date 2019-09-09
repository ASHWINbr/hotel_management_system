document.getElementById("btn").addEventListener("click", function() {
	document.getElementById("alert-id").style.display = 'none';
});
function save() {
	// document.getElementById("alert-id").style.display = 'none';
	document.getElementById("alert-para").innerText = null;
	flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag5 = 0;
	var name = document.getElementById("cust-name").value;
	var password = document.getElementById("cust-pass").value;
	var confirm_password = document.getElementById("cust-cpass").value;
	var DOB = document.getElementById("DOB").value;
	var email_ID = document.getElementById("cust-mail").value;
	var mobile_number = document.getElementById("phone").value;
	var pin_code = document.getElementById("pincode").value;
	var country = document.getElementById("cust-country").value;
	var city = document.getElementById("cust-city").value;
	name = name.trim();
	password = password.trim();
	confirm_password = confirm_password.trim();
	DOB = DOB.trim();
	email_ID = email_ID.trim();
	mobile_number = mobile_number.trim();
	pin_code = pin_code.trim();
	//required check
	if(name.length()==0){
		 document.getElementById("alert-para").innerText = "Name is required";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	if(password.length == 0){
		 document.getElementById("alert-para").innerText = "Password is required";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	if(confirm_password.length == 0){
		 document.getElementById("alert-para").innerText = "confirm_Password is required";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	if(DOB.length == 0){
		document.getElementById("alert-para").innerText = "DateOfBirth is required";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	if(email_ID.length == 0){
		document.getElementById("alert-para").innerText = "email_ID is required";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	if(mobile_number.length == 0){
		document.getElementById("alert-para").innerText = "mobile_number is required";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	if(pin_code.length == 0){
		document.getElementById("alert-para").innerText = "pin_code is required";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	if(country.length == 0){
		document.getElementById("alert-para").innerText = "country is required";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	if(city.length == 0){
		document.getElementById("alert-para").innerText = "city is required";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	
	// name check
	var i = 0;
	for (i = 0; i < name.length; i++) {
		var word = name.charAt(i);
		if (((word >= 'a') && (word <= 'z'))
				|| ((word >= 'A') && (word <= 'Z')) || (word == " ")) {
			flag1 = 0;
		} else {
			flag1 = 1;
			break;
		}
	}
	if (flag1 == 1) {
		alert("Customer Name cannot have any digits or special symbols");
		return false;
	}
	// password check
	var num = /^[0-9]+$/;
	var letter = /^[a-zA-Z]+$/;
	var special = /^[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]*$/;
	var string_num = "";
	var string_alpha = "";
	var string_special = "";
	for (i = 0; i < password.length; i++) {
		var word = password.charAt(i);
		if (((word >= 'a') && (word <= 'z'))
				|| ((word >= 'A') && (word <= 'Z'))) {
			string_alpha = string_alpha + word;
			flag2 = 1;
		} else if ((word >= 0) && (word <= 9)) {
			string_num = string_num + word;
			flag3 = 1;
		} else if (word == " ") {
			flag5 = 1;
		} else {
			string_special = string_special + word;
			flag4 = 1;
		}
	}
	if (flag5 == 1) {
		document.getElementById("alert-para").innerText = "password should not contain spaces";
		document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	if (flag2 == 1 && flag3 == 1 && flag4 == 1) {
	} else {
		document.getElementById("alert-para").innerText = "password does not match conditions. Password must be alphanumeric and must contain at least one symbol";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	var n = password.includes(name);
	if (n == true) {
		document.getElementById("alert-para").innerText = "Password should not contain the customer name";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	// confirm_password check
	if (!(password === confirm_password)) {
		document.getElementById("alert-para").innerText = "Password and confirm password must be the same";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	// date check
	var GivenDate = DOB;
	var CurrentDate = new Date();
	GivenDate = new Date(GivenDate);
	if (GivenDate > CurrentDate) {
		document.getElementById("alert-para").innerText = "Given date is greater than the current date.";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	// email_ID
	var mailformat = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	if (email_ID.match(mailformat)) {
	} else {
		document.getElementById("alert-para").innerText = "You have entered an invalid email address!";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	// mobile_number
	var number = "";
	for (var i = 3; i < mobile_number.length; i++) {
		var num = mobile_number.charAt(i);
		number = number + num;
	}
	if (isNaN(number) || number.indexOf(" ") != -1) {
		document.getElementById("alert-para").innerText = "Invalid Contact Number";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	if (number.length > 10 || number.length < 10) {
		document.getElementById("alert-para").innerText = "Contact Number should be 10 digit including +91 at the begining";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;

	}
	if (!(number.charAt(0) == "9" || number.charAt(0) == "8" || number
			.charAt(0) == "7")) {
		document.getElementById("alert-para").innerText = "Contact Number should start with 9,8 or 7 ";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	// pincode
	if (pin_code.length != 6) {

		document.getElementById("alert-para").innerText = "Pin code should be 6 digits only";
		 document.getElementById("alert-id").style.display = 'flex';
		 return false;
	}
	var first_digit = Math.floor(pin_code / 100000);
	if (first_digit == 0) {
		document.getElementById("alert-para").innerText = "pincode should not start with 0";
	    document.getElementById("alert-id").style.display = 'flex';
	    return false;
	}
}
