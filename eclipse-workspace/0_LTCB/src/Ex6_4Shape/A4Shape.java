package Ex6_4Shape;

public abstract class A4Shape implements IShape {
	protected CartPt loc;
	/**
	 * This is COnstructor of class A4Shape
	 * Example:
	 * A4Shape d1 = new Dot(new CartPt(3,4));
	 * A4Shape d2 = new Dot(new CartPt(4,3));
	 * 
	 * A4Shape c1 = new Circle(new CartPt(3,4),2);
	 * A4Shape c2 = new Circle(new CartPt(4,3),4);
	 * 
	 * A4Shape s1 = new Square(new CartPt(3,4),6);
	 * A4Shape s2 = new Square(new CartPt(4,3),8);
	 * 
	 * A4Shape r1 = new Rectangle(new CartPt(3,4),8,4);
	 * A4Shape r2 = new Rectangle(new CartPt(4,3),9,6);
	 * @param location
	 */
	public A4Shape(CartPt loc) {
		super();
		this.loc = loc;
	}
	@Override
	public String toString() {
		return this.loc.toString();
	}
	public abstract boolean contains(CartPt that);
	
	public abstract double area();	
}
