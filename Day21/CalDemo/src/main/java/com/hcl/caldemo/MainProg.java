package com.hcl.caldemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
 public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("Calc.xml");
	Calc c = (Calc)ctx.getBean("b1");
	
	System.out.println("Sum : " + c.sum());
	System.out.println("Sub : " + c.sub());
	System.out.println("Mult : " + c.mult());
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	System.out.println(sdf.format(new Date()));
	System.out.println(new Date());
	// System.out.println(Calendar.getInstance(aLocale));
	// System.out.println( sdf.parse(new java.util.Date()));
	String startDate="27-08-2019";
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
	java.util.Date date;
	try {
		date = sdf1.parse(startDate);
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());  
		System.out.println(sqlStartDate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
