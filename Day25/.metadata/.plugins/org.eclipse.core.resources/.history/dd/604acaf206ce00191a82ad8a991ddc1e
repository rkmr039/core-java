package com.hcl.emp;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class AddEmploy {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Employ e = new Employ();
		e.setEmpno(10000);
		e.setName("xxxxx");
		e.setDept("xxxxxx");
		e.setDesig("xxxxxxxx");
		e.setBasic(2327392);
		
		s.save(e);
		Transaction t = s.getTransaction();
		t.begin();
		t.commit();
		
		System.out.println("Inserted Successfully"); 
		
	}
	
}
