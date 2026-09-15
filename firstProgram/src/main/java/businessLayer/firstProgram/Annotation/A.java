package businessLayer.firstProgram.Annotation;

import org.springframework.beans.factory.annotation.Required;

public class A {
	private B b;
	
	@Required
	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}

}
