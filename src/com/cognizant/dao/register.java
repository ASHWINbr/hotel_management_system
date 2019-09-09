package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class register {
	public static boolean insertdb(String cust_id,String custName,String password,String con_password,String dob,String contact_no,String email,String country,String city,int pincode,int age) throws ParseException {
		System.out.println("inside function");
		Connection con= ConnectionHandler.getConnection();
		String query="INSERT INTO `hotel_management_system`.`sign_up` (`Customer_id`,`Customer_Name`,`Password`,`Confirm_Password`,`Date_Of_Birth`,`Contact_number`,`Email`,`Country`,`City`,`Pincode`,`Age`) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
		try {
			
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");     
			 java.util.Date date1= formatter.parse(dob);
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setString(1,cust_id);
			preparedStatement.setString(2,custName);
			preparedStatement.setString(3,password);
			preparedStatement.setString(4,con_password);
		    preparedStatement.setString(5,dob);
			preparedStatement.setString(6,contact_no);
			preparedStatement.setString(7,email);
			preparedStatement.setString(8,country);
			preparedStatement.setString(9,city);
			preparedStatement.setInt(10,pincode);
			preparedStatement.setInt(11,age);
			preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally{
             try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      }
		return false;

	}
}