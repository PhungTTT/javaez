package Ex4_4Shape;

public class CartPt {
	private int x;
	private int y;
	/**
	 * This is Constructor of CartPt
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
	 * @param x
	 * @param y
	 */
	public CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * What is the distance between a shape and the origin?
	 * Example:
	 * 	CartPt p1 = new CartPt(3,4);
		CartPt p2 = new CartPt(5,12);
		p1.distanceToO(),5.0
		p2.distanceToO(),13.0
	 *@return double
	 */
	public double distanceToO() {
		return Math.sqrt(this.x* this.x  + this.y *this.y);
	}
	/**
	 * 
	 */
	public double  distanceTo(CartPt that) {
		double diffX = this.x - that.x;
		double diffY = this.y -that.y;
		return Math.sqrt( diffX*diffX + diffY*diffY);
	}
	/**
	 * 
	 * @return
	 */
	public int getX() { return this.x;}
	public int getY() { return this.y;}
	/**
	 * 
	 * @param dX (int)
	 * @param dY (int)
	 * @return
	 */
	public CartPt translate(int dX, int dY) {
		   return new CartPt(this.x + dX, this.y + dY);
		}
		//
		public boolean equals(Object obj) {
		  if (null==obj || !(obj instanceof CartPt))
		    return false;
		  else {
		    CartPt that = (CartPt) obj;
		    return (this.x == that.x) && (this.y == that.y);
		  }
	}

}
