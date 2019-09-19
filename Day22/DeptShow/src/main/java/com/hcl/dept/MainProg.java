package com.hcl.dept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		DataQueryDao d = (DataQueryDao)ctx.getBean("myDao");
	d.showDept();
	/*System.out.println(new Date());
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	System.out.println(sdf.format(new Date()));*/
	Date d1 = new Date();
	System.out.println(d1.getDate());
	/*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	String sDate = sdf.format(d1);
	System.out.println(sDate);*/
	
	
	}
}
