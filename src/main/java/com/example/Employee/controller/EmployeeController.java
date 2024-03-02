package com.example.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.entity.Employee;
import com.example.Employee.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	public EmployeeRepository employeeRepository;

	@PostMapping("/save")
	public Employee create(@RequestBody Employee employee) {
	    Employee emp = employeeRepository.save(employee);
	    return emp;
	}

	@GetMapping("/empById/{empId}")
	public Employee getEmployeeById(@PathVariable(value = "empId") String empId) {
		Employee employee = employeeRepository.getByEmpId(empId);
		return employee;
	}

	@GetMapping("/list")
	public List<Employee> list() {
		return employeeRepository.findAll();
	}
}
