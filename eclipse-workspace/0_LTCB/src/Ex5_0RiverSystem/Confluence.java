package Ex5_0RiverSystem;

public class Confluence extends ARiver {
	private ARiver right;
	private ARiver left;
	/**
	 * This is Constructor of Confluence
	 * @param loc
	 * @param length
	 * @param right
	 * @param left
	 */
	public Confluence(Location loc, double length, ARiver right, ARiver left) {
		super(loc, length);
		this.right = right;
		this.left = left;
	}
	@Override
	public String toString() {
		return "Confluence:"+ super.toString() +" {"+ this.right +"  &  "+this.left +"}";
	}

	
}
