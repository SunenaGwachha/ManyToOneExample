package edu.mum.cs.cs425.studentFacultyAdvisor.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.studentFacultyAdvisor.model.Student;
import edu.mum.cs.cs425.studentFacultyAdvisor.repository.StudentRepository;
import edu.mum.cs.cs425.studentFacultyAdvisor.service.StudentService;



	
	@Service("studentService")
	public class StudentServiceImpl implements StudentService {

		@Autowired
	StudentRepository studentRepository;
		
		@Override
		public List<Student> findAll() {
			return studentRepository.findAll();
		}

		@Override
		public Student save(Student student) {
			return studentRepository.save(student);
		}

		@Override
		public Student findOne(Long studentID) {
			Optional b=studentRepository.findById(studentID);
			
			
			return (Student) b.orElse(new Student());
		}

		@Override
		public void delete(Long id) {
			studentRepository.deleteById(id);
		}


}






