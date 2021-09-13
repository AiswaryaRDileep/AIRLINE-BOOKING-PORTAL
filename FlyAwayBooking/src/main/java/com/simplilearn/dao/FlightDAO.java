package com.simplilearn.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.entity.Flight;
import com.simplilearn.util.HibernateUtil;

public class FlightDAO {
	
	public static void save(Flight fly) {
		/*Load session factory*/
		Session session = null;
		try {
			SessionFactory factory = HibernateUtil.buildSessionFactory();
			session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(fly);
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
	
	
	
	

	public static List<Flight> ListFlight() {
		Session session = null;
		List<Flight> fly = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
			session = sessionFactory.openSession();
			String hql = "FROM com.simplilearn.entity.Flight";
			fly = session.createQuery(hql).list();
			session.close();
		}catch(Exception e) {
		 e.printStackTrace();
		}finally {
			if(session  != null) {
				session.close();
				}
		}
		return fly;
	}
	
	
	public static List<Flight> SearchFlight(String fromCity, String toCity ) {
		Session session = null;
		List<Flight> flight = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			if(fromCity != null && toCity != null) {
				String hql = "FROM Flight F WHERE F.fromCity = '" + fromCity + "' AND F.toCity = '" + toCity + "'";
				flight = session.createQuery(hql).list();
			}
			tx.commit();
			session.close();
		/*	String hql = "FROM Flight WHERE fromCity = :fromCity AND toCity = :tocity";
			flight = (List<Flight>)session.createQuery(hql)
							.setParameter("fromCity", fromCity)
							.setParameter("toCity", toCity);
		*/
			System.out.println(flight);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flight;
		
	}
	
	
	
	
	
	
	public boolean deleteFlight(int id) throws SQLException{
		Session session = null;
		Transaction tx = null;
		try( SessionFactory sessionFactory = HibernateUtil.buildSessionFactory()) {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Flight fly = session.get(Flight.class, id);
			if(fly != null) {
				session.delete(fly);
				System.out.println("Flight deleted");
				return true;
			}
			tx.commit();
		}catch(Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	
	
	public static Flight getFlightById(int id) throws SQLException{
		Session session = null;
		Flight fly = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			fly = session.get(Flight.class, id);
			System.out.println(fly);
			tx.commit();
		} catch (Exception e) {
			if(session  != null) {
				session.close();
				}
		}
		return fly;
	}
	
	
	
	
	
	
	public static void updateFlight(Flight flight) throws SQLException {
		Transaction tx = null;
		Session session = null;
		try( SessionFactory sessionFactory = HibernateUtil.buildSessionFactory()) {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(flight);
			tx.commit();
	}catch(Exception e) {
		if(tx != null) {
			tx.rollback();
		}
		e.printStackTrace();
	}
}
}
