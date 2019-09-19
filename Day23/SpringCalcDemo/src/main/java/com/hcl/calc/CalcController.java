package com.hcl.calc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
	@RequestMapping("/calc")
	public ModelAndView calculate(HttpServletRequest req, HttpServletResponse res) {
		int a = Integer.parseInt(req.getParameter("firstNo"));
		int b = Integer.parseInt(req.getParameter("secondNo"));
		
		int c = a + b;
		String result = " ";
		result +=c;
		return new ModelAndView("result","result",result);
	}
}
