package com.Hibernate.ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class Employees {
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private int employeId;
	
	@Column(name="EMPLOYEE_NAME")
	private String empName;
	
	@ManyToMany(mappedBy = "employeesList") // MappedBy tell which attribute is used in jointable for the mapping, we can't use jointable and mapped at same class
	private List<Projects> projects;

	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employees [employeId=" + employeId + ", empName=" + empName + ", projects=" + projects + "]";
	}

	
	
}
