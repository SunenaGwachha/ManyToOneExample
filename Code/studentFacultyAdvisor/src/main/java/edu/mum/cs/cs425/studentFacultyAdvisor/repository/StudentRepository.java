package edu.mum.cs.cs425.studentFacultyAdvisor.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.studentFacultyAdvisor.model.Student;

@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Student, Long>  {

}










