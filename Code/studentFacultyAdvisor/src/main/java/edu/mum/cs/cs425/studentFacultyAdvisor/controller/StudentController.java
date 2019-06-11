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
import edu.mum.cs.cs425.studentFacultyAdvisor.model.Student;
import edu.mum.cs.cs425.studentFacultyAdvisor.service.StudentService;




@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value="/students", method = RequestMethod.GET)
	public ModelAndView students(){		
		List<Student>students = studentService.findAll();		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", students);
		modelAndView.setViewName("student/studentlist");
		return modelAndView;
	}
	
	@RequestMapping(value="/student", method = RequestMethod.GET)
	public String create(Model model){			
		model.addAttribute("student", new Student());
		return "student/studentedit";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("student") Student student, 
			BindingResult result, Model model)  {

		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			return "student/studentedit";
		}
		student = studentService.save(student);
		return "redirect:/students";
	}	
	
	@RequestMapping(value="/student/{id}", method = RequestMethod.GET)
	public String view(@PathVariable Long id, Model model){	
		model.addAttribute("student", studentService.findOne(id));
		return "student/studentedit";
	}
	
	@RequestMapping(value="/student/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Long id, Model model){		
		studentService.delete(id);
		return "redirect:/students";
	}	
}

