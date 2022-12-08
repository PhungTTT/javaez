package Ex5_0Shape;

public class Circle extends A4Shape{
	private int radius;
	/**
	 * This is COnstructor of Circle
	 * Example:
	 * Circle c1 = new Circle(new loc(3,4),2);
	 * Circle c2 = new Circle(new loc(4,3),4);
	 * @param loc
	 * @param radius
	 */
	public Circle(CartPt loc,int radius) {
		super(loc);
		this.radius=radius;
	}
	@Override
	public String toString() {
		return "Circle:"+super.toString()+","+this.radius;
	}
	
}
