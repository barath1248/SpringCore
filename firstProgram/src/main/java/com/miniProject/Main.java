package com.miniProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(ShoppingConfiguration.class);
	ShoppingPayment bean=context.getBean("pay",ShoppingPayment.class);
	
	bean.payment();
}
}
