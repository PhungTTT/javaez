package Ex4_4Shape;


public class Dot  extends AShape{
	/**
	 * This is Constructor of Dot
	 * Example:
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		Dot d1 = new Dot(p1);
		Dot d2 = new Dot(p2);
	 * @param loc (CartPt)
	 */
	public Dot(CartPt loc) {
		super(loc);
	}
	/**
	 * This function is used to area() of Dot
	 * @return double
	 */
	public double area() {
		return 0;
	}
	/**
	 * This function is used to contains(CartPt that) of Dot
	 * Example:
	 * 
	 * @param that (CartPt)
	 * @return boolean
	 */
	public boolean contains(CartPt that) {
		return this.loc.distanceTo(that) == 0.0;
	}
	/**
	 * This function is used to boundingBox() of Dot
	 * Example:
	 * 
	 * @return Rectangle
	 */
	public Rectangle boundingBox() {
		return new Rectangle(this.loc, 0, 0);
		}
	/*
	 * 
	 */
	public double perimeter() {
		return 1.0;
		}

}
