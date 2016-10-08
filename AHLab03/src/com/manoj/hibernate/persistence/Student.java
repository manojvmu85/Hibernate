//HIBERNATE Annotation Example Using Collection Mapping.

package com.manoj.hibernate.persistence;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Proxy;


@Entity
@Table(name="students")
@Proxy(lazy=false)
public class Student {

	@Id
	@Column(name="sid")
	private int sid;

	@Column(name="fname")
	private String fname;

	@Column(name="lname")
	private String lname;

	@Column(name="city")
	private String city;

	@Column(name="status")
	private String status;
	
	@CollectionOfElements
	@JoinTable(name="emails", joinColumns=@JoinColumn(name ="sid"))
	@IndexColumn(name="idx")
	@Column(name="emailId")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> emails;
	
	@CollectionOfElements
	@JoinTable(name="marks", joinColumns=@JoinColumn(name ="sid"))
	@IndexColumn(name="idx")
	@Column(name="marks")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Integer> marks;
	
	@CollectionOfElements
	@JoinTable(name="courses", joinColumns=@JoinColumn(name ="sid"))
	@IndexColumn(name="idx")
	@Column(name="courses")
	@LazyCollection(LazyCollectionOption.FALSE)
	private String[] courses;
	
	@CollectionOfElements
	@JoinTable(name="phones", joinColumns=@JoinColumn(name ="sid"))
	@IndexColumn(name="idx")
	@Column(name="phoneNo")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<Long> phones;
	
	@CollectionOfElements
	@JoinTable(name="refs", joinColumns=@JoinColumn(name ="sid"))
	@Column(name="rphone")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Map<String, Long> refs;
	
	public Student() {
		super();
	}

	public Student(int sid, String fname, String lname, String city,
			String status, List<String> emails, List<Integer> marks,
			String[] courses, Set<Long> phones, Map<String, Long> refs) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.status = status;
		this.emails = emails;
		this.marks = marks;
		this.courses = courses;
		this.phones = phones;
		this.refs = refs;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

}
