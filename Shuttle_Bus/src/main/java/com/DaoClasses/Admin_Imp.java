package com.DaoClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import com.EntityClasses.Destination_Master;
import com.EntityClasses.Passenger;
import com.EntityClasses.Schedule_Table;
import com.EntityClasses.User_Master;
import com.mysql.fabric.xmlrpc.base.Data;

public class Admin_Imp implements Admin_Inf{

	public List<List<Passenger>> Schedule() {
		List<List<Passenger>> date = new ArrayList<List<Passenger>>(); 
        Transaction trns = null;
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        
        try {
            trns = session.beginTransaction();
            String hql ="FROM Passenger";
            Query query =  session.createQuery(hql);
        
			List results = session.createCriteria(Passenger.class)
					
            	    .setProjection( Projections.projectionList()
            	       
            	        .add( Projections.groupProperty("date_of_travel"))
            	    )
            	    .list();
			
            
            List<Passenger> list = query.list();
            
			
			
            for(int i=0;i<results.size();i++){
            	List<Passenger> dat = new ArrayList<Passenger>(); 
            	for(int j=0;j<list.size();j++){
            		if(list.get(j).getDate_of_travel().equals(results.get(i))){
            			
            			dat.add(list.get(j));
            			
            			
            		}
            			
            		}
            	
            	date.add(dat);
            	}
           
            	
            	/*for(int i=0;i<date.size();i++){
            		for(int j=0;j<date.get(i).size();j++){
            			System.out.println(date.get(i).get(j).getDate_of_travel());
            		}
            		 
            }*/
           
            
        } catch (RuntimeException e) {
            e.printStackTrace();
           
        } finally {
            session.flush();
            
        }
        
        return date;
    }
	
	public List<User_Master> User() {
		 List<User_Master> list = new  ArrayList<User_Master> ();
        Transaction trns = null;
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        
        try {
            trns = session.beginTransaction();
            String hql ="FROM User_Master";
            Query query =  session.createQuery(hql);
        
			List results = session.createCriteria(Passenger.class)
            	    .setProjection( Projections.projectionList()
            	       
            	        .add( Projections.groupProperty("date_of_travel"))
            	    )
            	    .list();
			
            
            list = query.list();
            
			
			
            
           
            	
            
        } catch (RuntimeException e) {
            e.printStackTrace();
           
        } finally {
            session.flush();
            
        }
        
        return list;
    }
	
	public static void main(String arg[]){
		List<Destination_Master> dest = new ArrayList<Destination_Master>();
        Transaction trns = null;
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        
        try {
            trns = session.beginTransaction();
            String hql ="FROM Passenger";
            Query query =  session.createQuery(hql);
            
			List results = session.createCriteria(Passenger.class)
            	    .setProjection( Projections.projectionList()
            	       
            	        .add( Projections.groupProperty("date_of_travel"))
            	    )
            	    .list();
            
            List<Passenger> list = query.list();
            
			ArrayList<ArrayList<Passenger>> date = new ArrayList<ArrayList<Passenger>>(); 
			ArrayList<Passenger> dat = new ArrayList<Passenger>(); 
            for(int i=0;i<results.size();i++){
            	for(int j=0;j<list.size();j++){
            		if(list.get(j).getDate_of_travel().equals(results.get(i))){
            			
            			dat.add(list.get(i));
            			
            			
            		}
            			
            		}
            	date.add(dat);
            	}
            	
            	for(int i=0;i<date.size();i++){
            		for(int j=0;j<date.get(i).size();j++){
            			System.out.println(date.get(i).get(j).getDate_of_travel());
            		}
            		 
            }
           
            
        } catch (RuntimeException e) {
            e.printStackTrace();
           
        } finally {
            session.flush();
            session.close();
        }
	}
}
