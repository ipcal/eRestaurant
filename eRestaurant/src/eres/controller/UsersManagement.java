package eres.controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import eres.model.Users;
import eres.utils.HibernateUtil;

public class UsersManagement extends HibernateUtil {
	public Users add(Users contact) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(contact);
        session.getTransaction().commit();
        return contact;
    }
    public Users delete(String userId) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Users contact = (Users) session.load(Users.class, userId);
        if(null != contact) {
            session.delete(contact);
        }
        session.getTransaction().commit();
        return contact;
    }
 
	public List<Users> list() {
         
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Users> contacts = null;
        try {
             
            contacts = (List<Users>)session.createQuery("from Restaurant").list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.getTransaction().commit();
        return contacts;
    }
	
	public Users findUser(String userId, String password){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        System.out.println("UserID:"+userId +" password:"+ password);
        String sql = "select u from Users u where u.userId=:name and u.password=:pass";
        Query query = session.createQuery(sql);
        query.setParameter("name", userId);
        query.setParameter("pass", password);
        Users user = (Users) query.uniqueResult();
        if(user != null){
            System.out.println("User Retrieved from DB::"+user.getUserId());
        }
        session.close();
        return user;
	}
	
	public Users getUserInfo(String userId){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        System.out.println("getUserInfo.UserID:"+userId );
        String sql = "select u from Users u where u.userId=:id";
        Query query = session.createQuery(sql);
        query.setParameter("id", userId);
        Users user = (Users) query.uniqueResult();
        if(user != null){
            System.out.println("User Retrieved from DB::"+user.getUserId());
        }
        session.close();
        return user;
	}
	
	public void updateUser(Users user){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx= null;
		
        try {
        	tx= session.beginTransaction();
        	 System.out.println("updateUser.UserID:"+user.getUserId()+" "+user.getName() +" "+user.getPhoneNumber()+" "+user.getEmail()+" "+user.getAddress());
        	 Users contact = (Users)session.get(Users.class, user.getUserId());
        	 contact.setName(user.getName());
        	 contact.setPhoneNumber(user.getPhoneNumber());
        	 contact.setEmail(user.getEmail());
        	 contact.setGender(user.getGender());
        	 contact.setAddress(user.getAddress());
        	 session.update(contact);
        	 tx.commit();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        
	
	}
	
	public void updatePw(Users user){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx= null;
		
        try {
        	tx= session.beginTransaction();
        	 System.out.println("updatePw.UserID:"+user.getUserId());
        	 Users contact = (Users)session.get(Users.class, user.getUserId());
        	 contact.setPassword(user.getPassword());
        	 session.update(contact);
        	 tx.commit();
             
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        
	
	}

}
