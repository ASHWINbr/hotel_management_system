package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

import com.cognizant.model.HotelList;


public class GetCountryClass  {
       public HashSet<String> getCountry(){
              Connection con=ConnectionHandler.getConnection();
              HashSet<String> col=new HashSet<String>();
              PreparedStatement ps = null;
              try {
                     ps = con.prepareStatement("select country from hotel_management_system.detail;");
              } catch (SQLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
              ResultSet rs=null;
              try {
                     rs = ps.executeQuery();
              } catch (SQLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
              try {
                     while(rs.next()) {
                           String country1=rs.getString(1);
                           System.out.println(country1);
                           HotelList hList=new HotelList();
                           hList.setCountry(country1);
                           col.add(country1);
                     }
              } catch (SQLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
              return col;
              
       }
       public HashSet<String> getCity(String country){
              Connection con=ConnectionHandler.getConnection();
              HashSet<String> cl=new HashSet<String>();
              PreparedStatement ps=null;
              try {
                     ps = con.prepareStatement("select city from hotel_management_system.detail; where country=?");
              } catch (SQLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
              try {
                     ps.setString(1, country);
              } catch (SQLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
              ResultSet rs=null;
              try {
                     rs = ps.executeQuery();
              } catch (SQLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
              try {
                     while(rs.next()) {
                           String city=rs.getString(3);
                           System.out.println(city);
                           HotelList hList=new HotelList();
                           hList.setCity(city);
                           cl.add(city);
                     }
              } catch (SQLException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
              return cl;
              
       }
}


