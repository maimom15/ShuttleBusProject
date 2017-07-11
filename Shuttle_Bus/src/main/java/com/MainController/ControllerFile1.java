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

import com.DaoClasses.Admin_Imp;
import com.DaoClasses.TeacherDao;
import com.DaoClasses.Teacher_Implement;
import com.EntityClasses.Authentic;
import com.EntityClasses.Destination_Master;
import com.ModelClasses.Teacher;
import com.ServiceClasses.usersService;


@Controller

public class ControllerFile1{
		
	@Autowired
	usersService usersService1;	
	
	@RequestMapping(value="/Admin",method = RequestMethod.GET)
	public ModelAndView Login(){
		ModelAndView view =new ModelAndView("admin");	
		return view;
		
	}

	@RequestMapping(value="/bookingPage",method = RequestMethod.GET)
		public @ResponseBody ArrayList<Map> bookingPage(){
			
			List<Destination_Master> destlist = new ArrayList<Destination_Master>();
			Admin_Imp dest = new Admin_Imp();
			destlist = dest.Booking_API();
			Map <String,Object> join = new HashMap<String,Object>();
			ArrayList<Map> bookingapi=new ArrayList<Map>();  
		
			for(int i=0;i<destlist.size();i++){
				Map <String,Object> pass = new HashMap<String,Object>();
				join.put("id",destlist.get(i).getDestination_id());
				join.put("name", destlist.get(i).getDestination_name());
				join.put("departure", destlist.get(i).getDeparture_time());
				//pass.put("pass", destlist.get(i).getPassenger().);
				
				bookingapi.add(join);
				
			}
			return bookingapi;
		}
	
	
	
}
	





	

	
	






	