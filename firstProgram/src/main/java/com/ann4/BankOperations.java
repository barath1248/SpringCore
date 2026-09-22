package com.ann4;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankOperations {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext("com.ann4");
	BankApplication bean=context.getBean("canara",BankApplication.class);
	Server server=context.getBean("server",Server.class);
	server.startServer();
	while(true) {
		System.out.println("press 1 for deposit");
		System.out.println("press 2 for withdraw");
		System.out.println("press 3 for balance");
		System.out.println("press 4 for details");
		System.out.println("press 5 for Exit");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice) {
        case 1 :
        	    System.out.println("Enter amount:");
        	    int amount=sc.nextInt();
        	    bean.deposit(amount);
        	    break;
        case 2 :
        	    System.out.println("Enter amount:");
    	         amount=sc.nextInt();
    	        bean.withdraw(amount);
    	        break;
        case 3 :
        	    System.out.println(bean.showBalance());
    	        break;
        case 4 : System.out.println(bean.showDetails());
    	        break;
        case 5 :System.out.println("Thank you");
                System.exit(0);
    	        break;
    	default:System.out.println("Invalid choice");
    		    break;
        }    
	}
	
}
}
