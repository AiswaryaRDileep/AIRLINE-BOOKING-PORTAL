package com.simplilearn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.entity.Flight;
import com.simplilearn.util.HibernateUtil;

@WebServlet("/delete-flight")
public class DeleteFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteFlightServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("f_id"));
		System.out.println(id);
		Session session = null;
		Transaction tx = null;
		try( SessionFactory sessionFactory = HibernateUtil.buildSessionFactory()) {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Flight fly = session.get(Flight.class, id);
			if(fly != null) {
				session.delete(fly);
				System.out.println("Flight deleted");
			}
			tx.commit();
		}catch(Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		 response.sendRedirect("flightreport.jsp");
	}

	
	

}
