package com.cognizant.dao;
import java.util.HashSet;
import java.util.List;

public interface HotelDaoIn {
	public Hotel_details getDetails(String id);
	public HashSet<String> getHotelId();
}
