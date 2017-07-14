package com.DaoClasses;

import java.util.List;

import com.EntityClasses.Passenger;
import com.EntityClasses.User_Master;

public interface Admin_Inf {
	public List<User_Master> User();
	public List<List<Passenger>> Schedule();
}
