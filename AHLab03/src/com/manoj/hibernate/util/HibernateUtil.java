package com.manoj.hibernate.util;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {
	
	static SessionFactory sessionFactory = null;
	static
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg = (AnnotationConfiguration)cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

}
