package Ex4_0IShape;
import junit.framework.*;
public class IShapeTest extends TestCase{
	/**
	 * Test for Constructor
	 */
	public void testConstructor() {
		// Test for class CartPt
		CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		// Test for class Dot
		IShape d1 = new Dot(p1);
		IShape d2 = new Dot(p2);
		
		// Test for class Square
		IShape s1 = new Square(p1,3);
		IShape s2 = new Square(p2,5);

		// Test for class Circle
		IShape c1 = new Circle(p1,4);
		IShape c2 = new Circle(p2,5);
	}
	/**
	 * Test for area()
	 */
	public void testArea() {
		CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		// Test for class Dot
		IShape d1 = new Dot(p1);
		IShape d2 = new Dot(p2);
		assertEquals(d1.area(),0.0);
		assertEquals(d2.area(),0.0);
		
		// Test for class Square
		Square s1 = new Square(p1,3);
		Square s2 = new Square(p2,5);
		assertEquals(s1.area(),9.0);
		assertEquals(s2.area(),25.0);
		
		// Test for class Circle
		IShape c1 = new Circle(p1,4);
		IShape c2 = new Circle(p2,5);
		assertEquals(c1.area(),50.26,0.01);
		assertEquals(c2.area(),78.54,0.01);
	}
	/**
	 * Test for distanceToO()
	 */
	public void testDistance() {
		CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		IShape d1 = new Dot(p1);
		IShape d2 = new Dot(p2);
		assertEquals(d1.distanceToO(),5.0);
		assertEquals(d2.distanceToO(),13.0);
		
		Square s1 = new Square(p1,3);
		Square s2 = new Square(p2,5);
		assertEquals(d1.distanceToO(),5.0);
		assertEquals(d2.distanceToO(),13.0);
		
		IShape c1 = new Circle(p1,4);
		IShape c2 = new Circle(p2,5);
		assertEquals(d1.distanceToO(),5.0);
		assertEquals(d2.distanceToO(),13.0);
	}
}
