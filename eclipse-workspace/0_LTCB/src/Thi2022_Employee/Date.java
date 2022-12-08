package Thi2022_Employee;

public class Date {
	private int d,m,y;

	public Date(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Birthday:" + d + "/" + m + "/" + y;
	}
	
}
