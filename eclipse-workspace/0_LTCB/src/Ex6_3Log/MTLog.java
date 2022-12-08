package Ex6_3Log;

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
	/**
	 * This is method milesAMonth(int monthFind) of class MTLog
	 */
	public double milesAMonth(int monthFind, int yearFind) {
		return 0;
	}
	/**
	 * This is method maxDistance() of class MTLog
	 */
	public double maxDistance() {
		return 0;
	}
}
