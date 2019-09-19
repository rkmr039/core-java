package com.hcl.dept;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insertEmploy() {
		int deptno;
		String name,loc,head;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dept No :");
		deptno = Integer.parseInt(sc.nextLine());
		System.out.println("Dept Name :");
		name = sc.nextLine();
		System.out.println("Department Location : ");
		loc = sc.nextLine();
		System.out.println("Dept Head: ");
		head = sc.nextLine();
		String cmd = "insert into department values(?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[]{
			
				deptno,
				name,
				loc,
				head		});
	}
}
