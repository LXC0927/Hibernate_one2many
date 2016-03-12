package com.test.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Class entity. @author MyEclipse Persistence Tools
 */

public class Class implements java.io.Serializable {

	// Fields

	private Integer cid;
	private String cname;
	
	private Set<Student> students = new HashSet<Student>();

	// Constructors

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	/** default constructor */
	public Class() {
	}

	/** full constructor */
	public Class(String cname) {
		this.cname = cname;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Class [cid=" + cid + ", cname=" + cname + "]";
	}

}