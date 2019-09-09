package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cognizant.model.HotelList;

public class HotelEditDaoSql {
	public ArrayList<String> getId() {
		ArrayList<String> id=new ArrayList<String>();
		Connection con= ConnectionHandler.getConnection();
		String query="select HotelId from hotel_management_system.addhotel";
		try {
			PreparedStatement preparedStatement=con.prepareStatement(query);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				id.add(rs.getString(1));
			}
			return id;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
		
	}
	
	  public HotelList editHotelData(String id) {
		  Connection con= ConnectionHandler.getConnection();
		  HotelList hotel=new HotelList();
		  String query="select HotelId,HotelName,HotelDescription,Country,City,No_of_ac_room,No_of_non_ac_room,Rate_adult_ac,Rate_adult_non_ac,Rate_child_ac,Rate_child_non_ac from hotel_management_system.addhotel where HotelId=?;";
		  try {
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				hotel.setHotelId(rs.getString(1));
				hotel.setHotelName(rs.getString(2));
				hotel.setHotelDescription(rs.getString(3));
				hotel.setCountry(rs.getString(4));
				hotel.setCity(rs.getString(5));
				hotel.setNumberOfAcRooms(rs.getInt(6));
				hotel.setNumberOfNonAcRooms(rs.getInt(7));
				hotel.setRatePerNightForAdultAc(rs.getInt(8));
				hotel.setRatePerNightForAdultNonAc(rs.getInt(9));
				hotel.setRatePerNightForChildAc(rs.getInt(10));
				hotel.setRatePerNightForChildNonAc(rs.getInt(11));
				
				
			}
			return hotel;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
	  
	  }
	  public boolean editDb(HotelList hList) {
		  Connection con= ConnectionHandler.getConnection();
		  String query="UPDATE `hotel_management_system`.`addhotel` SET `Hotelid`=?, `HotelName`=?, `HotelDescription`=?, `Country`=?, `City`=?, `No_of_ac_room`=?, `No_of_non_ac_room`=?, `Rate_adult_ac`=?,`Rate_adult_non_ac`=?, `Rate_child_ac`=?, `Rate_child_non_ac`=? WHERE `Hotelid`=?;";
		  try {
			  System.out.println("inside class"+hList.getHotelId());
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setString(12,hList.getHotelId());
			String end=hList.getHotelId().substring(3);
			String newId=hList.getHotelName().substring(0,3).concat(end);
			preparedStatement.setString(1,newId);
			preparedStatement.setString(2, hList.getHotelName());
			preparedStatement.setString(3,hList.getHotelDescription() );
			preparedStatement.setString(4, hList.getCountry());
			preparedStatement.setString(5,hList.getCity());
			preparedStatement.setInt(6,hList.getNumberOfAcRooms());
			preparedStatement.setInt(7,hList.getNumberOfNonAcRooms());
			preparedStatement.setInt(8,hList.getRatePerNightForAdultAc() );
			preparedStatement.setInt(9,hList.getRatePerNightForAdultNonAc());
			preparedStatement.setInt(10, hList.getRatePerNightForChildAc());
			preparedStatement.setInt(11, hList.getRatePerNightForChildNonAc());
			preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		  
	  }
	 

}
