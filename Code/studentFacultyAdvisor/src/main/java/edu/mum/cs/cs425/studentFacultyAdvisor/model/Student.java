package edu.mum.cs.cs425.studentFacultyAdvisor.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long studentId;
	private long studentNumber;
	private String name;
	private float cgpa;
	
	@DateTimeFormat(pattern = "yyyy-M-d")
	private LocalDate admissionDate;
	
	@ManyToOne()
    @JoinColumn(name = "facultyadvisorId", nullable = false)
    private FacultyAdvisor facultyadvisor;
		
	public Student() {
		
	}
	
	
		
	public Student(long studentNumber, String name, float cgpa, LocalDate admissionDate) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.cgpa = cgpa;
		this.admissionDate = admissionDate;
		
	}




	public long getStudentId() {
		return studentId;
	}




	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}




	public long getStudentNumber() {
		return studentNumber;
	}




	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public float getCgpa() {
		return cgpa;
	}




	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}




	public LocalDate getAdmissionDate() {
		return admissionDate;
	}




	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}




	public FacultyAdvisor getFacultyadvisor() {
		return facultyadvisor;
	}




	public void setFacultyadvisor(FacultyAdvisor facultyadvisor) {
		this.facultyadvisor = facultyadvisor;
	}




	@Override
	public String toString() {
		return name+" ( "+studentNumber+" )";
	}
	
	

}
