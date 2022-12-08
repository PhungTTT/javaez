package Ex5_0Restaurants;

import junit.framework.TestCase;
public class IRestaurantsTest extends TestCase {
	public void testConstructor () {
		IRestaurants r1 = new ConsRestaurants(new Restaurant("Chez Nous","French", "exp. ", new Intersection(7, 65)),new MTRestaurants());
		IRestaurants r2 = new ConsRestaurants(new Restaurant("Das Bier","German", "cheap", new Intersection(2, 86)),r1);
		IRestaurants r3 = new ConsRestaurants(new Restaurant("Sun","Chinese", "cheap", new Intersection(10, 13)),r2);
		System.out.println(r3);
	}
}
