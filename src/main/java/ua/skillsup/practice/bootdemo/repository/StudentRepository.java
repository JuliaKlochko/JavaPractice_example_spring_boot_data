package ua.skillsup.practice.bootdemo.repository;

import org.springframework.data.repository.CrudRepository;
import ua.skillsup.practice.bootdemo.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
}