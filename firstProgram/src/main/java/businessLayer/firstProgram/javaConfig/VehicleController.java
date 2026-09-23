package businessLayer.firstProgram.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class VehicleController {
   
	@Bean
	public Vehicle vehicle(){
		Vehicle vehicle=new Vehicle();
		return vehicle;
	}
}
