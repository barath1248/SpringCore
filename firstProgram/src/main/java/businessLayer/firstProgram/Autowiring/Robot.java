package businessLayer.firstProgram.Autowiring;

public class Robot {
	Chip chip;

	public void setChip(Chip chip) {
		this.chip = chip;
	}
	
	public void display() {
	  System.out.println("Display-init method is executed!");
	}
	public void destory() {
		  System.out.println("Destoyed");
		}
	public String toString() {
		return "Robot [chip=" + chip + "]";
		}
}
