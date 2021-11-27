package com.example.payroll.configuration;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.payroll.repository.EmployeeRepository;
import com.example3.payroll.entity.Employee;

@Configuration
public class LoadDataBase {
	
	 private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);
	 
	 @Bean
	 public CommandLineRunner initDataBase(EmployeeRepository repository) {
		 return args -> {
			 log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
		      log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
		 };
	 }

}
