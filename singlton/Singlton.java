package singlton;

public class Singlton {
	public static Singlton instance;

	private Singlton() {

	}

	public synchronized static Singlton getInstance() {
		if (instance == null) {
			instance = new Singlton();
		}
		return instance;
	}

}
