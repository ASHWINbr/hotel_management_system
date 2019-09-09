function validatePayment(){
       var numbers = /^[A-Za-z]+$/;
       var bank_name=document.getElementById("bank-name").value;
       var card_no=document.getElementById("card-no").value;
       var acc_no=document.getElementById("acc-no").value;
       var ccv_no=document.getElementById("ccv").value;
       var card_name=document.getElementById("card-name").value;
       var pin_no=document.getElementById("pin-no").value;
       var card_type=document.getElementById("card-type").value;
       var exp_date=document.getElementById("exp-date").value;
       
       var today = new Date();
       var cmonth = parseInt(today.getMonth()); 
       var cyear = parseInt(today.getFullYear().toString().substr(-2));
       var fmonth = parseInt(exp_date.slice(0,2));
       var fyear = parseInt(exp_date.slice(-2));
       
       if(bank_name.length < 9){
              alert("Enter valid bank name!!");
              return false;
       }
       else if(card_no.length < 16 || card_no.match(numbers)){
              alert("Credit card number must allow only integers and will be 16 digits long!");
              return false;
       }
       else if(acc_no.length < 10 || acc_no.match(numbers)){
              alert("Account number must allow only numbers and should start with 00. Total length of this field is 10");
              return false;
       }
       else if(ccv_no.length < 3 || ccv_no.length > 3 || ccv_no.match(numbers)){
              alert("Cvv number must allow only numbers and will be 3 digits long");
              return false;
       }
       else if(card_name.length<1 || card_name.length>30){
              alert("Name on card must allow only alphabets and should not exceed 30 characters");
              return false;
       }
       else if((pin_no.length!=4) && (pin_no.length!=6)){
              alert("Pin will allow only numbers and must be either 4 digits or 6 digits long");
              return false;
       }
       else if(card_type==""){
              alert("Please select card type!");
              return false;
       }
       else if(cyear>fyear){
              alert("Enter correct expiry Date");
              return false;
       }
}
