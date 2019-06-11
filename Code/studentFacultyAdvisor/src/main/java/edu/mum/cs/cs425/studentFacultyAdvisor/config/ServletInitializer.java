package edu.mum.cs.cs425.studentFacultyAdvisor.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import edu.mum.cs.cs425.studentFacultyAdvisor.StudentFacultyAdvisorApplication;

public class ServletInitializer extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StudentFacultyAdvisorApplication.class);
	}

}
