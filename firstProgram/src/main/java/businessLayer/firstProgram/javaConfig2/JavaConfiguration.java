package businessLayer.firstProgram.javaConfig2;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("businessLayer.firstProgram.javaConfig2")
public class JavaConfiguration {
  

	@Bean
	public Screen screen() {
		Screen screen = new Screen();
		return screen;
	}
	
}
