package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CoursejdbcRespository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			
			"""
			insert into course(id, name, author) 
			values (?,?,?)
			""";
	private static String Delete_Query = 
			
			"""
			delete from course where id = ?; 
			""";
			
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor()) ;
	}
	public void delete(long Id) {
		springJdbcTemplate.update(Delete_Query, Id) ;
	}
		   
}
