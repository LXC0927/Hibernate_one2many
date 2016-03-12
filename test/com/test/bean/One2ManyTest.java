package com.test.bean;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.util.HibernateUtil;

public class One2ManyTest {
	
	private static Session session;
	private static Transaction transaction;
	@Before
	public void setUp(){
		session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
	}
	@Test
	public void test() {
		updateClass();
	}
	
	@After
	public void close(){
		HibernateUtil.closeSession(session);
	}

	public void add() {
		Class c1 = new Class("JAVA一班");
		Student s1 = new Student("张三");
		Student s2 = new Student("李四");
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		session.save(c1);
		session.save(s1);
		session.save(s2);
		transaction.commit();
		
	}
	
	public void getStudentsByCid(int cid){
		Class class1 = (Class) session.get(Class.class, cid);		
		Iterator iterator = class1.getStudents().iterator();
		System.out.println(class1.getCname()+"学生名单：");
		while(iterator.hasNext()){
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		
	}
	
	public void updateClass(){
		Class class1 = (Class) session.get(Class.class, 2);	
		class1.setCname("JAVA二班");
		session.update(class1);
		transaction.commit();
	}

}
