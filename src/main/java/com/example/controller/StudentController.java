package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/")
	public String showStudentForm(Model theModel) {
		theModel.addAttribute("student", new Student());
		return "showForm";
	}
	
	@RequestMapping(method = RequestMethod.POST,path = "/processForm")
	public String processForm(@ModelAttribute("student") Student studentModel, Model theModel) {
		theModel.addAttribute("ss", studentModel);
		return "processForm";
	}
}
