package com.springBoot.SpringBootDemo;

import com.springBoot.SpringBootDemo.Dao.StudentDAO;
import com.springBoot.SpringBootDemo.Entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDao)
	{
		return runner->{
			createStudent(studentDao);
		};
	}

	private void createStudent(StudentDAO studentDao) {

		System.out.println("creating new student ");

		Student temp = new Student("anand", "new", "annd@gmail");

		studentDao.save(temp);

		System.out.println("printing the student" + temp.getId());

	}
}
