package edu.mum.cs.cs425.studentFacultyAdvisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class StudentFacultyAdvisorApplication  extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StudentFacultyAdvisorApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(StudentFacultyAdvisorApplication.class, args);
	}

}
