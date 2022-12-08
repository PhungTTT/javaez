package Ex4_2and4_5Record;

public class MP3 extends AGallery {
	private double time;
	/**
	 * This is Constructor of MP3
	 * Example:
	 * MP3 m1 = new MP3("stored in theme", 40960.0, 200.0);
	 * @param name
	 * @param size
	 * @param time
	 */
	public MP3(String name, double size, double time) {
		super(name, size);
		this.time = time;
	}
	
}
