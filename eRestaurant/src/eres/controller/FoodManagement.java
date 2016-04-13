package eres.controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import eres.model.Food;
import eres.model.Reservation;
import eres.model.Users;
import eres.utils.HibernateUtil;

public class FoodManagement extends HibernateUtil{
	
	public Food add(Food contact) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(contact);
        session.getTransaction().commit();
        return contact;
    }
	
	public Food delete(Food foodId) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Food contact = (Food) session.load(Food.class, foodId);
        if(null != contact) {
            session.delete(contact);
        }
        session.getTransaction().commit();
        return contact;
    }
	
	public List<Food> list() {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Food> contacts = null;
        try {
             
            contacts = (List<Food>)session.createQuery("from Food").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return contacts;
    }
	
	public List<Food> listByMenuId(String menuId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Food> contacts = null;
        System.out.println("listByMenuId.menuId:"+menuId );
        try {
        	 String sql = "select f from Food f where f.menuId=:id";
             Query query = session.createQuery(sql);
             query.setParameter("id", menuId);
             contacts = (List<Food>) query.list();
             if (contacts.size() > 0)
             {
            	 System.out.println("number of food Retrieved from DB::"+contacts.size());
             }
        }
        catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.close();
        return contacts;
        }

}
