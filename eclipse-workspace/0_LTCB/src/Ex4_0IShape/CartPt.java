package Ex4_0IShape;

public class CartPt {
	private int x;
	private int y;
	/**
	 * This is Constructor of CartPt
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
	 * @param x
	 * @param y
	 */
	public CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * What is the distance between a shape and the origin?
	 * Example:
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		p1.distanceToO(),5.0
		p2.distanceToO(),13.0
	 *@return double
	 */
	public double distanceToO() {
		return Math.sqrt(this.x* this.x  + this.y *this.y);
	}
}
