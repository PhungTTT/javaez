package Ex3_4;

public class Route {
	private String origin;
	private String destination;
	/**
	 * This is constructor of Route
	 * Example:
	 * 	Route R1 = new Route("Di An","Nha Trang");
	   	Route R2 = new Route("Hue","Dong Ha");
	 * @param origin
	 * @param destination
	 */
Route(String origin,String destination) {
	this.origin=origin;
	this.destination=destination;
}
	/**
	 * /**
	 * Does his destination station match the destination of the train trip?
	 *	Route R1 = new Route("Di An","Nha Trang");
		Route R2 = new Route("Hue","Dong Ha");
		   
		assertTrue(R1.matchDestination("Nha Trang");
		assertFalse(R1.mathchDestination("Dong Ha");
		assertTrue(R2.matchDestination("Dong Ha");
	 * @param destination
	 * @return boolean
	 */
	public boolean matchDestination(String destination) {
		// TODO Auto-generated method stub
		return this.destination.equals(destination);
	}
}
