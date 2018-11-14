package ua.skillsup.practice.bootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ua.skillsup.practice.bootdemo.entity.Student;
import ua.skillsup.practice.bootdemo.repository.StudentRepository;

@RestController
@RequestMapping("students")
public class StudentController {

	private final StudentRepository repository;

	@Autowired
	public StudentController(StudentRepository repository) {
		this.repository = repository;
	}

	@GetMapping(produces = {"application/json"})
	public Iterable<Student> getAll() {
		return repository.findAll();
	}

	@Transactional
	@PostMapping(consumes = {"application/json"})
	public void addStudent(@RequestBody Student student) {
		repository.save(student);
	}
}