package ua.skillsup.practice.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.skillsup.practice.bootdemo.repository.StudentRepository;

@SpringBootApplication
public class BootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootDemoApplication.class, args);

		StudentRepository repository = context.getBean(StudentRepository.class);
		System.out.println(repository.findAll());
	}
}
