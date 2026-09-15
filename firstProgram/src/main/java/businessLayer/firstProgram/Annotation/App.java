package businessLayer.firstProgram.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"businessLayer/firstProgram/Annotation/application-context.xml");
        
		 A a = context.getBean("A", A.class);

	        System.out.println(a);

	}
}
