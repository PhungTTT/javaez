package Ex6_4Shape;

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
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Square))
			return false;
		else {
			Square that = (Square) obj;
			return this.loc.equals(that.loc)
					&& this.size == that.size;
		}
	}
	/**
	 * 
	 */
	public boolean contains(CartPt point) {
		   int x = this.loc.getX();
		   int y = this.loc.getY();
		   return this.between(point.getX(), x, x + this.size) 
		       && this.between(point.getY(), y, y + this.size);
		}

		//-----------------------------------------------------------

		private boolean between(int value, int low, int high) {
		   return (low <= value) && (value <= high);
		}
	/**
	 * 
	 */
	public double area() {
		// TODO Auto-generated method stub
		return this.size*this.size;
	}
	
}
