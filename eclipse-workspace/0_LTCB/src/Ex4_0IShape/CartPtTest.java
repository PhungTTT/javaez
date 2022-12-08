package Ex4_0IShape;
import junit.framework.*;
public class CartPtTest extends TestCase{
	/**
	 * Test for Constructor of CartPt
	 */
	public void testConstructor() {
		CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
	}
	/**
	 * Test for distanceToO()
	 */
	public void testDistanceToO() {
		CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		assertEquals(p1.distanceToO(),5.0);
		assertEquals(p2.distanceToO(),13.0);
	}
}