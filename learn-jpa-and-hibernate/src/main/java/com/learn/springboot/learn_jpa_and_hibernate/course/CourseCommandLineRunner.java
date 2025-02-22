package com.learn.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;
import com.learn.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJPARepository;
import com.learn.springboot.learn_jpa_and_hibernate.course.springDataJPA.CourseSpringDataJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CoursejdbcRespository repository;
//	
	
//	@Autowired
//	private CourseJPARepository repository;
	
	@Autowired
	private CourseSpringDataJPARepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Learn AWS Now", "Spring"));
		repository.save(new Course(2, "Learn Azure Now", "Spring"));
		repository.save(new Course(3, "Learn Devops Now", "Spring"));
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
//		System.out.println(repository.queryById(2));
//		System.out.println(repository.queryById(3));
	}

}
