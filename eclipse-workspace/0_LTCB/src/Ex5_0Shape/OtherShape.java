package Ex5_0Shape;

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
	
}
