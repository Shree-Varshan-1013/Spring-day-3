package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repo;
	
	public Student addStudent(Student obj) {
		return repo.save(obj);
	}
	
	public List<Student> getStudents(){
		List<Student> arr = new ArrayList<Student>();
		arr = repo.findAll();
		
		return arr;
	}
	
	public Student getById(Long id) {
		Student stud = repo.findById(id).get();
		return stud;
	}
}
