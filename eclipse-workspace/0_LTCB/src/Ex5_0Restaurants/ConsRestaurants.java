package Ex5_0Restaurants;

public class ConsRestaurants implements IRestaurants {
	private Restaurant first;
	private IRestaurants rest;
	/**
	 * This is COnstructor of class ConsRestaurants
	 * Example:
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsRestaurants(Restaurant first, IRestaurants rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return this.first + "\n" +this.rest;
	}
	
	
}
