package com.simplilearn.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.entity.Admin;
import com.simplilearn.util.HibernateUtil;

public class AdminDAO {
	
	public static boolean findAdmin(String userName, String password) {
		Session session = null;
		Admin admin = null;
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
			session = sessionFactory.openSession();
			 tx = session.beginTransaction();
			admin = (Admin)session.createQuery("FROM Admin A WHERE A.userName = :userName").setParameter("userName", userName)
					.uniqueResult();
			if(admin != null && admin.getPassword().equals(password)) {
				return true;
			}
			tx.commit();
		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return false;
	}

}
