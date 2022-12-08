package Ex5_0Restaurants;

public class Restaurant {
	private String name;
	private String food;
	private String priceRange;
	private Intersection intersection;
	/**
	 * This is COnstructor of class Restaurant
	 * Example:
	 * 
	 * @param name
	 * @param food
	 * @param priceRange
	 * @param intersection
	 */
	public Restaurant(String name, String food, String priceRange, Intersection intersection) {
		super();
		this.name = name;
		this.food = food;
		this.priceRange = priceRange;
		this.intersection = intersection;
	}
	@Override
	public String toString() {
		return "NAME:"+this.name+"\t"+"FOOD:"+this.food+"\t"+"PRICERANGE:"+this.priceRange+"\t"+"INTERSECTION:"+this.intersection;
	}
	
	
}
