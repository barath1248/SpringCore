package businessLayer.firstProgram.Annotation;

//import org.springframework.beans.factory.annotation.Required;

public class C {
	private A a;

//	@Required
	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "C [a=" + a + "]";
	}


}
