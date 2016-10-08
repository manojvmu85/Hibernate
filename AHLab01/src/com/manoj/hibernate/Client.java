
//HIBERNATE Annotation First Example.

package com.manoj.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client {

	@SuppressWarnings("deprecation")
	public static void main(String as[]) {
		
		try{
			Customer cust = new Customer(33, "Kuamr", "kumar@gmail.com", 12345, "Bumbai", "Enabled");

			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg = (AnnotationConfiguration)cfg.configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Integer it = (Integer)session.save(cust);
			System.out.println(it.intValue());
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
