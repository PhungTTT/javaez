package Ex4_4Shape;

public class Circle  extends AShape {
	private int radius;
	/**
	 * This is Constructor of Circle
	 * Example:
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);

		Circle c1 = new Circle(p1,3);
		Circle c2 = new Circle(p2,5);
	 * @param loc
	 * @param radius
	 */
	public Circle(CartPt loc, int radius) {
		super(loc);
		this.radius = radius;
	}
	/**
	 * This function is used to arer() of Circle
	 */
	public double area() {
		return Math.PI *this.radius*this.radius;
	}
	/**
	 * This function is used to contains(CartPt that) of Circle
	 * EXample:
	 * 
	 * @param that ( CartPt)
	 * @return boolean
	 */
	public boolean contains(CartPt that) {
		return this.loc.distanceTo(that) <= this.radius;
	}
	/**
	 * This function is used to boundingBox() of Circle
	 * Example:
	 * 
	 * @return Rectangle
	 */
	public Rectangle boundingBox() {
		return new Rectangle(this.loc.translate(-this.radius, -this.radius), this.radius * 2,this.radius * 2);
	}
	/**
	 * 
	 */
	public double perimeter() {
		   return this.radius * 2 * Math.PI;
		}

}
