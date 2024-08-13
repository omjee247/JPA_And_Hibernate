package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
			delete from course where id = ?
			""";
	private static String Select_Query = 
			
			"""
			select * from course where id = ?
			""";
			
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor()) ;
	}
	
	public void deleteById(long Id) {
		springJdbcTemplate.update(Delete_Query, Id) ;
	}
	
	public Course queryById(long Id) {
		return springJdbcTemplate.queryForObject(Select_Query,new BeanPropertyRowMapper<>(Course.class), Id);
	}
}
