package businessLayer.firstProgram.DependencyInjection;

public class University {
	private String universityName;
	private int universityCode;
	private String universityAddress;
	private Student student;
	
	public University() {
		super();
	}
	
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public int getUniversityCode() {
		return universityCode;
	}
	public void setUniversityCode(int universityCode) {
		this.universityCode = universityCode;
	}
	public String getUniversityAddress() {
		return universityAddress;
	}
	public void setUniversityAddress(String universityAddress) {
		this.universityAddress = universityAddress;
	}
	
	public University(String universityName, int universityCode, String universityAddress, Student student) {
		super();
		this.universityName = universityName;
		this.universityCode = universityCode;
		this.universityAddress = universityAddress;
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "University [universityName=" + universityName + ", universityCode=" + universityCode
				+ ", universityAddress=" + universityAddress + ", student=" + student + "]";
	}
	
}
