package com.EntityClasses;

import java.util.HashSet;
import java.util.Set;

public class Bus_Master {

	private String bus_id;
	private String bus_model;
	
	private String plate_number;
	private int no_of_seat;
	
	private String bus_image;
	
	private Set<Passenger> passenger;
	
	public String getBus_id() {
		return bus_id;
	}
	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}
	
	public String getPlate_number() {
		return plate_number;
	}
	public void setPlate_number(String plate_number) {
		this.plate_number = plate_number;
	}
	
	

	public Set<Passenger> getPassenger() {
		return passenger;
	}
	public void setPassenger(Set<Passenger> passenger) {
		this.passenger = passenger;
	}
	public String getBus_model() {
		return bus_model;
	}
	public void setBus_model(String bus_model) {
		this.bus_model = bus_model;
	}
	public int getNo_of_seat() {
		return no_of_seat;
	}
	public void setNo_of_seat(int no_of_seat) {
		this.no_of_seat = no_of_seat;
	}

	public String getBus_image() {
		return bus_image;
	}
	public void setBus_image(String bus_image) {
		this.bus_image = bus_image;
	}
}
