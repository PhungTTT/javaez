package Ex4_0IShape;


public class Dot implements IShape {
	private CartPt loc;
	/**
	 * This is Constructor of Dot
	 * Example:
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		Dot d1 = new Dot(p1);
		Dot d2 = new Dot(p2);
	 * @param p
	 */
	public Dot(CartPt p) {
		this.loc = p;
	}
	/**
	 * This function is used to area() of Dot
	 */
	public double area() {
		return 0;
	}
	/**
	 * This function is used to distanceToO() of Dot
	 */
	public double distanceToO() {
		return this.loc.distanceToO();
	}
}
