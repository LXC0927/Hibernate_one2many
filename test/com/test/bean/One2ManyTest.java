package com.test.bean;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.test.util.HibernateUtil;

public class One2ManyTest {
	

	@Test
	public void test() {
		Class c1 = new Class("JAVA一班");
		Student s1 = new Student("张三");
		Student s2 = new Student("李四");
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(c1);
		session.save(s1);
		session.save(s2);
		transaction.commit();
		HibernateUtil.closeSession(session);
	}

}
