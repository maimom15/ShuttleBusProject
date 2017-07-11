package com.DaoClasses;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import com.EntityClasses.Destination_Master;
import com.EntityClasses.Passenger;
import com.EntityClasses.User_Master;
import com.HibernateUtil.HibernateUtil;
import com.ModelClasses.Teacher;

public class Teacher_Implement implements TeacherDao {

	

	public boolean addBooking(Set<Teacher> teacher) {
        Transaction trns = null;
        User_Master user=new User_Master("t4jrtfh385");
        
        Destination_Master dest = new Destination_Master("756fh4hfyo");
       
        Passenger passenger = new Passenger();
        
        
       
        
        passenger.setDate_of_travel("2017-05-18 13:17:17");
        passenger.setDate_of_booking("2017-05-18 13:17:17");
        
        
        passenger.setDestination_id(dest);
	    passenger.setUser_id(user);
	    
	    Set<Passenger> ps = new HashSet<Passenger>();
	    ps.add(passenger);
	    user.setPassenger(ps);
	    dest.setPassenger(ps);
	    
	    
		
		
	    Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        try {
        	
        	
            trns = session.beginTransaction();
            session.save(passenger);
            session.getTransaction().commit();
            return true;
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
           
            //session.close();
        }
	
    }

	
}
