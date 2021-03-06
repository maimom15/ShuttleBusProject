package com.MainController;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.DaoClasses.Teacher_Implement;
import com.EntityClasses.Authentic;
import com.EntityClasses.Destination_Master;
import com.EntityClasses.Passenger;
import com.EntityClasses.Schedule_Table;
import com.EntityClasses.User_Master;
import com.ModelClasses.Teacher;
import com.ServiceClasses.usersService;


@Controller

public class ControllerFile {
		
	@Autowired
	usersService usersService1;	
	
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView Login(){
		ModelAndView view =new ModelAndView("login");	
		return view;
		
	}
	
	@RequestMapping(value="/student", method = RequestMethod.GET)
	public ModelAndView getStudent(){
		ModelAndView view =new ModelAndView("student");
		return view;
	}
	
	@RequestMapping(value="/teacher", method = RequestMethod.GET)
	public ModelAndView getTeacher(){
		ModelAndView view =new ModelAndView("teacher");
		return view;	
	}	
	
	@RequestMapping(value="/login_service",method = RequestMethod.GET)
	public @ResponseBody String Login_service(@RequestBody Authentic aut){
		String email = aut.getEmail();
		String password = aut.getPassword();
		String url = "";
		if(email.equals("admin@gmail.com")){
			System.out.println(email);
			System.out.println(password);
			url= "admin";
			
		}
		else if(email.equals("teacher@gmail.com")){
			System.out.println(email);
			System.out.println(password);
			url= "teacher";
			
		}
		else if(email.equals("student@gmail.com")){
			System.out.println(email);
			System.out.println(password);
			url= "student";
			
		}
		else{
			System.out.println(email);
			System.out.println(password);
			url= "driver";
			
		}
		return url;
	}
	
	
	@RequestMapping(value="/userInfo",method = RequestMethod.GET)
	public @ResponseBody List<Map> getUserInfo(){
		List<User_Master> user = new ArrayList<User_Master>();
		List<Map> userReturn = new ArrayList<Map>();
		Teacher_Implement sl= new Teacher_Implement();
		user=sl.getUserInfo();
		for(int i=0;i<user.size();i++){
        	Map<String,Object> users = new HashMap<String,Object>();
        	users.put("fullname", user.get(i).getFullname());
        	users.put("username", user.get(i).getUsername());
        	users.put("no_of_ticket", user.get(i).getNo_of_ticket());
        	userReturn.add(users);
        }
		return userReturn;
	}
	
	
	@RequestMapping(value="/selectService",method = RequestMethod.GET)
	public @ResponseBody List<Map> select_service(){
		List<Destination_Master> dest = new ArrayList<Destination_Master>();
		List<Map> destReturn = new ArrayList<Map>();
		Teacher_Implement sl= new Teacher_Implement();
		dest=sl.getDestinationId();
		for(int i=0;i<dest.size();i++){
        	Map<String,Object> dests = new HashMap<String,Object>();
        	dests.put("destination_name", dest.get(i).getDestination_name());
        	dests.put("destination_id", dest.get(i).getDestination_id());
        	destReturn.add(dests);
        }
		System.out.println(destReturn);
		return destReturn;
	}
	

	@RequestMapping(value="/scheduleData",method = RequestMethod.POST)
	public @ResponseBody List<Map> getscheduleData(){
		List<Map> scheReturn = new ArrayList<Map>();
		System.out.println("Schedule1");
		List<Schedule_Table> schedule = new ArrayList<Schedule_Table>();
		Teacher_Implement sl= new Teacher_Implement();
		schedule = sl.getSchdule(); 
		for(int i=0;i<schedule.size();i++){
        	Map<String,Object> sch = new HashMap<String,Object>();
        	sch.put("date_of_travel",schedule.get(i).getDate_of_travel());
        	sch.put("destination_id",schedule.get(i).getDestination_id().getDestination_id());
        	sch.put("destination_name",schedule.get(i).getDestination_id().getDestination_name());
        	sch.put("total_available_seats",schedule.get(i).getTotal_available_seats());
        	sch.put("customer_seats",schedule.get(i).getCustomer_seats());
        	sch.put("staff_seats",schedule.get(i).getStaff_seats());
        	sch.put("student_seats",schedule.get(i).getStudent_seats());
        	sch.put("remaining_seats",schedule.get(i).getRemaining_seats());
        	sch.put("schedule_id",schedule.get(i).getSchedule_id());
        	scheReturn.add(sch);
        }
		System.out.println(scheReturn);
		System.out.println("Hello");
		return scheReturn;
	}
	

	@RequestMapping(value="/passengerDetail",method = RequestMethod.GET)
	public @ResponseBody List<Passenger> getpassengerDetail(){
			List<Passenger> passen = new ArrayList<Passenger>();
			Teacher_Implement sl= new Teacher_Implement();
			System.out.println("user info");
			passen=sl.getPassenger();
			return passen;
		}
		
	
	@RequestMapping(value="/booking",method = RequestMethod.POST)
	public @ResponseBody Boolean getBooking(@RequestBody Teacher[] book){
			Teacher_Implement sl= new Teacher_Implement();
			System.out.println(book[0].getDate_of_booking()+" "+book[0].getDestination_id()+" "+book[0].getDate_of_travel());
			sl.BookService(book);
			return true;
	}
	
	/*
	@RequestMapping(value="/device",method = RequestMethod.GET)
	public ModelAndView Device( HttpServletRequest request){
			ModelAndView view =new ModelAndView("device");
		if(request.getHeader("User-Agent").indexOf("Mobile") != -1) {
		   view.addObject("device", "mobile");
		  } else {
		   view.addObject("device", "pc");
		  }
		return view;
	}
	@RequestMapping(value="/driver",method = RequestMethod.GET)
	public ModelAndView Driver(){
		ModelAndView view =new ModelAndView("driver");
		view.addObject("name", "world");
		return view;
	}*/
	public static void main(String args[]){
		
	}
	
	
	
}
	





	

	
	






	