package com.ibm.cloud.empevents.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ibm.cloud.empevents.model.Employee;
import com.ibm.cloud.empevents.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeRepository repository;
	
	@PostMapping("/")
	public Employee add(@RequestBody Employee employee) {
		LOGGER.info("Employee add: {}", employee);
		return repository.save(employee);
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable("id") String id) {
		LOGGER.info("Employee find: id={}", id);
		return repository.findById(id).get();
	}
	@GetMapping("/{eventName}")
	public List<Employee> findByEventName(@PathVariable("eventName") String eventName) {
		LOGGER.info("Employee find: eventName={}", eventName);
		return repository.findByEventName(eventName);
	}
	
	@GetMapping("/")
	public Iterable<Employee> findAll() {
		LOGGER.info("Employee find");
		return repository.findAll();
	}
	
	@GetMapping("/department/{departmentId}")
	public List<Employee> findByDepartment(@PathVariable("departmentId") String departmentId) {
		LOGGER.info("Employee find: departmentId={}", departmentId);
		return repository.findByDepartmentId(departmentId);
	}
	
	@GetMapping("/organization/{organizationId}")
	public List<Employee> findByOrganization(@PathVariable("organizationId") String organizationId) {
		LOGGER.info("Employee find: organizationId={}", organizationId);
		return repository.findByOrganizationId(organizationId);
	}
	
}
