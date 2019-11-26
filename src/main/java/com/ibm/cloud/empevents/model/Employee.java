package com.ibm.cloud.empevents.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {

	@Id
	private String id;
	private String organizationId;
	private String departmentId;
	private String employeeName;
	private String eventName;
	private String date;

	public Employee() {

	}
	
	public Employee(String organizationId, String departmentId, String employeeName, String eventName, String date) {
		this.organizationId = organizationId;
		this.departmentId = departmentId;
		this.employeeName = employeeName;
		this.date = date;
		this.eventName = eventName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", organizationId=" + organizationId + ", departmentId=" + departmentId
				+ ", name=" + employeeName + ", eventName=" + eventName + "]";
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
