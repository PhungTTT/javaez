package Ex4_4Shape;
import junit.framework.*;
public class DotTest extends TestCase{
	/*
	 * Test for Constructor of Dot
	 */
	public void testConstructor() {
		CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		Dot d1 = new Dot(p1);
		Dot d2 = new Dot(p2);
		
	}
}

