package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepository;

@RestController
public class StudentRestController {
	@Autowired
	private StudentRepository srepo;
	
	@PostMapping("/student")
	public String saveStudent(@RequestBody Student s) {
		srepo.save(s);
		return "Student saved...";
	}
	@GetMapping("/students")
	public Iterable<Student> getAllStudents(){
		return srepo.findAll();
	}

}
