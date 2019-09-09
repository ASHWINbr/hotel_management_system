package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HotelDeleteDaoSql {
	public boolean deleteData(String id) {
		Connection con=ConnectionHandler.getConnection();
		String query="delete from hotel_management_system.addhotel where `HotelId`=?;";
		try {
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}
