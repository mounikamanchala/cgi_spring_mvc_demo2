package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST, path = "/hello")
	public String sayHello(@RequestParam("t1") String str, Model theModel) {
//		request.setAttribute("ATTR1", request.getParameter("t1"));
//		theModel.addAttribute("ATTR1", request.getParameter("t1"));
		theModel.addAttribute("ATTR1", str);
		return "hello";
	}

	@RequestMapping(method = RequestMethod.POST, path = "/viewDetails")
	public String inputDetails(HttpServletRequest request) {
		request.setAttribute("attr1", request.getParameter("firstName"));
		request.setAttribute("attr2", request.getParameter("lastName"));
		request.setAttribute("attr3", request.getParameter("email"));
		return "inputDetails";
	}

}
