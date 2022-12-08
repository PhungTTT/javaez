package Ex6_4Shape;

public class OtherShape implements IShape {
	private IShape top;
	private IShape bottom;
	/**
	 * This is Constructor of OtherShape
	 * Example:
	 * A4Shape d1 = new Dot(3,4);
	 * A4Shape c2 = new Circle(new CartPt(4,3),4);
	 * OtherShape o1 = new OtherShape(c2,d1);
	 * @param top
	 * @param bottom
	 */
	public OtherShape(IShape top, IShape bottom) {
		super();
		this.top = top;
		this.bottom = bottom;
	}
	@Override
	public String toString() {
		return "Other:  "+this.top+"\n"+"\t"+"&  "+ this.bottom;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof OtherShape))
			return false;
		else {
			OtherShape that = (OtherShape) obj;
			return this.top.equals(that.top)
					&& this.bottom == that.bottom;
		}
	}
	
	public boolean contains(CartPt that) {
		if((this.top.contains(that) && this.bottom.contains(that)==false)
				|| (this.top.contains(that)==false && this.bottom.contains(that)))
			return true;
		return false;
	}
	@Override
	public double area() {
		return Math.abs(this.top.area()-this.bottom.area());
	}
}
