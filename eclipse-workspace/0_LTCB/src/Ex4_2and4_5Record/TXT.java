package Ex4_2and4_5Record;

public class TXT extends AGallery {
	private int line;
	/**
	 * This is Constructor of TXT
	 * Example:
	 * TXT t1 = new TXT("stored in welcome", 5.312, 830);
	 * @param name
	 * @param size
	 * @param line
	 */
	public TXT(String name, double size, int line) {
		super(name, size);
		this.line = line;
	}
	
}
