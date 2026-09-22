package com.ann3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
      ApplicationContext context= new AnnotationConfigApplicationContext("com.ann3");
      Employee bean= context.getBean("employee",Employee.class);
      System.out.println(bean);
	}

}
