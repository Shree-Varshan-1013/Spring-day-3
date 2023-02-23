package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empServ;

	@GetMapping("/show")
	public List<Employee> showEmployees() {
		return empServ.getEmployees();
	}

	@GetMapping("/view/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return empServ.getEmployee(id);
	}

	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee obj) {
		return empServ.addEmployee(obj);
	}
}
