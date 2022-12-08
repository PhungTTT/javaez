package Ex4_0IShape;

public class Circle implements IShape {
	private CartPt loc;
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
		this.loc = loc;
		this.radius = radius;
	}
	/**
	 * This function is used to arer() of Circle
	 */
	public double area() {
		return Math.PI *this.radius*this.radius;
	}
	/**
	 * This function is used to distanceToO() of Circle
	 */
	public double distanceToO() {
		return this.loc.distanceToO();
	}

}
