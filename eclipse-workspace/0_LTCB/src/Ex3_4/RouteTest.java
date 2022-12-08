package Ex3_4;

import junit.framework.TestCase;

public class RouteTest extends TestCase {
	/**
	 * Test for constructor of Route
	 */
	public void testconstructor() {
		Route R1 = new Route("Di An","Nha Trang");
		   Route R2 = new Route("Hue","Dong Ha");
	}
	/**
	 * Test for matchDestination()
	 */
	public void testMatchDestination() {
		Route R1 = new Route("Di An","Nha Trang");
		Route R2 = new Route("Hue","Dong Ha");
		   
		assertTrue(R1.matchDestination("Nha Trang"));
		assertFalse(R1.matchDestination("Dong Ha"));
		assertTrue(R2.matchDestination("Dong Ha"));
	}
}
