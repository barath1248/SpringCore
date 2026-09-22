package com.ann3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
@PropertySource("classpath:com/ann3/application.properties")
public class Employee {
	
 @Value("${employeeName}")
 private String Name;
 @Value("${employeeId}")
 private String id;
 @Value("${employeeRole}")
 private String role;
@Autowired
 private Company company;
}
