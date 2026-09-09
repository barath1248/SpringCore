package businessLayer.firstProgram.Autowiring;

public class Chip {
	String producer;
	String power;

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String toString() {
		return "Chip [producer=" + producer + ", power=" + power + "]";
	}
}
