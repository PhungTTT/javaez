package Ex4_4Shape;
import junit.framework.*;
public class CircleTest extends TestCase{
	/**
	 * Test for Constructor of Circle
	 */
	public void testConstructor() {
		CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		Circle c1 = new Circle(p1,3);
		Circle c2 = new Circle(p2,5);
	}
}
