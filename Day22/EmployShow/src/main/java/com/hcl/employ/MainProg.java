package com.hcl.employ;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		DataQueryDao d = (DataQueryDao)ctx.getBean("myDao");
		d.showEmploy();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empno : ");
		int empno = Integer.parseInt(sc.nextLine());
		d.searchEmploy(empno);
	}
}
