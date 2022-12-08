package Ex3_4;

public class Schedule {
		private ClockTime departure;
		private ClockTime arrival;
	/**
	 * This is constructor of Schedule
	 * Example:
	 * 	ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
	 	ClockTime T3 = new ClockTime(1,34);
	 	ClockTime T4 = new ClockTime(2,53);
	 	
	 *	Schedule S1 = new Schedule(T1,T2);
	 	Schedule S2 = new Schedule(T3, T4);
	 * @param departure
	 * @param arrival
	 */
	Schedule(ClockTime departure,ClockTime arrival) {
		this.departure=departure;
		this.arrival=arrival;
	}
	/**
	 *Example:
	 *  ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
		ClockTime T3 = new ClockTime(1,34);
		ClockTime T4 = new ClockTime(2,53);
		 
		Schedule S1 = new Schedule(T1,T2);
		Schedule S2 = new Schedule(T3, T4);
		 
		assertEquals(S1.getDestiation(),T1);
		assertEquals(S2.getDestiation(),T2);
	 * @return ClockTime
	 */
	public ClockTime getDestiation() {
		// TODO Auto-generated method stub
		return this.departure;
	}
	/**
	 * How long does the train trip take?
	 * 	ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
		ClockTime T3 = new ClockTime(1,34);
		ClockTime T4 = new ClockTime(2,53);
		 
		Schedule S1 = new Schedule(T1,T2);
		Schedule S2 = new Schedule(T3, T4);
		 
		assertEquals(S1.howLong(),410);
		assertEquals(S2.howLong(),79);
	 * @return int
	 */
	public int howLong() {
		// TODO Auto-generated method stub
		return this.arrival.sub(this.departure);
	}
	
}
