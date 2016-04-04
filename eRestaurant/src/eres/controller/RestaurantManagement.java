package eres.controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import eres.model.Restaurant;
import eres.utils.HibernateUtil;

public class RestaurantManagement extends HibernateUtil {
	 public Restaurant add(Restaurant contact) {
	        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        session.save(contact);
	        session.getTransaction().commit();
	        return contact;
	    }
	    public Restaurant delete(String restaurantId) {
	        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        Restaurant contact = (Restaurant) session.load(Restaurant.class, restaurantId);
	        if(null != contact) {
	            session.delete(contact);
	        }
	        session.getTransaction().commit();
	        return contact;
	    }
	 
		public List<Restaurant> list() {
	         
	        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        List<Restaurant> contacts = null;
	        try {
	             
	            contacts = (List<Restaurant>)session.createQuery("from Restaurant").list();
	             
	        } catch (HibernateException e) {
	            e.printStackTrace();
	            session.getTransaction().rollback();
	        }
	        session.getTransaction().commit();
	        return contacts;
	    }
	}
