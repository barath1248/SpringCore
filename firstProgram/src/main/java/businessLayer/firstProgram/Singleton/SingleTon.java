package businessLayer.firstProgram.Singleton;

public class SingleTon {
	private static SingleTon ref = null;

	private SingleTon() {

	}

	public static SingleTon getObject() {
		if (ref == null)
			ref = new SingleTon();
		return ref;
	}
}

