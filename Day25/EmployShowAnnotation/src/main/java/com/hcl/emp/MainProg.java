package com.hcl.emp;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class MainProg {

	public static void main(String[] args) {

		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory(); // Cache level 1
		Session s=sf.openSession(); // Cache level 2
		Query q=s.createQuery("from Employ"); // HQL Query
 		List list=q.list();
		for(Object ob:list){
			Employ e = (Employ)ob;
			System.out.println("Employ no........."+e.getEmpno());
			System.out.println("Name of Employ...."+e.getName());
			System.out.println("Department........"+e.getDept());
			System.out.println("Designation......."+e.getDesig());
			System.out.println("Basic............."+e.getBasic());
			System.out.println();
		}
	}
}