package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empServ;

	public List<Employee> getEmployees() {
		List<Employee> arr = new ArrayList<>();
		arr = (List<Employee>) empServ.findAll();
		return arr;
	}

	public Optional<Employee> getEmployee(int id) {
		Optional<Employee> obj = empServ.findById(id);
		return obj;
	}

	public Employee addEmployee(Employee obj) {
		return empServ.save(obj);
	}
}
