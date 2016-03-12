package com.test.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Class implements Serializable {
	private int cid;
	private String cname;
	
	private Set<Student> students = new HashSet<Student>();
	
	
	
	public Class() {
		//super();
	}



	public Class(String cname, Set<Student> students) {
		//super();
		this.cname = cname;
		this.students = students;
	}



	public Class(String cname) {
		super();
		this.cname = cname;
	}



	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
}
