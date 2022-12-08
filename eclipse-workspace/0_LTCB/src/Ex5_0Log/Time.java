package Ex5_0Log;

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
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	
	
	
}
