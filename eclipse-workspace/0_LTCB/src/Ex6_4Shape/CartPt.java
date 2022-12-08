package Ex6_4Shape;
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
	/**
	 * 
	 * @param that
	 * @return
	 */
	public double  distanceTo(CartPt that) {
		double diffX = this.x - that.x;
		double diffY = this.y -that.y;
		return Math.sqrt( diffX*diffX + diffY*diffY);
	}
	/*
	 * Getters and Setters
	 */
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
