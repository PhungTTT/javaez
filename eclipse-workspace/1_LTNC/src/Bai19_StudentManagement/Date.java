package Bai19_StudentManagement;

public class Date {
	int d,m,y;

	public Date(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}

	@Override
	public String toString() {
		return  d + "/" + m + "/" + y;
	}
	
}
