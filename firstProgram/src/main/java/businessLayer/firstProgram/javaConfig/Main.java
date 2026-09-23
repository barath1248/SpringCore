package businessLayer.firstProgram.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context =
	        new AnnotationConfigApplicationContext(VehicleController.class);

	Vehicle v = context.getBean(Vehicle.class);
}
}
