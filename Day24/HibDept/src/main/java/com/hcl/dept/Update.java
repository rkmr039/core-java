package com.hcl.dept;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class Update {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Department d = new Department();
		d.setDeptno(1);
		d.setDname("changedName2");
		s.update(d);
		s.beginTransaction().commit(); 
		System.out.println("UPDATED");
	}
}
