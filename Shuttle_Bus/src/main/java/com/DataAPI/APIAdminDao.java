package com.DataAPI;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.EntityClasses.Batch_Master;
import com.EntityClasses.Bus_Master;
import com.EntityClasses.Bus_Per_Schedule;
import com.EntityClasses.Bus_Report_Table;
import com.EntityClasses.Destination_Master;
import com.EntityClasses.Passenger;
import com.EntityClasses.Role_Master;
import com.EntityClasses.Schedule_Table;

public class APIAdminDao implements InterfaceAdmin{
	
	public List<Schedule_Table> ScheduleTableAPI() {
        List<Schedule_Table> schedule = new ArrayList<Schedule_Table>();
        
        
        Transaction trns = null;
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        
        try {
            trns = session.beginTransaction();
            String hql ="FROM Schedule_Table";
            Query query =  session.createQuery(hql);
            schedule = query.list();
            
          
        } catch (RuntimeException e) {
            e.printStackTrace();
            return schedule;
        } finally {
            session.flush();
            session.close();
        }
        return schedule;
    }
	
	
	public List<Passenger> PassengerAPI() {
        List<Passenger> pass = new ArrayList<Passenger>();
        
        
        Transaction trns = null;
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        
        try {
            trns = session.beginTransaction();
            String hql ="FROM Passenger";
            Query query =  session.createQuery(hql);
            pass = query.list();
            
          
        } catch (RuntimeException e) {
            e.printStackTrace();
            return pass;
        } finally {
            session.flush();
           
        }
        return pass;
    }
	
	
	public List<Bus_Per_Schedule> Bus_Per_Schedule_API() {
        List<Bus_Per_Schedule> bus_per_schedule = new ArrayList<Bus_Per_Schedule>();
        
        
        Transaction trns = null;
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        
        try {
            trns = session.beginTransaction();
            String hql ="FROM Bus_Per_Schedule";
            Query query =  session.createQuery(hql);
            bus_per_schedule = query.list();
            
          
        } catch (RuntimeException e) {
            e.printStackTrace();
            return bus_per_schedule;
        } finally {
            session.flush();
           
        }
        return bus_per_schedule;
    }
	
	
	public List<Bus_Report_Table> Bus_Report_Table_API() {
		
        List<Bus_Report_Table> bus_report = new ArrayList<Bus_Report_Table>();
        
        
        Transaction trns = null;
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        
        try {
            trns = session.beginTransaction();
            String hql ="FROM Bus_Report_Table";
            Query query =  session.createQuery(hql);
            bus_report = query.list();
            
          
        } catch (RuntimeException e) {
            e.printStackTrace();
            return bus_report;
        } finally {
            session.flush();
           
        }
        return bus_report;
    }
public List<Bus_Master> Bus_Master_API() {
		
        List<Bus_Master> bus_master = new ArrayList<Bus_Master>();
        
        
        Transaction trns = null;
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        
        try {
            trns = session.beginTransaction();
            String hql ="FROM Bus_Master";
            Query query =  session.createQuery(hql);
            bus_master = query.list();
            
          
        } catch (RuntimeException e) {
            e.printStackTrace();
            return bus_master;
        } finally {
            session.flush();
           
        }
        return bus_master;
    }

public List<Role_Master> Role_Master_API() {
	
    List<Role_Master> role_master = new ArrayList<Role_Master>();
    
    
    Transaction trns = null;
    Configuration con=new Configuration();
    con.configure("hibernate.cfg.xml");
 	SessionFactory sf=con.buildSessionFactory();
 	Session session=sf.openSession();
    
    try {
        trns = session.beginTransaction();
        String hql ="FROM Role_Master";
        Query query =  session.createQuery(hql);
        role_master = query.list();
        
      
    } catch (RuntimeException e) {
        e.printStackTrace();
        return role_master;
    } finally {
        session.flush();
       
    }
    return role_master;
}

public List<Batch_Master> Batch_Master_API() {
	
    List<Batch_Master> batch_master = new ArrayList<Batch_Master>();
    
    
    Transaction trns = null;
    Configuration con=new Configuration();
    con.configure("hibernate.cfg.xml");
 	SessionFactory sf=con.buildSessionFactory();
 	Session session=sf.openSession();
    
    try {
        trns = session.beginTransaction();
        String hql ="FROM Batch_Master";
        Query query =  session.createQuery(hql);
        batch_master = query.list();
        
      
    } catch (RuntimeException e) {
        e.printStackTrace();
        return batch_master;
    } finally {
        session.flush();
       
    }
    return batch_master;
}
}
