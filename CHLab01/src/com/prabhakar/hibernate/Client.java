//HIBERNATE CORE First Example.

package com.prabhakar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String as[]) {
		
		try{
			Customer cust = new Customer("sri", "sri@jlc", 11111, "Blore", "Enabled");

			Configuration cfg = new Configuration();
			cfg = cfg.configure();
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
