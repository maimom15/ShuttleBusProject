package com.API;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.DataAPI.APIBookingDao;
import com.DataAPI.InterfaceBooking;
import com.EntityClasses.Destination_Master;
import com.EntityClasses.Passenger;
import com.google.gson.Gson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class APIBooking {
	@RequestMapping(value="/bookingPage",method = RequestMethod.GET)
	public @ResponseBody ArrayList<Map> bookingPage(){
		
		List<Destination_Master> destlist = new ArrayList<Destination_Master>();
		InterfaceBooking dataBooking = new APIBookingDao();
		destlist = dataBooking.Booking_API();
		Map <String,Object> dest = new HashMap<String,Object>();
		ArrayList<Map> bookingapi=new ArrayList<Map>();  
	
		for(int i=0;i<destlist.size();i++){
			Map <String,Object> pass = new HashMap<String,Object>();
			dest.put("id",destlist.get(i).getDestination_id());
			dest.put("name", destlist.get(i).getDestination_name());
			dest.put("departure", destlist.get(i).getDeparture_time());
			//pass.put("pass", destlist.get(i).getPassenger().);
			System.out.println(pass);
			for(Passenger p:destlist.get(i).getPassenger()){
				System.out.println(p.getDate_of_booking());
			}
			bookingapi.add(dest);
			
		}
		return bookingapi;
	}
}
