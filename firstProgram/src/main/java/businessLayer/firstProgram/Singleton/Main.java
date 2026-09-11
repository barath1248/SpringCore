package businessLayer.firstProgram.Singleton;

public class Main {
	
		 public static void main(String[] args) {
			SingleTon A=SingleTon.getObject();
			SingleTon B=SingleTon.getObject();
			
			System.out.println(A.hashCode()+"  "+B.hashCode());
		}	
}
