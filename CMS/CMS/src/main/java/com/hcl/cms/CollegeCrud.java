package com.hcl.cms;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import org.hibernate.SessionFactory;

public class CollegeCrud {
	
	public boolean addSubject(Subjects subject){
		boolean flag = false;
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		
		s.save(subject);
		Transaction t = s.beginTransaction();
		t.commit();
		flag = true;
		return flag;		
	}

	public boolean addFeedback(Feedback f) {
		boolean flag = false;
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		
		s.save(f);
		Transaction t = s.beginTransaction();
		t.commit();
		flag = true;
		return flag;		
	}

	public String getFeedbackId(){
		String fid = "";
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q =  s.createQuery("SELECT max(fid) from Feedback");
		for(Iterator it = q.iterate(); it.hasNext();) {
			fid = (String) it.next();
			if(fid == null) {
				fid = "C000";
			}
			int temp = Integer.parseInt(fid.substring(1));
			
			temp++;
			fid = String.format("C%03d", temp);
			
		}
		return fid;
	}
 
	public List<String> getInstructors() {
		List<String> instructors;
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q =  s.createQuery("select distinct instructor from Subjects");
		instructors = q.list();
		
		return instructors;
	}

	public Map<String, List<String>> getInstructorsAndSubjects() {
		List<String> instructors;
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q =  s.createQuery("select distinct instructor from Subjects");
		instructors = q.list();
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		for (String ins : instructors) {
			Query q2 = s.createQuery("select subject from Subjects where instructor = ?" );
			q2.setParameter(0, ins);
			List subList = q2.list();
			List<String> subListRes = new ArrayList<String>();
			for (Object object : subList) {
				// System.out.println((String)object);
				subListRes.add((String)object);
			}
			list.put(ins, subListRes);
			
		}
		
		return list;
	}
	
	public List<String> getSubjectsByInstructor(String ins) {
		List<String> result;
		
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("select subject from Subjects where instructor = ?" );
		q.setParameter(0, ins);
		result = q.list();
		/*for(Object obj : result) {
			System.out.println((String)obj);
		}*/
		return result;
		
	}

	public List<FbCount> getFeedbackCount(String ins, String sub){
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("select fbvalue,count(*) from Feedback where instructor = ? and subject = ? group by fbvalue");
		q.setParameter(0, ins);
		q.setParameter(1, sub);
		List list = q.list();
		List<FbCount> res = new ArrayList<FbCount>();;
		Iterator it = list.iterator();
		while(it.hasNext()) {
			FbCount fb = new FbCount();
			Object[] o = (Object[])it.next();
			// System.out.println(o[0].toString());
			// System.out.println(Integer.parseInt(o[1].toString()));
			fb.setFbValue(o[0].toString());
			fb.setCount(Integer.parseInt(o[1].toString()));
			res.add(fb);
		}
		return res;
		
	}
}
