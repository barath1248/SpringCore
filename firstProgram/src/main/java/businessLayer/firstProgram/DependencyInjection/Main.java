package businessLayer.firstProgram.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("businessLayer/firstProgram/DependencyInjection/application-context.xml");
        NotificationService bean =context.getBean("NotificationService", NotificationService.class);
       
        System.out.println("--------------------");
        System.out.println("Services are :");
        
        bean.getNotificationTypeService().stream().forEach(System.out::println);
        
        System.out.println("--------------------");
        System.out.println("Regions are :");
        
        bean.getServiceRegions().stream().forEach(System.out::println);
        
        System.out.println("--------------------");
        System.out.println("service provider :");
        
        bean.getNotificationProvider().forEach((key,value)->System.out.println(key + "->" + value));
        
        System.out.println("--------------------");
        System.out.println("Basic configuration :");
        
        bean.getBasicConfProperties().forEach((key, value) ->System.out.println(key + "->" + value));
        
        
    }
}
