package Ex4_4Shape;

public class Square extends AShape {
	private CartPt loc;
	private int size;
	/**
	 * This is Constructor of Square
	 * Example:
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		
		Square s1 = new Square(p1,3);
		Square s2 = new Square(p2,5);

	 * @param loc
	 * @param size
	 */
	public Square(CartPt loc, int size) {
		super(loc);
		this.size = size;
	}
	/**
	 * This function is used to area() of Square
	 */
	public double area() {
		return this.size*this.size;
	}
	/**
	 * This function is used to contains(CartPt point) of Square
	 * Example:
	 * 
	 * @param point (CartPt)
	 * @return boolean
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
		 * This function is used to contains(CartPt point) of Square
		 * Example: 
		 * @return Rectangle 
		 */
	public Rectangle boundingBox() {
		return new Rectangle(this.loc, this.size, this.size);
		}
		/**
		 * 
		 */
		public double perimeter() {
			   return this.size * 4;
			}


}
