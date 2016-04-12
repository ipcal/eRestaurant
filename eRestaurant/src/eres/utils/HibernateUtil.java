package eres.utils;
 
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

 
public class HibernateUtil {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
    private static SessionFactory buildSessionFactory() {
    	
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    			.configure("hibernate.cfg.xml") // configures settings from hibernate.cfg.xml
    			.build();
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	return new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        	

        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}