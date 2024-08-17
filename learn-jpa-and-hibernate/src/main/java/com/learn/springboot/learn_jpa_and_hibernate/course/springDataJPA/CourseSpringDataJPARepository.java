package com.learn.springboot.learn_jpa_and_hibernate.course.springDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long> {

	//char[] queryById(int i);

	//findByAuthor

}
