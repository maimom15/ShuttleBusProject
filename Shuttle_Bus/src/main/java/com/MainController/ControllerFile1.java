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
import com.EntityClasses.Passenger;
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

	@RequestMapping(value="/schedule",method = RequestMethod.GET)
		public @ResponseBody List<Map<String,Object>> bookingPage(){
			
			List<List<Passenger>> destlist = new ArrayList<List<Passenger>>();
			Admin_Imp dest = new Admin_Imp();
			destlist = dest.Schedule();
			
			List<Map<String,Object>> schedule=new ArrayList<Map<String,Object>>();  
			
			for(int i=0;i<destlist.size();i++){
				
				Map <String,Object> date = new HashMap<String,Object>();
				List<Map<String,Object>> listDate=new ArrayList<Map<String,Object>>(); 
				for(int j=0;j<destlist.get(i).size();j++){
					Map <String,Object> data = new HashMap<String,Object>();
					data.put("destination",destlist.get(i).get(j).getDestination_id().getDestination_name());
					data.put("role",destlist.get(i).get(j).getUser_id().getRole_id().getRole_name());
					data.put("batch",destlist.get(i).get(j).getUser_id().getBatch_id().getBatch_number());
					data.put("full_name",destlist.get(i).get(j).getUser_id().getFullname());
					data.put("email",destlist.get(i).get(j).getUser_id().getEmail());
					data.put("phone",destlist.get(i).get(j).getUser_id().getPhone_number());
					listDate.add(data);
					System.out.println(listDate);
				}
				
				date.put(destlist.get(i).get(0).getDate_of_travel(), listDate);
				System.out.println(date);
				
				schedule.add(date);
				
			}
			return schedule;
		}
	
	
	
}
	





	

	
	






	