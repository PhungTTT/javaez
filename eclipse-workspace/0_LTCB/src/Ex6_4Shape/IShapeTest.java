package Ex6_4Shape;

import junit.framework.TestCase;

public class IShapeTest extends TestCase {
	/**
	 * Test for COnstructor of IShape
	 */
	public void testConstructor() {
		 IShape d1 = new Dot(new CartPt(3,4));
		 IShape c1 = new Circle(new CartPt(3,4),2);
  		 IShape s1 = new Square(new CartPt(3,4),6);
		 IShape r1 = new Rectangle(new CartPt(5,5), 6, 4);
		 
		 IShape o1 = new OtherShape(c1, d1);
		 IShape o2 = new OtherShape(s1, c1);
		 IShape o3 = new OtherShape(r1, s1); 
	}
	/**
	 * Test for contains()
	 */
	public void testContains() {
		IShape d1 = new Dot(new CartPt(3,4));
		 IShape c1 = new Circle(new CartPt(3,4),2);
 		 IShape s1 = new Square(new CartPt(3,4),6);
		 IShape r1 = new Rectangle(new CartPt(5,5), 6, 4);
		 
		 IShape o1 = new OtherShape(c1, d1);
		 IShape o2 = new OtherShape(s1, c1);
		 IShape o3 = new OtherShape(r1, s1); 

		 assertTrue(d1.contains(new CartPt(3,4)));
		 assertFalse(c1.contains(new CartPt(2,1)));
		 assertFalse(s1.contains(new CartPt(2,1)));
		 assertTrue(r1.contains(new CartPt(5,6)));
		 assertTrue(o1.contains(new CartPt(3,5)));
		 assertFalse(o2.contains(new CartPt(2,1)));
	}
	/**
	 * Test for area()
	 */
	public void testArea() {
		 IShape d1 = new Dot(new CartPt(3,4));
		 IShape c1 = new Circle(new CartPt(3,4),2);
  		 IShape s1 = new Square(new CartPt(3,4),6);
		 IShape r1 = new Rectangle(new CartPt(5,5), 6, 4);
		 
		 IShape o1 = new OtherShape(c1, d1);
		 IShape o2 = new OtherShape(s1, c1);
		 IShape o3 = new OtherShape(r1, s1);
		 
		 assertEquals(d1.area(),0.0);
		 assertEquals(c1.area(),12.56,0.01);
		 assertEquals(s1.area(),36.0);
		 assertEquals(r1.area(),24.0);
		 assertEquals(o1.area(),12.56,0.01);
		 assertEquals(o2.area(),23.44,0.01);
		 assertEquals(o3.area(),12.0);
	}
}
