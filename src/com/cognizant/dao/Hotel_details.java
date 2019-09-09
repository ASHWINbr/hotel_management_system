package com.cognizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Hotel_details {
		String hotel_id;
		String hotel_name;
		String hotel_des;
		String country;
		String city;
		int ac_room;
		int non_ac_room;
		int total_room;
		int rate_adult_ac;
		int rate_adult_non_ac;
		int rate_child_ac;
		int rate_child_non_ac;
			
		public Hotel_details() {
			super();
		}

		public Hotel_details(String hotel_id, String hotel_name, String hotel_des, String country,
				String city, int ac_room, int non_ac_room, int total_room, int rate_adult_ac, int rate_adult_non_ac,
				int rate_child_ac, int rate_child_non_ac) {
			super();
			this.hotel_id = hotel_id;
			this.hotel_name = hotel_name;
			this.hotel_des = hotel_des;
			this.country = country;
			this.city = city;
			this.ac_room = ac_room;
			this.non_ac_room = non_ac_room;
			this.total_room = total_room;
			this.rate_adult_ac = rate_adult_ac;
			this.rate_adult_non_ac = rate_adult_non_ac;
			this.rate_child_ac = rate_child_ac;
			this.rate_child_non_ac = rate_child_non_ac;
		}

		public String getHotel_id() {
			return hotel_id;
		}

		public void setHotel_id(String hotel_id) {
			this.hotel_id = hotel_id;
		}

		public String getHotel_name() {
			return hotel_name;
		}

		public void setHotel_name(String hotel_name) {
			this.hotel_name = hotel_name;
		}

		public String getHotel_des() {
			return hotel_des;
		}

		public void setHotel_des(String hotel_des) {
			this.hotel_des = hotel_des;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getAc_room() {
			return ac_room;
		}

		public void setAc_room(int ac_room) {
			this.ac_room = ac_room;
		}

		public int getNon_ac_room() {
			return non_ac_room;
		}

		public void setNon_ac_room(int non_ac_room) {
			this.non_ac_room = non_ac_room;
		}

		public int getTotal_room() {
			return total_room;
		}

		public void setTotal_room(int total_room) {
			this.total_room = total_room;
		}

		public int getRate_adult_ac() {
			return rate_adult_ac;
		}

		public void setRate_adult_ac(int rate_adult_ac) {
			this.rate_adult_ac = rate_adult_ac;
		}

		public int getRate_adult_non_ac() {
			return rate_adult_non_ac;
		}

		public void setRate_adult_non_ac(int rate_adult_non_ac) {
			this.rate_adult_non_ac = rate_adult_non_ac;
		}

		public int getRate_child_ac() {
			return rate_child_ac;
		}

		public void setRate_child_ac(int rate_child_ac) {
			this.rate_child_ac = rate_child_ac;
		}

		public int getRate_child_non_ac() {
			return rate_child_non_ac;
		}

		public void setRate_child_non_ac(int rate_child_non_ac) {
			this.rate_child_non_ac = rate_child_non_ac;
		}

}
