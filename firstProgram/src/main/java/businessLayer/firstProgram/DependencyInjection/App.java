package businessLayer.firstProgram.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import businessLayer.firstProgram.DependencyInjection.*;

public class App {
	 public static void main( String[] args )
	    {
	        ApplicationContext context=new ClassPathXmlApplicationContext("businessLayer/firstProgram/DependencyInjection/application-context.xml");
	        University bean =context.getBean("university", University.class);
	        		System.out.println(bean);
	    }
}
