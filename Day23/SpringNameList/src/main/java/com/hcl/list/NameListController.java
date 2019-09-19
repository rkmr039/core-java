package com.hcl.list;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {
	@RequestMapping("/names")
	public ModelAndView nameDemo(HttpServletRequest req, HttpServletResponse res) {
		List<String> lstNames = new ArrayList<String>(); 
		lstNames.add("Sindhu");
		lstNames.add("Rishab");
		lstNames.add("Tushar");
		
		return new ModelAndView("ShowName","nameList",lstNames); 
	}
}
