package com.learn.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;
import com.learn.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CoursejdbcRespository repository;
//	
	
	@Autowired
	private CourseJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Learn AWS Now", "Spring"));
		repository.insert(new Course(2, "Learn Azure Now", "Spring"));
		repository.insert(new Course(3, "Learn Devops Now", "Spring"));
		repository.deleteById(1);
		
		System.out.println(repository.queryById(2));
		System.out.println(repository.queryById(3));
	}

}
