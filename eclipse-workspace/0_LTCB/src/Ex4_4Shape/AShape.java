package Ex4_4Shape;

public abstract class AShape implements IShape {
	protected CartPt loc;
	/**
	 * This is Constructor of AShape
	 */

	public AShape(CartPt loc) {
		super();
		this.loc = loc;
	}
	/**
	 *  This is area() of Shape
	 * Example:
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		IShape d1 = new Dot(p1);
		IShape d2 = new Dot(p2);
		d1.area(),0.0
		d2.area(),0.0
		
		Square s1 = new Square(p1,3);
		Square s2 = new Square(p2,5);
		s1.area(),9.0
		s2.area(),25.0
		
		IShape c1 = new Circle(p1,4);
		IShape c2 = new Circle(p2,5);
		c1.area(),50.26,0.01
		c2.area(),78.5,0.01
		
		@return double
	 */
	public abstract double area();
	/**
	 * What is the distance between a shape and the origin?
	 * Example:
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		IShape d1 = new Dot(p1);
		IShape d2 = new Dot(p2);
		d1.distanceToO(),5.0
		d2.distanceToO(),13.0
		
		
		Square s1 = new Square(p1,3);
		Square s2 = new Square(p2,5);
		d1.distanceToO(),5.0
		d2.distanceToO(),13.0
		
		IShape c1 = new Circle(p1,4);
		IShape c2 = new Circle(p2,5);
		d1.distanceToO(),5.0
		d2.distanceToO(),13.0
		
		@return double
	**/
	public double distanceToO() {
		return this.loc.distanceToO();
	}
	/**
	 * How to determine whether some point is inside the shape
	 * Example:
	 * 
	 * @param taht (CartPt)
	 * @return boolean 
	 */
	public abstract boolean contains(CartPt that);
	/**
	 * 
	 * @return
	 */
	public abstract Rectangle boundingBox();
	/**
	 * The length of the perimeter for each shape in the hierarchy 
	 * Example:
	 * 
	 * 
	 */
	public abstract double perimeter();

}
