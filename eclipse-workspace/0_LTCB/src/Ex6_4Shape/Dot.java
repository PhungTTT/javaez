package Ex6_4Shape;
public class Dot extends A4Shape {
	/**
	 * This is Constructor of Dot
	 * Example:
	 * Dot d1 = new Dot(new CartPt(3,4));
	 * Dot d2 = new Dot(new CartPt(4,3));
	 * @param loc
	 */
	public Dot(CartPt loc) {
		super(loc);
	}

	@Override
	public String toString() {
		return "Dot:" +super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Dot))
			return false;
		else {
			Dot that = (Dot) obj;
			return this.loc.equals(that.loc);
		}
	}
	public boolean contains(CartPt that) {
		return this.loc.distanceTo(that) == 0.0;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
