package Ex5_0Log;

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
	 * This is method miles() of class ConsLog
	 */
	public double miles() {
		return this.first.getDistance() +
             this.rest.miles();
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
	 * This is method getLogs(int month, int year) of class ConsLog
	 */
	public ILog getLogs(int month, int year) {
	      if (this.first.sameMonthInAYear(month, year)) 
	         return new ConsLog(this.first,
	                       this.rest.getLogs(month, year));
	      else
	    	  return this.rest.getLogs(month, year);
	   }
	/**
	 * This is method milesAMonth(int monthFind) of class ConsLog
	 */
	public double milesAMonth(int monthFind) {
		if(this.first.isMonth()==monthFind)
			return this.first.getDistance() +
		             this.rest.miles();
		return 0; 
	}
	/**
	 * This is method sortByDistance() of class ConsLog
	 */
	public ILog sortByDistance() {
	      return this.rest.sortByDistance()
	                 .insertInDistanceOrder(this.first);
	   }
	/**
	 * This is method insertInDistanceOrder(Entry e) of class ConsLog
	 */
		public ILog insertInDistanceOrder(Entry e) {
		      if (e.hasDistanceShorterThan(this.first))
		         return new ConsLog(e,this);
		      else
		    	  return new ConsLog(this.first,
		               this.rest.insertInDistanceOrder(e));
		  }
}
