package Ex5_0Shape;

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
	

}
