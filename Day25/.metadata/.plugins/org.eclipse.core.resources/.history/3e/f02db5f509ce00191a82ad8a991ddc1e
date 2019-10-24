package com.hcl.emp;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmploySearch {
	public static void main(String[] args) {
		int empno;
		System.out.println("Enter empno : ");
		Scanner sc = new Scanner(System.in);
		empno = Integer.parseInt(sc.nextLine());
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employ where Empno = "+empno);
		List<Employ> list = q.list();
		Employ e = list.get(0);
		if(e != null) {
			System.out.println("===============================");
			System.out.println("Employ no........."+e.getEmpno());
			System.out.println("Name of Employ...."+e.getName());
			System.out.println("Department........"+e.getDept());
			System.out.println("Designation......."+e.getDesig());
			System.out.println("Basic............."+e.getBasic());
		}
		
		e.setDept("XYZ");
		Transaction t=s.beginTransaction();
		t.commit();
  }
}
