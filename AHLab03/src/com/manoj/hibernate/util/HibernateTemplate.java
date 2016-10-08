package com.manoj.hibernate.util;

import java.io.*;

import org.hibernate.*;

public class HibernateTemplate {
	
	public static Object save(Object obj){
		
		Object o = null;
		try{
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			o = session.save(obj);
			tx.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return o;
	}
	
	public static Object load(Class cls,Serializable s){
		
		Object o = null;
		try{
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			o = session.load(cls, s);
			tx.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return o;
	}
	
	public static void update(Object obj){
		
		try{
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			session.update(obj);
			tx.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public static void delete(Class cls,Serializable s){
		
		try{
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Object o = session.load(cls, s);
			session.delete(o);
			tx.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
		
	}

}
