package com.DaoClasses;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
		System.out.println("Schedule2");
		List<Schedule_Table> sche = new ArrayList<Schedule_Table>();
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
     	try {
            trns = session.beginTransaction();
            String hql ="FROM Schedule_Table as e where e.date_of_travel< current_date()";
            Query query =  session.createQuery(hql);
            sche = query.list();
            System.out.println(sche.get(0).getDate_of_travel());
     	}catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
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
	
	public Boolean BookService(Teacher[] passen){
		Boolean confirm=false;
		Transaction trns = null;
        User_Master user=new User_Master("t4jrtfh385");   
        Destination_Master destTo=new Destination_Master(passen[0].getDestination_id());
        System.out.println("TeacherImp"+passen.length);
        Destination_Master destBack = null;
        Passenger passengerBack = null;
        Passenger passengerTo = new Passenger(passen[0].getDate_of_booking(),user,destTo,passen[0].getDate_of_travel());
        Set<Passenger> ps = new HashSet<Passenger>(); 
       if(passen.length==1){
    	    ps.add(passengerTo);
        }
       else{
    	   destBack=new Destination_Master(passen[1].getDestination_id());
           passengerBack = new Passenger(passen[0].getDate_of_booking(),user,destTo,passen[0].getDate_of_travel());
    	   ps.add(passengerTo);
   	       ps.add(passengerBack);
       }
	    user.setPassenger(ps);
	    destTo.setPassenger(ps);
	    Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        try {
            trns = session.beginTransaction();
            session.save(passengerTo);
            if(passen.length==2){
            	destBack.setPassenger(ps);
            	session.save(passengerBack);
            }
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
            
        } finally {
           
            session.close();
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
	public static void main(String arg[]) throws ParseException{		
		List<Schedule_Table> sche = new ArrayList<Schedule_Table>();
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
     	try {
            trns = session.beginTransaction();
            String hql ="FROM Schedule_Table as e where e.date_of_travel< current_date()";
            Query query =  session.createQuery(hql);
            sche = query.list();
            System.out.println(sche.get(0).getDate_of_travel());
     	}catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
     	}
	}

	
}
