package Ex4_2and4_5Record;

public class GIF extends AGallery {
	private double height; //pixels
	private double width;  //pixels
	String quality;
	/**
	 * This is Constructor of GIF
	 * Example:
	 * GIF g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
	 * 
	 * @param name
	 * @param size
	 * @param height
	 * @param width
	 * @param quality
	 */
	public GIF(String name, double size, double height, double width, String quality) {
		super(name, size);
		this.height = height;
		this.width = width;
		this.quality = quality;
	}
	
}
