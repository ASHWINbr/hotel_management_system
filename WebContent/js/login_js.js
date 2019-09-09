    function login(){
	alert("hello");
    //password check
	var flag2=0,flag3=0,flag4=0,flag5=0;
	var password = document.getElementById("pass").value;
	password = password.trim();
	var num = /^[0-9]+$/;
	var letter = /^[a-zA-Z]+$/;
	var special = /^[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]*$/;
	var string_num="";
	var string_alpha="";
	var string_special="";
	var i=0;
	for(i=0;i<password.length;i++){	
	var word = password.charAt(i);
	if(((word >= 'a') &&(word <= 'z')) || ((word >= 'A') && (word <= 'Z'))){	
	string_alpha = string_alpha + word;
	flag2 = 1;
	} else if((word >= 0)&&(word <= 9)){
	string_num = string_num + word;	
	flag3 = 1;
	} else if(word == " "){
		flag5 = 1;
	} else{
		string_special = string_special + word;
		flag4 = 1;
	}
	}
	if(flag5==1){
		alert("password should not contain spaces");
		return false;
	} if(flag2==1 && flag3==1 && flag4==1){
	} else{
		alert("password does not match conditions. Password must be alphanumeric and must contain at least one symbol");
		return false;
	}
	/*var n = password.includes(name);
    if(n == true){
		alert("Password should not contain the customer name");
	}*/
}