package com.hcl.dept;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class AddDepartment {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Department d = new Department();
		
		d.setDeptno(111111);
		d.setDname("JAVA");
		d.setLoc("Kolkata");
		d.setHead("Guru");
		
		
		
		s.save(d);
		Transaction t = s.getTransaction();
		t.begin();
		t.commit();
		
		System.out.println("Inserted");
		
	} 
}