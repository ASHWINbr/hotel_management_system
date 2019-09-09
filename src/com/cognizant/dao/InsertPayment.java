package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cognizant.model.Payment;

public class InsertPayment {
	public void InsertData(Payment pay) {
		Connection con = ConnectionHandler.getConnection();
		PreparedStatement ps=null;
		try {
			
			 ps = con.prepareStatement(
					"insert into payment(bank_name,expiry_date,card_number,ccv_number,card_type,account_number,name_on_card,pin_number) values(?,?,?,?,?,?,?,?)");
			ps.setString(1, pay.getBank_name());
			ps.setString(2, pay.getExpiry_date());
			ps.setLong(3,pay.getCard_number());
			ps.setInt(4, pay.getCcv_number());
			ps.setString(5, pay.getCard_type());
			ps.setLong(6,pay.getAccount_number());
			ps.setString(7, pay.getName_on_card());
			ps.setLong(8, pay.getPin_number());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
