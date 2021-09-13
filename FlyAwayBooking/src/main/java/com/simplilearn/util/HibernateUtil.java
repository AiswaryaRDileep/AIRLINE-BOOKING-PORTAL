package com.simplilearn.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.simplilearn.entity.Admin;
import com.simplilearn.entity.Booking;
import com.simplilearn.entity.Flight;
import com.simplilearn.entity.Payment;
import com.simplilearn.entity.User;

public class HibernateUtil {
	
	static SessionFactory sessionFactory = null;
	
	public static SessionFactory buildSessionFactory() {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Booking.class)
				.addAnnotatedClass(Flight.class)
				.addAnnotatedClass(Payment.class)
				.addAnnotatedClass(Admin.class)
				.buildSessionFactory();
		return sessionFactory;
		
	}

}
