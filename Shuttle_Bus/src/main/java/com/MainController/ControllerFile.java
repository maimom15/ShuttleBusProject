package com.MainController;


import java.util.HashSet;
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
	
	

	@RequestMapping(value="/login_service",method = RequestMethod.POST)
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
	
	@RequestMapping(value="/admin",method = RequestMethod.GET)
	public ModelAndView Admin(){
		ModelAndView view =new ModelAndView("admin");
		
		return view;
	}
	
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
	}
	
	@RequestMapping(value="/booking")
	public ModelAndView Booking(){
			int i=0;
		ModelAndView view = new ModelAndView("teacher");
		
		Teacher_Implement dest = new Teacher_Implement();
		Set <Teacher> teacher = new HashSet<Teacher>();
			dest.addBooking(teacher);
			
			
		return view;
	}
	
	
}
	





	

	
	






	