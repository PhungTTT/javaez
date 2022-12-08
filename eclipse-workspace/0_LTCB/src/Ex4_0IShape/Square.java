package Ex4_0IShape;

public class Square implements IShape {
	private CartPt loc;
	private int size;
	/**
	 * This is Constructor of Square
	 * Example:
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		Square s1 = new Square(p1,3);
		Square s2 = new Square(p2,5);

	 * @param loc
	 * @param size
	 */
	public Square(CartPt loc, int size) {
		this.loc = loc;
		this.size = size;
	}
	/**
	 * This function is used to area() of Square
	 */
	public double area() {
		return this.size*this.size;
	}
	/*
	 * This function is used to distanceToO() of Square
	 */
	public double distanceToO() {
		return this.loc.distanceToO();
	}
}
