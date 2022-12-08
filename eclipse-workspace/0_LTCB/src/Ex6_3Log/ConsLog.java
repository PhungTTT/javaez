package Ex6_3Log;

public class ConsLog implements ILog {
	private Entry first;
	private ILog rest;
	/**
	 * This is Constructor of class ConsLog	
	 * @param first
	 * @param rest
	 */
	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	//toString
	public String toString() {
		return this.first.toString() + "\n" +this.rest.toString();
	}
	//equals
	public boolean equals(Object obj) {
	      if (obj == null || !(obj instanceof ConsLog))
	         return false;
	      else {
	         ConsLog that = (ConsLog) obj;
	         return this.first.equals(that.first) 
	               && this.rest.equals(that.rest);
	      }
   }
	/**
	 * This is method maxDistance() of class ConsLog
	 */
	public double maxDistance() {
		if(this.first.getDistance() > this.rest.maxDistance())
			return this.first.getDistance();
		else return this.rest.maxDistance();
	}
	/**
	 * This is method milesAMonth(int monthFind) of class ConsLog
	 */
	public double milesAMonth(int monthFind, int yearFind) {
		if(this.first.sameMonthAndYear(monthFind, yearFind))
			return this.first.getDistance() +
		             this.rest.milesAMonth(monthFind, yearFind);
		return 0; 
	}
}
