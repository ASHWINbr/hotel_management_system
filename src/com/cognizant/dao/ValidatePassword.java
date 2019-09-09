package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidatePassword {
	
	public ValidatePassword() {
		super();
		// TODO Auto-generated constructor stub
	}
    public String getIfAdmin(String id) {
    	Connection con=ConnectionHandler.getConnection();
    	try {
			PreparedStatement preparedStatement=con.prepareStatement("select isAdmin from sign_up where Customer_id=?");
			String isAdmin="No";
			preparedStatement.setString(1,id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				isAdmin=rs.getString(1);
			}
			System.out.println(isAdmin);
			if(isAdmin==null) {
				isAdmin="No";
			}
			
			System.out.println("in class"+isAdmin);
			return isAdmin;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    	
    }
	public boolean getPwd(String id,String pwd,String phno) {
		Connection con=ConnectionHandler.getConnection();
		String pass="";
		String contact="";
		try {
			PreparedStatement preparedStatement=con.prepareStatement("select Password,Contact_number from sign_up where Customer_id=?");

			preparedStatement.setString(1,id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
			 pass=rs.getString(1);
			contact=rs.getString(2);
			System.out.println(pass+" "+contact);
			}
			if(pass.equals(pwd)&&phno.equals(contact)) {
				return true;
			}
			else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
		
	}

	
}
