package businessLayer.firstProgram.javaConfig2;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	static {
		System.out.println("Movie class loaded");
	}

	public Movie() {
		System.out.println("Movie object created");
	}
}
