package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cognizant.model.HotelList;

public class HotelAddDaoSql implements HotelDaoImpl {

	@Override
	public boolean getHotelData(HotelList hotelListAdd) {
		// TODO Auto-generated method stub
		Connection con= ConnectionHandler.getConnection();
	//	String query = insert into addhotel values ();  
		String query="INSERT INTO `hotel_management_system`.`addhotel` (`Hotelid`, `HotelName`, `HotelDescription`, `Country`, `City`, `No_of_ac_room`, `No_of_non_ac_room`, `Rate_adult_ac`, `Rate_adult_non_ac`, `Rate_child_ac`, `Rate_child_non_ac`) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
		try {
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setString(1,hotelListAdd.getHotelId());
			preparedStatement.setString(2, hotelListAdd.getHotelName());
			preparedStatement.setString(3,hotelListAdd.getHotelDescription() );
			preparedStatement.setString(4, hotelListAdd.getCountry());
			preparedStatement.setString(5,hotelListAdd.getCity());
			preparedStatement.setInt(6,hotelListAdd.getNumberOfAcRooms());
			preparedStatement.setInt(7,hotelListAdd.getNumberOfNonAcRooms());
			preparedStatement.setInt(8,hotelListAdd.getRatePerNightForAdultAc() );
			preparedStatement.setInt(9,hotelListAdd.getRatePerNightForAdultNonAc());
			preparedStatement.setInt(10, hotelListAdd.getRatePerNightForChildAc());
			preparedStatement.setInt(11, hotelListAdd.getRatePerNightForChildNonAc());
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

	
	


	

