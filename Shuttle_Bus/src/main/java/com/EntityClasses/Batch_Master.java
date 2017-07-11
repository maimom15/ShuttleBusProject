package com.EntityClasses;

import java.util.HashSet;
import java.util.Set;

public class Batch_Master {
	private String Batch_id;
	private int Batch_number;
	private Set<User_Master> user_master;

	public Set<User_Master> getUser_master() {
		return user_master;
	}
	public void setUser_master(Set<User_Master> user_master) {
		this.user_master = user_master;
	}
	public String getBatch_id() {
		return Batch_id;
	}
	public void setBatch_id(String batch_id) {
		Batch_id = batch_id;
	}
	public int getBatch_number() {
		return Batch_number;
	}
	public void setBatch_number(int batch_number) {
		Batch_number = batch_number;
	}
	
}
