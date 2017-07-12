package com.DaoClasses;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;












import com.EntityClasses.Destination_Master;
import com.EntityClasses.Passenger;
import com.EntityClasses.Schedule_Table;
import com.EntityClasses.User_Master;
import com.HibernateUtil.HibernateUtil;
import com.ModelClasses.Teacher;

public class Teacher_Implement {
	
	public List<User_Master> getUserInfo(){
		List<User_Master> user = new ArrayList<User_Master>();
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
     	try {
            trns = session.beginTransaction();
            String hql ="FROM User_Master";
            Query query =  session.createQuery(hql);
            user = query.list();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return user;
        } finally {
            session.flush();
            session.close();
        }
        return user;
	}
	
	
	public List<Destination_Master> getDestinationId(){
		
		List<Destination_Master> dest = new ArrayList<Destination_Master>();
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
     	try {
            trns = session.beginTransaction();
            String hql ="FROM Destination_Master";
            Query query =  session.createQuery(hql);
            dest = query.list();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return dest;
        } finally {
            session.flush();
            session.close();
        }
        return dest;
	}
	
	
	
	public List<Schedule_Table> getSchdule(){
		List<Schedule_Table> sche = new ArrayList<Schedule_Table>();
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
     	try {
            trns = session.beginTransaction();
            String hql ="FROM Schedule_Table   ";
            Query query =  session.createQuery(hql);
            sche = query.list();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return sche;
        } finally {
            session.flush();
            session.close();
        }
        return sche;
	}
	
	
	public List<Passenger> getPassenger(){
		List<Passenger> passen = new ArrayList<Passenger>();
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
     	try {
            trns = session.beginTransaction();
            String hql ="FROM Passenger";
            Query query =  session.createQuery(hql);
            passen = query.list();
        } catch (RuntimeException e) {
            e.printStackTrace();
            return passen;
        } finally {
            session.flush();
            session.close();
        }
        return passen;
	}
	
	public Boolean BookService(Teacher passen){
		System.out.println("TeacherImp");
		Boolean confirm=false;
		Transaction trns = null;
        User_Master user=new User_Master("t4jrtfh385");        
        Destination_Master dest = new Destination_Master(passen.getDestination_id());     
        Passenger passenger = new Passenger();
        passenger.setDate_of_travel(passen.getDate_of_travel());
        passenger.setDate_of_booking(passen.getDate_of_booking()); 
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
            confirm = true;
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
            return confirm;
        } finally {
            //session.flush();
            //session.close();
        }
        return confirm;
	}

	

	/*
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
	
    }*/
	public static void main(String arg[]){
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
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
            
        } finally {
           
            //session.close();
        }
	}

	
}
