package edu.mum.cs.cs425.studentFacultyAdvisor.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.studentFacultyAdvisor.model.FacultyAdvisor;
import edu.mum.cs.cs425.studentFacultyAdvisor.repository.FacultyAdvisorRepository;
import edu.mum.cs.cs425.studentFacultyAdvisor.service.FacultyAdvisorService;


	
	@Service("facultyadvisorService")
	public class FacultyAdvisorImpl implements FacultyAdvisorService {

		@Autowired
		FacultyAdvisorRepository facultyadvisorRepository;
		
		@Override
		public List<FacultyAdvisor> findAll() {
			return facultyadvisorRepository.findAll();
		}

		@Override
		public FacultyAdvisor save(FacultyAdvisor facultyadvisor) {
			return facultyadvisorRepository.save(facultyadvisor);
		}

		@Override
		public FacultyAdvisor findOne(Long facultyadvisorID) {
			Optional b=facultyadvisorRepository.findById(facultyadvisorID);
			
			
			return (FacultyAdvisor) b.orElse(new FacultyAdvisor());
		}

		@Override
		public void delete(Long id) {
			facultyadvisorRepository.deleteById(id);
		}


}






