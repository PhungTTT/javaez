package Ex4_4Shape;

import junit.framework.*;
public class SquareTest extends TestCase{
	public void testConstructor() {
		CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		Square s1 = new Square(p1,3);
		Square s2 = new Square(p2,5);

	}

}
