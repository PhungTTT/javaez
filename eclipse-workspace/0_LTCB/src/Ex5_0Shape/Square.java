package Ex5_0Shape;

public class Square extends A4Shape{
	private int size;
	/**
	 * This is Constructor of Square
	 * Example:
	 * Square s1 = new Square(new loc(3,4),6);
	 * Square s2 = new Square(new loc(4,3),8);
	 * @param loc
	 * @param size
	 */
	public Square(CartPt loc, int size) {
		super(loc);
		this.size = size;
	}
	@Override
	public String toString() {
		return "Square:"+super.toString()+ ","+this.size;
	}
	

}
