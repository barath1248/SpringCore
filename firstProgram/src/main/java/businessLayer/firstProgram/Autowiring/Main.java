package businessLayer.firstProgram.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("businessLayer/firstProgram/Autowiring/application-context.xml");
    Robot bean=context.getBean("Robot", Robot.class);
    System.out.println(bean);
}
}
