package com.simplilearn.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.entity.Booking;
import com.simplilearn.util.HibernateUtil;

public class BookingDAO {
	
	public static void save(Booking book) {
		Session session = null;
		try {
			SessionFactory factory = HibernateUtil.buildSessionFactory();
			session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(book);
			tx.commit();
			session.close();
		}catch(Exception e) {
		 e.printStackTrace();
	} finally {
		if(session  !=null) {
			session.close();
		}
	}
	}
	
	
	
	
	public static Booking getBookingById(int id) throws SQLException{
		Session session = null;
		Booking book = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			book = session.get(Booking.class, id);
			System.out.println(book);
			tx.commit();
		} catch (Exception e) {
			if(session  != null) {
				session.close();
				}
		}
		return book;
	}

}
