package com.kaiburr.springmongodb.resource;

import java.util.List;

import java.util.Optional;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaiburr.springmongodb.exception.ResourceNotFoundException;
import com.kaiburr.springmongodb.model.Student;
import com.kaiburr.springmongodb.repository.StudentRepository;

@RestController
@RequestMapping("api/v1")
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	//Add student 
	@PostMapping("/addStudent")
		public String saveBook(@RequestBody Student student) {
			repository.save(student);
			return "Added book with id : " + student.getId();
		}
	
	//Get list of all students
	@GetMapping("/findAllStudents")
	public ResponseEntity<List<Student>> getStudents(){
		List<Student> list = repository.findAll();
		if(list.size() <= 0) {
			return 	ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	//Get Student By Id
	@GetMapping("/findAllStudent/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id){
		Student student = repository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Student don't exist with id : " + id));
		return ResponseEntity.ok(student);
	}
	
	//Delete a student using id
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "book deleted with id : " + id;
	}
	
	//Get list of student by name
	@GetMapping("/students/firstName")
	public ResponseEntity<List<Student>> getStudentByName(@RequestParam String firstName){
		List<Student> student = repository.findByFirstName(firstName);
		if(student.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(student));
		
	}
	
	//update Student
	@PutMapping("/student/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student studentDetails){
		Student student = repository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Student don't exit with id : " + id));
		
		student.setFirstName(studentDetails.getFirstName());
		student.setLastName(studentDetails.getLastName());
		student.setEmail(studentDetails.getLastName());
		student.setGender(studentDetails.getGender());
		student.setAddress(studentDetails.getAddress());
		student.setFavouriteSubjects(studentDetails.getFavouriteSubjects());
		student.setTotalSpentInBooks(studentDetails.getTotalSpentInBooks());
			
		
		
		Student updatedStudent = repository.save(student);
		return ResponseEntity.ok(updatedStudent);
	}
	
	
}
