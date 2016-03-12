package com.test.bean;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", cid=" + cid
				+ "]";
	}

	private Integer sid;
	private String sname;
	private Integer cid;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String sname) {
		this.sname = sname;
	}

	/** full constructor */
	public Student(String sname, Integer cid) {
		this.sname = sname;
		this.cid = cid;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

}