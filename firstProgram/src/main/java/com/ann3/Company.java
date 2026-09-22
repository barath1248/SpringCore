package com.ann3;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource("classpath:com/ann3/application.properties")
public class Company {
	
 @Value("${companyName}")
 private String name;
 
 @Value("${companyAddress}")
 private String address;
}
