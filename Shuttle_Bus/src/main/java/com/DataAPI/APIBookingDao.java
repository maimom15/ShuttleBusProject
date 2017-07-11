package com.DataAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;






import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.EntityClasses.Destination_Master;
import com.HibernateUtil.HibernateUtil;

public class APIBookingDao implements InterfaceBooking{

	public List<Destination_Master> Booking_API() {
        List<Destination_Master> dest = new ArrayList<Destination_Master>();
        Transaction trns = null;
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
     	SessionFactory sf=con.buildSessionFactory();
     	Session session=sf.openSession();
        
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
}
