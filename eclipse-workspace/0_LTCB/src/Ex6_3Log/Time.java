package Ex6_3Log;

public class Time {
	private int h;
	private int m;
	/**
	 * This is Constructor of class Time
	 * @param h
	 * @param m
	 * @param s
	 */
	public Time(int h, int m) {
		super();
		this.h = h;
		this.m = m;
	}
	@Override
	public String toString() {
		return this.h + "h" +this.m+"m";
	}
	public boolean equals(Object obj) {
		   if (obj == null || !(obj instanceof Time)) 
		      return false;
		   else {
			   Time that = (Time) obj;
		      return this.h == that.h && 
		             this.m == that.m;
		   }
	}
}
