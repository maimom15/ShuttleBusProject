package com.EntityClasses;

public class Bus_Report_Table {

	private int id;
	private Schedule_Table schedule_id;
	private String actual_departure_time;
	private String actual_arrival_time;
	private float total_time_spent;
	private float fuel_spent;
	private float distance;
	private float total_expense;
	private String extra_info;
	
	
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
	public String getActual_departure_time() {
		return actual_departure_time;
	}
	public void setActual_departure_time(String actual_departure_time) {
		this.actual_departure_time = actual_departure_time;
	}
	public String getActual_arrival_time() {
		return actual_arrival_time;
	}
	public void setActual_arrival_time(String actual_arrival_time) {
		this.actual_arrival_time = actual_arrival_time;
	}
	public float getTotal_time_spent() {
		return total_time_spent;
	}
	public void setTotal_time_spent(float total_time_spent) {
		this.total_time_spent = total_time_spent;
	}
	public float getFuel_spent() {
		return fuel_spent;
	}
	public void setFuel_spent(float fuel_spent) {
		this.fuel_spent = fuel_spent;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public float getTotal_expense() {
		return total_expense;
	}
	public void setTotal_expense(float total_expense) {
		this.total_expense = total_expense;
	}
	public String getExtra_info() {
		return extra_info;
	}
	public void setExtra_info(String extra_info) {
		this.extra_info = extra_info;
	}
	
}
