package com.simplilearn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.entity.Flight;
import com.simplilearn.entity.Payment;
import com.simplilearn.util.HibernateUtil;

public class PaymentDAO {
	public static void save(Payment pay) {
		Session session = null;
		try {
			SessionFactory factory = HibernateUtil.buildSessionFactory();
			session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(pay);
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
	
	
	
	
	public static List<Payment> ListPayment() {
		Session session = null;
		List<Payment> pay = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
			session = sessionFactory.openSession();
			String hql = "FROM com.simplilearn.entity.Payment";
			pay = session.createQuery(hql).list();
			session.close();
		}catch(Exception e) {
		 e.printStackTrace();
		}finally {
			if(session  != null) {
				session.close();
				}
		}
		return pay;
	}
	
}
