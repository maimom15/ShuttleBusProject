package com.MainController;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.DaoClasses.TeacherDao;
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
	

	@RequestMapping(value="/scheduleData",method = RequestMethod.GET)
	public @ResponseBody List<Schedule_Table> getscheduleData(){
		List<Schedule_Table> schedule = new ArrayList<Schedule_Table>();
		Teacher_Implement sl= new Teacher_Implement();
		System.out.println("user info");
		schedule=sl.getSchdule();
		return schedule;
	}
	

	@RequestMapping(value="/passengerDetail",method = RequestMethod.GET)
	public @ResponseBody List<Passenger> getpassengerDetail(){
			List<Passenger> passen = new ArrayList<Passenger>();
			Teacher_Implement sl= new Teacher_Implement();
			System.out.println("user info");
			passen=sl.getPassenger();
			return passen;
		}
		
	
	@RequestMapping(value="/bookingService",method = RequestMethod.POST)
	public @ResponseBody String getBooking(@RequestBody Teacher book[]){
			Teacher_Implement sl= new Teacher_Implement();
			System.out.println(book[0].getDate_of_booking());
			//sl.BookService(book[0]);
			return "success";
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
	





	

	
	






	