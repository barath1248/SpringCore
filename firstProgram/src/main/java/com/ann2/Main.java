package com.ann2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/ann2/application-context.xml");
	Hostel bean=context.getBean("Hostel",Hostel.class);
	System.out.println(bean);
}
}
