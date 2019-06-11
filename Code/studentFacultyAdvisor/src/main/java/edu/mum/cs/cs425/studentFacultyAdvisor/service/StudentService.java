package edu.mum.cs.cs425.studentFacultyAdvisor.service;
import java.util.List;

import edu.mum.cs.cs425.studentFacultyAdvisor.model.Student;
public interface StudentService {
	List<Student> findAll();
	Student save(Student student);
	Student findOne(Long id);
	 void delete(Long id);
}








