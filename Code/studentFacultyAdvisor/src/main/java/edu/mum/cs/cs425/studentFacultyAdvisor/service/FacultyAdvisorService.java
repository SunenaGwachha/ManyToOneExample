package edu.mum.cs.cs425.studentFacultyAdvisor.service;
import java.util.List;

import edu.mum.cs.cs425.studentFacultyAdvisor.model.FacultyAdvisor;
public interface FacultyAdvisorService {
	List<FacultyAdvisor> findAll();
	FacultyAdvisor save(FacultyAdvisor facultyadvisor);
	FacultyAdvisor findOne(Long id);
	 void delete(Long id);
}









