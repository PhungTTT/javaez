package Ex2_6;

	public class Quadratic {
		double a;
		double b;
		double c;
	public Quadratic(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**Tinh delta
	 * @return double
	 * Ex: new Quadratic(1,2,4).computeDelta(),-12;
	 */
	double computeDelta() {
		return this.b * this.b - 4 * this.a * this.c;
	}	
	/**Ket Qua cua PT bac 2
	 * @return String
	 * Ex: new Quadratic(1,2,4).whatKind(),"none";
	 */
	String whatKind() {
		double delta = this.computeDelta();
		if (this.a == 0) return "degenerate";
		if (delta < 0) return "none";
		if (delta == 0) return "one solution";
		return "two solution";
	}	
}
