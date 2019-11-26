package com.ibm.cloud.empevents.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ibm.cloud.empevents.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	List<Employee> findByDepartmentId(String departmentId);
	List<Employee> findByOrganizationId(String organizationId);
	List<Employee> findByEventName(String eventName);
	
}
