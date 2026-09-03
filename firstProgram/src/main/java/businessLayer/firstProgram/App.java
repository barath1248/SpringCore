package businessLayer.firstProgram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import businessLayer.firstProgram.DependencyInjection.University;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {

	    System.out.println("University class: " + University.class);
	    
	   

	    ApplicationContext context =
	        new ClassPathXmlApplicationContext(
	            "businessLayer/firstProgram/DependencyInjection/application-context.xml"
	        );

	    University bean = context.getBean("university", University.class);

	    System.out.println(bean);
	}
}
