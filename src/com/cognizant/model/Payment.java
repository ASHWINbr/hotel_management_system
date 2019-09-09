package com.cognizant.model;


public class Payment {
	String bank_name;
	String expiry_date;
	long card_number;
	int ccv_number;
	String card_type;
	long account_number;
	String name_on_card;
	long pin_number;
	public Payment(String bank_name, String expiry_date, long card_number, int ccv_number, String card_type,
			long account_number, String name_on_card, long pin_number) {
		super();
		this.bank_name = bank_name;
		this.expiry_date = expiry_date;
		this.card_number = card_number;
		this.ccv_number = ccv_number;
		this.card_type = card_type;
		this.account_number = account_number;
		this.name_on_card = name_on_card;
		this.pin_number = pin_number;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public long getCard_number() {
		return card_number;
	}
	public void setCard_number(long card_number) {
		this.card_number = card_number;
	}
	public int getCcv_number() {
		return ccv_number;
	}
	public void setCcv_number(int ccv_number) {
		this.ccv_number = ccv_number;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public String getName_on_card() {
		return name_on_card;
	}
	public void setName_on_card(String name_on_card) {
		this.name_on_card = name_on_card;
	}
	public long getPin_number() {
		return pin_number;
	}
	public void setPin_number(long pin_number) {
		this.pin_number = pin_number;
	}
	
}

