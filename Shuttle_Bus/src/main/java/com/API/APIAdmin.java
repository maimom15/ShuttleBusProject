package com.API;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.DataAPI.APIAdminDao;
import com.DataAPI.InterfaceAdmin;
import com.EntityClasses.Batch_Master;
import com.EntityClasses.Bus_Master;
import com.EntityClasses.Bus_Per_Schedule;
import com.EntityClasses.Bus_Report_Table;
import com.EntityClasses.Passenger;
import com.EntityClasses.Role_Master;
import com.EntityClasses.Schedule_Table;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class APIAdmin {
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/api_schedule_table",method = RequestMethod.GET)
	public @ResponseBody ArrayList<Map> Schedule_Table_API(){
		
		List<Schedule_Table> scheduleList = new ArrayList<Schedule_Table>();
		InterfaceAdmin dataAdmin = new APIAdminDao();
		scheduleList = dataAdmin.ScheduleTableAPI();
		Map <String,Object> schedule = new HashMap<String,Object>();
		ArrayList<Map> bookingapi=new ArrayList<Map>();  
	
		for(int i=0;i<scheduleList.size();i++){
			schedule.put("schedule_id",scheduleList.get(i).getSchedule_id());
			schedule.put("destination_id",scheduleList.get(i).getDestination_id().getDestination_id());
			schedule.put("date_of_travel",scheduleList.get(i).getDate_of_travel());
			schedule.put("total_available_seats",scheduleList.get(i).getTotal_available_seats());
			schedule.put("customer_seats",scheduleList.get(i).getCustomer_seats());
			schedule.put("student_seats",scheduleList.get(i).getStudent_seats());
			schedule.put("staff_seats",scheduleList.get(i).getStaff_seats());
			schedule.put("remaining_seats",scheduleList.get(i).getRemaining_seats());
			bookingapi.add(schedule);
			
		}
		
		return bookingapi;
	}
	
	
	@SuppressWarnings({ "rawtypes", "unused" })
	@RequestMapping(value="/api_passenger_table",method = RequestMethod.GET)
	public @ResponseBody ArrayList<Map> Passenger_Table_API(){

		List<Passenger>  passengerList= new ArrayList<Passenger>();
	
		InterfaceAdmin dataAdmin = new APIAdminDao();
		passengerList = dataAdmin.PassengerAPI();
		ArrayList<Map> passengerData= new ArrayList<Map>();
		
		for(int i=0;i<passengerList.size();i++){
			Map <String,Object> pass = new HashMap<String,Object>();
			Map <String,Object> user = new HashMap<String,Object>();
			
			pass.put("id",passengerList.get(i).getId());
			pass.put("date_of_booking",passengerList.get(i).getDate_of_booking());
			pass.put("date_of_travel",passengerList.get(i).getDate_of_travel());
			pass.put("destination_id",passengerList.get(i).getDestination_id().getDestination_id());
			pass.put("seat_number",passengerList.get(i).getSeat_number());
			pass.put("ticket_qrcode",passengerList.get(i).getTicket_qrcode());
			pass.put("user_id", passengerList.get(i).getUser_id().getUser_id());
			
			if(passengerList.get(i).getBus_id()!=null){
				pass.put("bus_id", passengerList.get(i).getBus_id().getBus_id());
			}
			
			passengerData.add(pass);
		}
		return passengerData;
	}
	
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/api_bus_per_shedule",method = RequestMethod.GET)
	public @ResponseBody ArrayList<Map> BUS_PER_SCHEDULE_API(){
	;
		List<Bus_Per_Schedule>  bus_per_scheduleList= new ArrayList<Bus_Per_Schedule>();
	
		InterfaceAdmin dataAdmin = new APIAdminDao();
		bus_per_scheduleList = dataAdmin.Bus_Per_Schedule_API();
		ArrayList<Map> scheduleData= new ArrayList<Map>();
		
		
		for(int i=0;i<bus_per_scheduleList.size();i++){
			Map <String,Object> bus_schedule = new HashMap<String,Object>();
			
			bus_schedule.put("id",bus_per_scheduleList.get(i).getId());
			bus_schedule.put("schedule_id",bus_per_scheduleList.get(i).getSchedule_id().getSchedule_id());
			bus_schedule.put("bus_id",bus_per_scheduleList.get(i).getBus_id().getBus_id());
			bus_schedule.put("user_id",bus_per_scheduleList.get(i).getUser_id().getUser_id());
			bus_schedule.put("number_of_seats",bus_per_scheduleList.get(i).getNumber_of_seats());
			bus_schedule.put("est_departure_time",bus_per_scheduleList.get(i).getEst_departure_time());
			bus_schedule.put("est_arrival_time",bus_per_scheduleList.get(i).getEst_arrival_time());
			
			scheduleData.add(bus_schedule);
		}
		return scheduleData;
	}
	
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/api_bus_report_table",method = RequestMethod.GET)
	
	public @ResponseBody ArrayList<Map> BUS_REPORT_TABLE_API(){
		
		List<Bus_Report_Table>  bus_report_list= new ArrayList<Bus_Report_Table>();
	
		InterfaceAdmin dataAdmin = new APIAdminDao();
		bus_report_list = dataAdmin.Bus_Report_Table_API();
		
		ArrayList<Map> reportData= new ArrayList<Map>();
		
		
		for(int i=0;i<bus_report_list.size();i++){
			Map <String,Object> bus_report = new HashMap<String,Object>();
			
			bus_report.put("id",bus_report_list.get(i).getId());
			bus_report.put("schedule_id",bus_report_list.get(i).getSchedule_id().getSchedule_id());
			bus_report.put("actual_departure_time",bus_report_list.get(i).getActual_departure_time());
			bus_report.put("actual_arrival_time",bus_report_list.get(i).getActual_arrival_time());
			bus_report.put("total_time_spent",bus_report_list.get(i).getTotal_time_spent());
			bus_report.put("fuel_spent",bus_report_list.get(i).getFuel_spent());
			bus_report.put("distance",bus_report_list.get(i).getDistance());
			bus_report.put("total_expense",bus_report_list.get(i).getTotal_expense());
			bus_report.put("extra_info",bus_report_list.get(i).getExtra_info());
			
			
			reportData.add(bus_report);
		}
	
		return reportData;
	}
	
	
@RequestMapping(value="/api_bus_master",method = RequestMethod.GET)
	
	public @ResponseBody ArrayList<Map> BUS_MASTER_API(){
		
		List<Bus_Master>  bus_master_list= new ArrayList<Bus_Master>();
	
		InterfaceAdmin dataAdmin = new APIAdminDao();
		bus_master_list = dataAdmin.Bus_Master_API();
		
		ArrayList<Map> Bus_Master_Data= new ArrayList<Map>();
		
		
		for(int i=0;i<bus_master_list.size();i++){
			Map <String,Object> bus_report = new HashMap<String,Object>();
			
			bus_report.put("bus_id",bus_master_list.get(i).getBus_id());
			bus_report.put("bus_model",bus_master_list.get(i).getBus_model());
			bus_report.put("plate_number",bus_master_list.get(i).getPlate_number());
			bus_report.put("no_of_seat",bus_master_list.get(i).getNo_of_seat());
			bus_report.put("bus_image",bus_master_list.get(i).getBus_image());
			
			Bus_Master_Data.add(bus_report);
		}
	
		return Bus_Master_Data;
	}

@RequestMapping(value="/api_role_master",method = RequestMethod.GET)

public @ResponseBody ArrayList<Map> ROLE_MASTER_API(){
	
	List<Role_Master>  role_master_list= new ArrayList<Role_Master>();

	InterfaceAdmin dataAdmin = new APIAdminDao();
	role_master_list = dataAdmin.Role_Master_API();
	
	ArrayList<Map> Role_Master_Data= new ArrayList<Map>();
	
	
	for(int i=0;i<role_master_list.size();i++){
		Map <String,Object> bus_report = new HashMap<String,Object>();
		
		bus_report.put("role_id",role_master_list.get(i).getRole_id());
		bus_report.put("role_name",role_master_list.get(i).getRole_name());
		Role_Master_Data.add(bus_report);
	}

	return Role_Master_Data;
}
	

@RequestMapping(value="/api_batch_master",method = RequestMethod.GET)

public @ResponseBody ArrayList<Map> BATCH_MASTER_API(){
	
	List<Batch_Master>  batch_master_list= new ArrayList<Batch_Master>();

	InterfaceAdmin dataAdmin = new APIAdminDao();
	batch_master_list = dataAdmin.Batch_Master_API();
	
	ArrayList<Map> Batch_Master_Data= new ArrayList<Map>();
	
	
	for(int i=0;i<batch_master_list.size();i++){
		Map <String,Object> bus_report = new HashMap<String,Object>();
		
		bus_report.put("batch_id",batch_master_list.get(i).getBatch_id());
		bus_report.put("batch_number",batch_master_list.get(i).getBatch_number());
		Batch_Master_Data.add(bus_report);
	}

	return Batch_Master_Data;
}
	
	
}
