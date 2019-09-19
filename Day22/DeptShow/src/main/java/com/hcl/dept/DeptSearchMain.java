package com.hcl.dept;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptSearchMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		DataQueryDao d = (DataQueryDao)ctx.getBean("myDao");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Deptno : ");
		int deptno = Integer.parseInt(sc.nextLine());
		d.searchDept(deptno);
	}
}