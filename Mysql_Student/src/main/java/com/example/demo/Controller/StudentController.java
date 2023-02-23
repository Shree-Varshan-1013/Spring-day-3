package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studserv;
	
	@GetMapping("/show")
	public List<Student> showStudents(){
		return studserv.getStudents();
	}
	
	@GetMapping("/get/{id}")
	public Student getByIdStudent(@PathVariable Long id){
		return studserv.getById(id);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> getStudent(@RequestBody Student obj){
		studserv.addStudent(obj);
//		HttpHeader headers = new HttpHeaders();
		return new ResponseEntity<>("Value Added", HttpStatus.OK);
	}
	
	
}
