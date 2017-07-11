package com.EntityClasses;

public class Bus_Per_Schedule {

	private int id;
	private Schedule_Table schedule_id;
	private User_Master user_id;
	private Bus_Master bus_id;
	private int number_of_seats;
	private String est_departure_time;
	private String est_arrival_time;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Schedule_Table getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(Schedule_Table schedule_id) {
		this.schedule_id = schedule_id;
	}
	public User_Master getUser_id() {
		return user_id;
	}
	public void setUser_id(User_Master user_id) {
		this.user_id = user_id;
	}
	public Bus_Master getBus_id() {
		return bus_id;
	}
	public void setBus_id(Bus_Master bus_id) {
		this.bus_id = bus_id;
	}
	public int getNumber_of_seats() {
		return number_of_seats;
	}
	public void setNumber_of_seats(int number_of_seats) {
		this.number_of_seats = number_of_seats;
	}
	public String getEst_departure_time() {
		return est_departure_time;
	}
	public void setEst_departure_time(String est_departure_time) {
		this.est_departure_time = est_departure_time;
	}
	public String getEst_arrival_time() {
		return est_arrival_time;
	}
	public void setEst_arrival_time(String est_arrival_time) {
		this.est_arrival_time = est_arrival_time;
	}
	
	
}
