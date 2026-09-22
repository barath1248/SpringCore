package businessLayer.firstProgram.ReflectionAPI;

//import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private String stdName;
	private int id;
	private String stdAddress;

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
    
//	@Required
	public String getStdName() {
		return stdName;
	}

	public int getId() {
		return id;
	}
	
	public void sayHi() {
		System.out.println( "Hey! I am student");
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public Student() {
		super();
		System.out.println("Student obj is created");
	}
    
	public Student(String stdName, int id, String stdAddress) {
		super();
		this.stdName = stdName;
		this.id = id;
		this.stdAddress = stdAddress;
	}

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", id=" + id + ", stdAddress=" + stdAddress + "]";
	}

}
