package Ex5_0Log;

public class MTLog implements ILog {
	public MTLog() {}
	@Override
		//toString
		public String toString() {
			return " ";
		}
		//equals
		public boolean equals(Object obj) {
			   if (obj == null || !(obj instanceof MTLog))
			      return false;
			   return true;
			}
	/*
	 * This is method miles() of class MTLog
	 */
	public double miles() {
		return 0.0;
	}
	
	/**
	 * This is method milesAMonth(int monthFind) of class MTLog
	 */
	public double milesAMonth(int monthFind) {
		return 0;
	}
	/**
	 * This is method maxDistance() of class MTLog
	 */
	public double maxDistance() {
		return 0;
	}
	/**
	 * This is method getLogs(int month, int year) of class MTLog
	 */
	public ILog getLogs(int month, int year) {
	      return new MTLog();
	   }
	/**
	 * This is method sortByDistance() of class MTLog
	 */
	public ILog sortByDistance() {
	    return new MTLog();
	  }
	/**
	 * This is method insertInDistanceOrder(Entry e) of class MTLog
	 */
		public ILog insertInDistanceOrder(Entry e) {
		      return new ConsLog(e, new MTLog());
		   }

}
