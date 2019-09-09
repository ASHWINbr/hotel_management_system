
function callServlet(){

       document.getElementById("studentForm").submit();
       alert("from city");
       return false;
}
function AddHotel_validation(){
alert("hello");
var flag1=0,flag2=0,flag3=0,flag4=0,flag5=0;
	var name = document.getElementById("hotel-name").value;
	var hotel_description = document.getElementById("hotel-description").value;
	var no_AC_Rooms = document.getElementById("no_AC_Rooms").value;
	var no_Non_AC_Rooms = document.getElementById("no_Non_AC_Rooms").value;
	var rate_AC_child = document.getElementById("rate_AC_child").value;
	var rate_Non_AC_child = document.getElementById("rate_Non_AC_child").value;
	var rate_adult = document.getElementById("rate_adult").value;
	var rate_Non_AC_adult = document.getElementById("rate_Non_AC_adult").value;
	name = name.trim();
	hotel_description = hotel_description.trim();
    //name check
	var i = 0;
	for(i = 0;i < name.length;i++){
	var word = name.charAt(i);
	if(((word >= 'a') &&(word <= 'z')) || ((word >= 'A') && (word <= 'Z')) || (word == " ")){
	flag1 = 0;
	}else{
		flag1 = 1;
		break;
	}
    }
	if(flag1 == 1){
		alert("Hotel name  cannot have any digits or special symbols");
		return false;
	}
	if(name.length > 20){
		alert("Hotel name should not exceed 20 characters");
		return false;
	}
	//hotel_description
	if(hotel_description.length > 150){
		alert("hotel_description name should not exceed 150 characters");
		return false;
	}
	//no_Ac_rooms
    if(no_AC_Rooms < 1 || no_AC_Rooms > 300){
    alert(" no_AC_Rooms should not be less than 1 and greater than 300");
	}
	//no_Non_Ac_rooms
    if(no_AC_Rooms < 1 || no_AC_Rooms > 300){
    alert(" no_AC_Rooms should not be less than 1 and greater than 300");
    return false;
	}
	if((rate_AC_child < 2001 || rate_AC_child > 3000)){
		alert("rate for a child in Ac Room should be in the range of Rs.2000 to R.3000");
		return false;
	}
	if(rate_Non_AC_child < 1000 || rate_Non_AC_child > 2000){
		alert("rate for a child in Non Ac room should be in the range of Rs.1000 to R.2000");
		return false;
	}
	if((rate_adult < 2500 || rate_adult > 4000)){
		alert("rate for a adult in Ac Room should be in the range of Rs.2500 to R.4000");
		return false;
	}
	if(rate_Non_AC_adult < 2000 || rate_Non_AC_adult > 2500){
		alert("rate for a adult in Non Ac room should be in the range of Rs.2000 to R.2500");
		return false;
	}
		
}