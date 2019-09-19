package com.hcl.dept;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.catalina.connector.Request;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeptController {
	@RequestMapping("/deptShow")
	public ModelAndView showDept(HttpServletRequest req, HttpServletResponse res){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "select * from department";
		List depts = null;
		depts = jt.query(sql, new RowMapper(){

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String deptInfo = rs.getInt("deptno")+"======"+
						rs.getString("dname")+"======="+
						rs.getString("loc")+"======="+
						rs.getString("head");
				return deptInfo;
			}
		});
		return (new ModelAndView("ShowPage","depts",depts));
	}
	@RequestMapping("/searchDept")
	public ModelAndView searchDept(HttpServletRequest req, HttpServletResponse res){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		int deptno = Integer.parseInt(req.getParameter("deptno"));
		String sql = "select * from department where deptno = ?";
		List dept = null;
		dept = jt.query(sql,new Object[]{
				deptno
		}, new RowMapper(){

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String deptInfo = rs.getInt("deptno")+"======"+
						rs.getString("dname")+"======="+
						rs.getString("loc")+"======="+
						rs.getString("head");
				return deptInfo;
			}
			
		});
		return (new ModelAndView("ShowPage","result",dept));
	}
	@RequestMapping("/insertDept")
	public ModelAndView deptInsert(HttpServletRequest req, HttpServletResponse res) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "insert into department values(?,?,?,?)";
		
		int deptno = Integer.parseInt(req.getParameter("deptno"));
		String dname = req.getParameter("dname");
		String loc = req.getParameter("loc");
		String head = req.getParameter("head");
		
		jt.update(sql, new Object[]{deptno,dname,loc,head});
		return (new ModelAndView("ShowPage","message","Result Inserted"));
		
		
		
	}
}
