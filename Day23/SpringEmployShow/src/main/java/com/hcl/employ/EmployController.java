package com.hcl.employ;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployController {
	@RequestMapping("/employShow")
	public ModelAndView showEmp(HttpServletRequest req, HttpServletResponse res){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "select * from employ";
		List emps = null;
		emps = jt.query(sql, new RowMapper(){

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String empInfo = rs.getInt("empno")+"======"+
						rs.getString("name")+"======="+
						rs.getString("dept")+"======="+
						rs.getString("desig")+"======="+
						rs.getString("basic");
				return empInfo;
			}
		});
		return (new ModelAndView("ShowPage","emps",emps));
	}
	@RequestMapping("/searchEmploy")
	public ModelAndView searchEmploy(HttpServletRequest req, HttpServletResponse res ) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "select * from employ where empno = ?";
		int empno = Integer.parseInt(req.getParameter("empno"));
		
		List emp = jt.query(sql,new Object[] {
				empno
		},new RowMapper(){
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String empInfo = rs.getInt("empno")+"======"+
						rs.getString("name")+"======="+
						rs.getString("dept")+"======="+
						rs.getString("desig")+"======="+
						rs.getString("basic");
				return empInfo;
			}
		});
		return (new ModelAndView("ShowPage","emp",emp));
	}
	
	@RequestMapping("/insertEmploy")
	public ModelAndView employInsert(HttpServletRequest req, HttpServletResponse res) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "insert into employ values(?,?,?,?,?)";
		
		int empno = Integer.parseInt(req.getParameter("empno"));
		String name = req.getParameter("name");
		String dept = req.getParameter("dept");
		String desig = req.getParameter("desig");
		int basic  = Integer.parseInt(req.getParameter("basic"));
		
		jt.update(sql, new Object[]{empno,name,dept,desig,basic});
		return (new ModelAndView("ShowPage","message","Result Inserted"));
		
		
		
	}
}
