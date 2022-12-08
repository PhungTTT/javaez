package Ex3_4;


public class TrainTrip {
	private Schedule schedule;
	private Route route;
	private boolean local;
	/**
	 * This is constructor of TrainTrip
	 * Example:
		ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
		ClockTime T3 = new ClockTime(1,34);
		ClockTime T4 = new ClockTime(2,53);
		 
		Schedule S1 = new Schedule(T1,T2);
		Schedule S2 = new Schedule(T3, T4);
		 
		Route R1 = new Route("Di An","Nha Trang");
		Route R2 = new Route("Hue","Dong Ha");
		   
		TrainTrip TT1 = new TrainTrip(R1,S1,false);
		TrainTrip TT2 = new TraiTrip( R2,S2,true);
	 * @param route
	 * @param schedule
	 * @param local
	 */
	TrainTrip(Route route,Schedule schedule,boolean local) {
		this.route=route;
		this.schedule=schedule;
		this.local =local;
	}
	/**
	 * Does his destination station match the destination of the train trip?
	 * Example:
	 * 	ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
		ClockTime T3 = new ClockTime(1,34);
		ClockTime T4 = new ClockTime(2,53);
		 
		Schedule S1 = new Schedule(T1,T2);
		Schedule S2 = new Schedule(T3, T4);
		 
		Route R1 = new Route("Di An","Nha Trang");
		Route R2 = new Route("Hue","Dong Ha");
		   
		TrainTrip TT1 = new TrainTrip(R1,S1,false);
		TrainTrip TT2 = new TraiTrip( R2,S2,true);
		
		assertTrue(TT1.matchDestination("Nha Trang"));
		assertFalse(TT1.matchDestination("Dong Ha"));
		assertTrue(TT2.matchDestination("Dong Ha"));
	 */
	public boolean matchDestination(String destination) {
		return this.route.matchDestination(destination);
	}
	/**
	 * What time does the train start ?
	 * Example:
	 *  ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
		ClockTime T3 = new ClockTime(1,34);
		ClockTime T4 = new ClockTime(2,53);
		 
		Schedule S1 = new Schedule(T1,T2);
		Schedule S2 = new Schedule(T3, T4);
		 
		Route R1 = new Route("Di An","Nha Trang");
		Route R2 = new Route("Hue","Dong Ha");
		   
		TrainTrip TT1 = new TrainTrip(R1,S1,false);
		TrainTrip TT2 = new TraiTrip( R2,S2,true);
		
		assertEquals(TT1.startTime(),T1);
		assertEquals(TT2.startTime(),T2);
	 */
	public ClockTime startTime() {
		return this.schedule.getDestiation();
	}
	/*
	 * How long does the train trip take?
	 * Example:
	 * 	ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
		ClockTime T3 = new ClockTime(1,34);
		ClockTime T4 = new ClockTime(2,53);
		 
		Schedule S1 = new Schedule(T1,T2);
		Schedule S2 = new Schedule(T3, T4);
		 
		Route R1 = new Route("Di An","Nha Trang");
		Route R2 = new Route("Hue","Dong Ha");
		   
		TrainTrip TT1 = new TrainTrip(R1,S1,false);
		TrainTrip TT2 = new TrainTrip( R2,S2,true);
		
		assertEquals(TT1.howLong(),410);
		assertEquals(TT2.howLong(),79);
	 */
	public int howLong() {
		return this.schedule.howLong();
	}
	}
	