package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;

@Component
public class JDBCCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CoursejdbcRespository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Learn AWS Now", "Spring"));
		repository.insert(new Course(2, "Learn Azure Now", "Spring"));
		repository.insert(new Course(3, "Learn Devops Now", "Spring"));
		repository.delete(1);
	}

}
