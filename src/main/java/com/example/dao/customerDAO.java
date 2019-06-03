package com.example.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import com.example.model.customer;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
@Repository
public class customerDAO {
	private final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	public final String SUCCESS_STATUS = "SUCCESS";
	public final String ERROR_STATUS = "ERROR";
	public final int ERROR_STATUS_WHILE_ADD = -1;

	public List<customer> getAllCustomer() {
		Session session = sessionFactory.openSession();
		List<customer> listCustomer = null;
		try {
			session.getTransaction().begin();
			listCustomer = session.createQuery("from customer").list();
			session.getTransaction().commit();

		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
		} finally {
			session.close();
		}
		return listCustomer;
	}

	public String deleteCustomer(int id_customer) {
		Session session = sessionFactory.openSession();
		try {
			session.getTransaction().begin();
			customer departs = session.get(customer.class, id_customer);
			session.delete(departs);
			session.getTransaction().commit();
			return SUCCESS_STATUS;
		} catch (Exception e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();

			}
			return ERROR_STATUS;
		} finally {
			session.close();
		}

	}

	public String addCustomer(customer customer) {
		Session session = sessionFactory.openSession();
		try {
			session.getTransaction().begin();
			session.save(customer);
			session.getTransaction().commit();
			return SUCCESS_STATUS;
		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();

			}
			e.printStackTrace();
			return ERROR_STATUS;
		} finally {
			session.close();
		}

	}

	public String editCustomer(int id, customer customer) {
		Session session = sessionFactory.openSession();
		try {
			session.getTransaction().begin();
			customer customer2 = session.get(customer.class, id);
			customer.setId_customer(customer2.getId_customer());
			session.update(customer);
			session.getTransaction().commit();
			return SUCCESS_STATUS;

		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
			return ERROR_STATUS;
		} finally {
			session.close();
		}

	}
}
