package com.DataAPI;

import java.util.List;

import com.EntityClasses.Batch_Master;
import com.EntityClasses.Bus_Master;
import com.EntityClasses.Bus_Per_Schedule;
import com.EntityClasses.Bus_Report_Table;
import com.EntityClasses.Passenger;
import com.EntityClasses.Role_Master;
import com.EntityClasses.Schedule_Table;

public interface InterfaceAdmin {
	
	public List<Schedule_Table> ScheduleTableAPI();
	public List<Passenger> PassengerAPI();
	public List<Bus_Per_Schedule> Bus_Per_Schedule_API(); 
	public List<Bus_Report_Table> Bus_Report_Table_API();
	public List<Bus_Master> Bus_Master_API();
	public List<Role_Master> Role_Master_API() ;
	public List<Batch_Master> Batch_Master_API();
	
}
