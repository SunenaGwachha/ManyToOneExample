package edu.mum.cs.cs425.studentFacultyAdvisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.studentFacultyAdvisor.model.FacultyAdvisor;

@Repository("studentkRepository")
public interface FacultyAdvisorRepository extends JpaRepository<FacultyAdvisor, Long>  {

}










