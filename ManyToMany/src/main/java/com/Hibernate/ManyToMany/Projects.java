package com.Hibernate.ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
	
	@Id
	@Column(name="PROJECT_ID")
	private int projectId;
	
	@Column(name="PROJECT_NAME")
	private String projectName;
	
	@ManyToMany
	@JoinTable(name="JoinTable",joinColumns = @JoinColumn(name="MyProjectID"), inverseJoinColumns = @JoinColumn(name="MyEmployeeId"))
	private List<Employees> employeesList;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employees> getEmployeesList() {
		return employeesList;
	}

	public void setEmployeesList(List<Employees> employeesList) {
		this.employeesList = employeesList;
	}

	
	
	
	
	
	
}
