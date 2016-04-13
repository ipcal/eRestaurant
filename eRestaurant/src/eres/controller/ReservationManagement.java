package eres.controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import eres.model.Reservation;
import eres.utils.HibernateUtil;

public class ReservationManagement extends HibernateUtil {

	public Reservation add(Reservation contact) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(contact);
        session.getTransaction().commit();
        return contact;
    }
	
	public Reservation delete(Reservation reserId) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Reservation contact = (Reservation) session.load(Reservation.class, reserId);
        if(null != contact) {
            session.delete(contact);
        }
        session.getTransaction().commit();
        return contact;
    }
	
	public List<Reservation> list() {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Reservation> contacts = null;
        try {
             
            contacts = (List<Reservation>)session.createQuery("from Reservation").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return contacts;
    }
}
