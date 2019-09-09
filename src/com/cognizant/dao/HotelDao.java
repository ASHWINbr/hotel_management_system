package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HotelDao implements HotelDaoIn {
	public HashSet<String> getHotelId() {
		Connection con = ConnectionHandler.getConnection();
		HashSet<String> idlist = new HashSet<String>();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("select Hotelid from `hotel_management_system`.`addhotel`");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String hotelid1 = rs.getString(1);
				System.out.println(hotelid1);
				Hotel_details hd = new Hotel_details();
				hd.setHotel_id(hotelid1);
				idlist.add(hotelid1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idlist;

	}


	@Override
	public Hotel_details getDetails(String id) {
		// TODO Auto-generated method stub
		 Connection con=ConnectionHandler.getConnection(); 
		 Hotel_details hotellist=new Hotel_details(); 
		 PreparedStatement ps=null; 
		 try { 
			 ps= con.prepareStatement("select * from `hotel_management_system`.`addhotel` where Hotelid=?"); 
			 ps.setString(1, id);
			 ResultSet rs=null; 
			 rs = ps.executeQuery(); 
			 while(rs.next()) 
			  { 
				 
				  hotellist.setHotel_id(id);
				  hotellist.setHotel_name(rs.getString("HotelName")); 
				 hotellist.setHotel_des(rs.getString("HotelDescription"));
				 hotellist.setCountry(rs.getString("Country"));
				 hotellist.setCity(rs.getString("City"));
				 hotellist.setAc_room(rs.getInt("No_of_ac_room"));
				 hotellist.setNon_ac_room(rs.getInt("No_of_non_ac_room"));
				 //hotellist.setTotal_room(rs.getInt("Total_rooms"));
				 hotellist.setRate_adult_ac(rs.getInt("Rate_adult_ac"));
				 hotellist.setRate_adult_non_ac(rs.getInt("Rate_adult_non_ac"));
				 hotellist.setRate_child_ac(rs.getInt("Rate_child_ac"));
				 hotellist.setRate_child_non_ac(rs.getInt("Rate_child_non_ac"));
		  } 
			 System.out.println();
			 }
		 catch (SQLException e) { 
		   e.printStackTrace(); 
		  } 
		 return hotellist;
	}

}
