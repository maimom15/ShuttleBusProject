package com.EntityClasses;

public class Passenger {
	private int id;
	private String date_of_booking;
	private User_Master user_id;
	private Destination_Master destination_id;
	private String date_of_travel;
	private String seat_number;
	private String ticket_qrcode;
	private Bus_Master bus_id;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate_of_booking() {
		return date_of_booking;
	}
	public void setDate_of_booking(String date_of_booking) {
		this.date_of_booking = date_of_booking;
	}
	public User_Master getUser_id() {
		return user_id;
	}
	public void setUser_id(User_Master user_id) {
		this.user_id = user_id;
	}
	public Destination_Master getDestination_id() {
		return destination_id;
	}
	public void setDestination_id(Destination_Master destination_id) {
		this.destination_id = destination_id;
	}
	public String getDate_of_travel() {
		return date_of_travel;
	}
	public void setDate_of_travel(String date_of_travel) {
		this.date_of_travel = date_of_travel;
	}
	public String getSeat_number() {
		return seat_number;
	}
	public void setSeat_number(String seat_number) {
		this.seat_number = seat_number;
	}
	public String getTicket_qrcode() {
		return ticket_qrcode;
	}
	public void setTicket_qrcode(String ticket_qrcode) {
		this.ticket_qrcode = ticket_qrcode;
	}
	public Bus_Master getBus_id() {
		return bus_id;
	}
	public void setBus_id(Bus_Master bus_id) {
		this.bus_id = bus_id;
	}
	

}
