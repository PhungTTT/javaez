package Ex5_0Restaurants;
public class Intersection {
	private int street;
	private int avenue;
	/**
	 * This is Constructor of class Intersection
	 * Example:
	 * 
	 * @param street
	 * @param avenue
	 */
	public Intersection(int street, int avenue) {
		super();
		this.street = street;
		this.avenue = avenue;
	}
	@Override
	public String toString() {
		return this.street +"-"+this.avenue;
	}
	
	
}
