package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.stereotype.Repository;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

	@PersistenceContext // or @Autowired
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course queryById(long Id) {
		return entityManager.find(Course.class, Id);
	}
	
	public void deleteById(long Id) {
		Course course = entityManager.find(Course.class, Id);
		entityManager.remove(course);
	}
}
