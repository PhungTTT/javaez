package Ex5_0Shape;

public class CartPt {
	private int x;
	private int y;
	/**
	 * This is Constructor of class CartPt
	 * Example:
	 * new CartPt(5,3);
	 * new CartPt(3,4);
	 * @param x
	 * @param y
	 */
	public CartPt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
		//@Override
	public String toString() {

		return "(" + this.x + "," + this.y + ")";
		}	
}
