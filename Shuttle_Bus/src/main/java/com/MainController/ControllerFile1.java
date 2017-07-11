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

public class ControllerFile1{
		
	@Autowired
	usersService usersService1;	
	
	@RequestMapping(value="/Admin",method = RequestMethod.GET)
	public ModelAndView Login(){
		ModelAndView view =new ModelAndView("admin");	
		return view;
		
	}
	
	
	
}
	





	

	
	






	