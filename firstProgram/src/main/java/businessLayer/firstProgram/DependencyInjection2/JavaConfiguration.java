package businessLayer.firstProgram.DependencyInjection2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
 
	@Bean
	public Student student() {
		Student student=new Student();
		return student;
	}
	
	@Bean
	public University university() {
		University university =new University();
		return university;
	}
	
}
