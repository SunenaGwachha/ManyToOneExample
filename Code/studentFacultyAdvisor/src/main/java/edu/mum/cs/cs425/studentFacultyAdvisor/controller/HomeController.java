package edu.mum.cs.cs425.studentFacultyAdvisor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class HomeController {
	
//@RequestMapping(value= {"/","/studentFacultyAdvisor","/studentFacultyAdvisor/home"}, method= RequestMethod.GET)
	
	@GetMapping(value={"/","/studentFacultyAdvisor","/studentFacultyAdvisor/home"})
	public String DisplayHomePage() {
		return "home/index";
	}


}

