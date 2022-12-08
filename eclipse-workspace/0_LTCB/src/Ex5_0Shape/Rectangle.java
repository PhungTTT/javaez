package Ex5_0Shape;

public class Rectangle extends A4Shape{
	private int width;
	private int height;
	/**
	 * This is Constructor of Rectangle
	 * Example:
	 * Rectangle r1 = new Rectangle(new CartPt(3,4),8,4);
	 * Rectangle r2 = new Rectangle(new CartPt(4,3),9,6);
	 * @param loc
	 * @param width
	 * @param height
	 */
	public Rectangle(CartPt loc, int height, int width) {
		super(loc);
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle:"+super.toString()+","+this.height+ ","+this.width;
	}
	
	
}
