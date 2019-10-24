package com.hcl.dept;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeptCrud {
	public List<Department> showDept() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Department");
		List<Department> deptList = q.list();
		return deptList;
	}
	public Department searchDept(int deptno){
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Department where deptno = "+deptno);
		List<Department> deptList = q.list();
		Department d = deptList.get(0);
		return d;
	}
	
	public String addDepartment(Department d) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		int deptno = 0;
		Query q = s.createQuery("SELECT max(deptno) from Department ");
		for(Iterator it = q.iterate();it.hasNext();) {
			deptno = (Integer)it.next();
		}
		deptno++;
		d.setDeptno(deptno);
		s.save(d);
		Transaction t = s.beginTransaction();
		t.commit();
		return "****INSERTED****";
	}

    public String removeDept(int deptno) {
    	Department d = searchDept(deptno);
    	SessionFactory sf = HibernateUtil.getConnection();
    	Session s = sf.openSession();
    	s.delete(d);
    	Transaction t = s.beginTransaction();
    	t.commit();
    	return "****DELETED****";
    }

    public String updateDept(Department d) {
    	SessionFactory sf = HibernateUtil.getConnection();
    	Session s = sf.openSession();
    	Transaction t = s.getTransaction();
    	s.update(d);
    	t.begin();
    	t.commit();
    	return "=========UPDATED=====";
    	
    }
}
