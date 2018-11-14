package ua.skillsup.practice.bootdemo.repository;

import org.springframework.data.repository.CrudRepository;
import ua.skillsup.practice.bootdemo.entity.Student;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, Long> {

	Optional<Student> findByName(String name);
}