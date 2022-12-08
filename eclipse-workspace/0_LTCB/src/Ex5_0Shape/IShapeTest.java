package Ex5_0Shape;

import junit.framework.TestCase;

public class IShapeTest extends TestCase {
	public void testConstructor() {
		 IShape d1 = new Dot(new CartPt(3,4));
		  
		 IShape c1 = new Circle(new CartPt(3,4),2);
  
		 IShape s1 = new Square(new CartPt(3,4),6);
		  
		 IShape r1 = new Rectangle(new CartPt(3,4),8,4);
		 System.out.println(d1);
		 System.out.println(c1);
		 System.out.println(s1);
		 System.out.println(r1);
		 
		 IShape o1 = new OtherShape(r1,d1);
		 IShape o2 = new OtherShape(r1,c1);
		 IShape o3 = new OtherShape(r1,s1);
		 System.out.println(o2);
		 System.out.println(o3);
		 
	}
}
