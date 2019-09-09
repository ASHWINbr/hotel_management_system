package com.cognizant.model;

public class HotelList {
	
	private String hotelId;
	private String country;
	private String city;
	//private int totalRooms;

	private String hotelName;
	private String hotelDescription;
	private int numberOfAcRooms;
	private int numberOfNonAcRooms;
	private int ratePerNightForAdultAc;
	private int ratePerNightForChildAc;
	private int ratePerNightForAdultNonAc;
	private int ratePerNightForChildNonAc;
	
	
	
	
	public HotelList() {
		super();
		// TODO Auto-generated constructor stub
	}


	public HotelList(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}


	public HotelList(String hotelId, String country, String city, String hotelName, String hotelDescription,
			int numberOfAcRooms, int numberOfNonAcRooms, int ratePerNightForAdultAc, int ratePerNightForChildAc,
			int ratePerNightForAdultNonAc, int ratePerNightForChildNonAc) {
		super();
		this.hotelId = hotelId;
		this.country = country;
		this.city = city;
		this.hotelName = hotelName;
		this.hotelDescription = hotelDescription;
		this.numberOfAcRooms = numberOfAcRooms;
		this.numberOfNonAcRooms = numberOfNonAcRooms;
		this.ratePerNightForAdultAc = ratePerNightForAdultAc;
		this.ratePerNightForChildAc = ratePerNightForChildAc;
		this.ratePerNightForAdultNonAc = ratePerNightForAdultNonAc;
		this.ratePerNightForChildNonAc = ratePerNightForChildNonAc;
	}




	public String getHotelId() {
		return hotelId;
	}




	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
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




	public String getHotelName() {
		return hotelName;
	}




	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}




	public String getHotelDescription() {
		return hotelDescription;
	}




	public void setHotelDescription(String hotelDescription) {
		this.hotelDescription = hotelDescription;
	}




	public int getNumberOfAcRooms() {
		return numberOfAcRooms;
	}




	public void setNumberOfAcRooms(int numberOfAcRooms) {
		this.numberOfAcRooms = numberOfAcRooms;
	}




	public int getNumberOfNonAcRooms() {
		return numberOfNonAcRooms;
	}




	public void setNumberOfNonAcRooms(int numberOfNonAcRooms) {
		this.numberOfNonAcRooms = numberOfNonAcRooms;
	}




	public int getRatePerNightForAdultAc() {
		return ratePerNightForAdultAc;
	}




	public void setRatePerNightForAdultAc(int ratePerNightForAdultAc) {
		this.ratePerNightForAdultAc = ratePerNightForAdultAc;
	}




	public int getRatePerNightForChildAc() {
		return ratePerNightForChildAc;
	}




	public void setRatePerNightForChildAc(int ratePerNightForChildAc) {
		this.ratePerNightForChildAc = ratePerNightForChildAc;
	}




	public int getRatePerNightForAdultNonAc() {
		return ratePerNightForAdultNonAc;
	}




	public void setRatePerNightForAdultNonAc(int ratePerNightForAdultNonAc) {
		this.ratePerNightForAdultNonAc = ratePerNightForAdultNonAc;
	}




	public int getRatePerNightForChildNonAc() {
		return ratePerNightForChildNonAc;
	}




	public void setRatePerNightForChildNonAc(int ratePerNightForChildNonAc) {
		this.ratePerNightForChildNonAc = ratePerNightForChildNonAc;
	}

   

	
	
    
	

	
	
	
	
	


}
