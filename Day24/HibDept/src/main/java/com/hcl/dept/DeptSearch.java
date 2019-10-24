package com.hcl.dept;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DeptSearch {
	public static void main(String[] args) {
		int deptno = 1;
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Department where Deptno = "+deptno);
		List list = q.list();
		if(list != null) {
			Department d = (Department)list.get(0);
			System.out.println("DeptNo                             :" + d.getDeptno());
			System.out.println("Name                               :" + d.getDname());
			System.out.println("Location                           :" + d.getLoc());
			System.out.println("Head                               :" + d.getHead());
			System.out.println("====================================================");
		}
		
	}
}