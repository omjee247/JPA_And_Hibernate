package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JDBCCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CoursejdbcRespository respository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		respository.insert();
	}

}
