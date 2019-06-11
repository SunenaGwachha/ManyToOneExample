package edu.mum.cs.cs425.studentFacultyAdvisor.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.cs.cs425.studentFacultyAdvisor.model.FacultyAdvisor;

import edu.mum.cs.cs425.studentFacultyAdvisor.service.FacultyAdvisorService;





@Controller
public class FacultyAdvisorController {

	@Autowired
	private FacultyAdvisorService facultyadvisorService;

	@RequestMapping(value="/facultyadvisors", method = RequestMethod.GET)
	public ModelAndView facultyadvisors(){		
		List<FacultyAdvisor>facultyadvisors = facultyadvisorService.findAll();		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("facultyadvisors", facultyadvisors);
		modelAndView.setViewName("facultyadvisor/facultylist");
		return modelAndView;
	}
	
	@RequestMapping(value="/facultyadvisor", method = RequestMethod.GET)
	public String create(Model model){			
		model.addAttribute("facultyadvisor", new FacultyAdvisor());
		return "facultyadvisor/facultyedit";
	}
	
	@RequestMapping(value = "/facultyadvisor", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("facultyadvisor") FacultyAdvisor facultyadvisor, 
			BindingResult result, Model model)  {

		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			return "facultyadvisor/facultyedit";
		}
		facultyadvisor = facultyadvisorService.save(facultyadvisor);
		return "redirect:/facultyadvisors";
	}	
	
	@RequestMapping(value="/facultyadvisor/{id}", method = RequestMethod.GET)
	public String view(@PathVariable Long id, Model model){	
		model.addAttribute("facultyadvisor", facultyadvisorService.findOne(id));
		return "facultyadvisor/facultyedit";
	}
	
	@RequestMapping(value="/facultyadvisor/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Long id, Model model){		
		facultyadvisorService.delete(id);
		return "redirect:/facultyadvisors";
	}	
}


