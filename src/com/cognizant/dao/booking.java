package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class booking {
	public static void book_db(String book_id,String hotel_id,String booking_date,String arrival_date,String departure_date,int no_of_adults,int no_of_child,int no_of_nights,int total_room,String room_type) throws ParseException {
		System.out.println("inside function");
		System.out.println("hott"+hotel_id);
		Connection con= ConnectionHandler.getConnection();
		String query1="SELECT Rate_adult_ac,Rate_adult_non_ac,Rate_child_ac,Rate_child_non_ac from `hotel_management_system`.`addhotel` where Hotelid=?"; 
		int total_rate=0;
		try {
			
			 PreparedStatement ps= con.prepareStatement(query1); 
				 ps.setString(1,hotel_id);
				 ResultSet rs=ps.executeQuery(); 
				 rs.next();
				 int Rate_adult_ac=rs.getInt("Rate_adult_ac");
				 int Rate_adult_non_ac=rs.getInt("Rate_adult_non_ac");
				 int Rate_child_ac=rs.getInt("Rate_child_ac");
				 int Rate_child_non_ac=rs.getInt("Rate_child_non_ac");
				 System.out.println("rate"+Rate_adult_ac);
				 
				 if(room_type.equals("A/C")) {
					 total_rate=(((no_of_adults*Rate_adult_ac)+(no_of_child*Rate_child_ac))*no_of_nights)*total_room;
					 System.out.println("rate"+total_rate);
				 }
				 else if(room_type.equals("Non A/C")) {
					 	total_rate=(((no_of_adults*Rate_adult_non_ac)+(no_of_child*Rate_child_non_ac))*no_of_nights)*total_room;
					}
				 
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String query="INSERT INTO `hotel_management_system`.`book_room` (`Book_Id`,`Hotel_Id`,`Booking_Date`,`Arrival_Date`,`Departure_Date`,`No_of_adults`,`No_of_child`,`No_of_nights`,`Total_room`,`Room_type`,`Total_price`) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
		try {
			
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setString(1,book_id);
			preparedStatement.setString(2,hotel_id);
			preparedStatement.setString(3,booking_date);
			preparedStatement.setString(4,arrival_date);
		    preparedStatement.setString(5,departure_date);
			preparedStatement.setInt(6,no_of_adults);
			preparedStatement.setInt(7,no_of_child);
			preparedStatement.setInt(8,no_of_nights);
			preparedStatement.setInt(9,total_room);
			preparedStatement.setString(10,room_type);
			preparedStatement.setInt(11,total_rate);
			preparedStatement.executeUpdate();
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

	}
}
