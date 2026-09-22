package businessLayer.firstProgram.Annotation;

//import org.springframework.beans.factory.annotation.Required;

public class B {
	private C c;
	
//	@Required
	public void setC(C c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "B [c=" + c + "]";
	}

}
