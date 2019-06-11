package edu.mum.cs.cs425.studentFacultyAdvisor.model;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="facultyadvisor")
public class FacultyAdvisor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long facultyadvisorId;
	private String name;
	private String phone;
	
	
	@OneToMany(mappedBy="facultyadvisor", cascade=CascadeType.ALL)
    
    private List<Student>students=new ArrayList<>();
		
	public FacultyAdvisor() {
		
	}

	public long getFacultyadvisorId() {
		return facultyadvisorId;
	}

	public void setFacultyadvisorId(long facultyadvisorId) {
		this.facultyadvisorId = facultyadvisorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return name;
	}
	
		
	
	

}
