//HIBERNATE Annotation Example Using Collection Mapping.

package com.manoj.hibernate.client;

import java.util.*;

import com.manoj.hibernate.persistence.Student;
import com.manoj.hibernate.util.HibernateTemplate;

public class Client {

	public static void main(String as[]) {

		List<String> emails = new ArrayList<String>();
		emails.add("a@gmail.com");
		emails.add("b@gmail.com");

		List<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);

		String[] courses = {"JAVA", "JSP", "JDBC", "EJB"};

		Set<Long> phones = new HashSet<Long>();
		phones.add(new Long(1111));
		phones.add(new Long(2222));

		Map<String, Long> refs = new HashMap<String, Long>();
		refs.put("AAA", new Long(111));
		refs.put("AAA", new Long(111));

		Student stu = new Student(9, "pra", "kar", "Blore", "Enabled", emails, marks, courses, phones, refs);

		//Adding the Students.....
		Integer it = (Integer)HibernateTemplate.save(stu);
		System.out.println(it.intValue());

		//Loading the Student.....
		stu = (Student)HibernateTemplate.load(Student.class, 9);
		System.out.println(stu.getSid()+"\t"+stu.getFname()+"\t"+stu.getLname()+"\t"+stu.getCity()+"\t"+stu.getStatus());
		System.out.println(stu.getEmails());
		System.out.println(stu.getMarks());
		System.out.println(stu.getCourses());
		System.out.println(stu.getPhones());
		System.out.println(stu.getRefs());
	}

}
