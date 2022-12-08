package Ex3_4;
import junit.framework.*;
public class TrainTripTest extends TestCase{
	/**
	 * Test for constructor of TrainTrip
	 */
	public void testConstructor() {
		ClockTime T1 = new ClockTime(6,28);
		ClockTime T2 = new ClockTime(13,18);
		ClockTime T3 = new ClockTime(1,34);
		ClockTime T4 = new ClockTime(2,53);
			 
		Schedule S1 = new Schedule(T1,T2);
		Schedule S2 = new Schedule(T3, T4);
			 
		Route R1 = new Route("Di An","Nha Trang");
		Route R2 = new Route("Hue","Dong Ha");
			   
		TrainTrip TT1 = new TrainTrip(R1,S1,false);
		TrainTrip TT2 = new TrainTrip( R2,S2,true);
	}
	/**
	 * Test for matchDestination(String destination)
	 */
	public void testMatchDestination() {
		ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
		ClockTime T3 = new ClockTime(1,34);
		ClockTime T4 = new ClockTime(2,53);
		 
		Schedule S1 = new Schedule(T1,T2);
		Schedule S2 = new Schedule(T3, T4);
		 
		Route R1 = new Route("Di An","Nha Trang");
		Route R2 = new Route("Hue","Dong Ha");
		   
		TrainTrip TT1 = new TrainTrip(R1,S1,false);
		TrainTrip TT2 = new TrainTrip( R2,S2,true);
		
		assertTrue(TT1.matchDestination("Nha Trang"));
		assertFalse(TT1.matchDestination("Dong Ha"));
		assertTrue(TT2.matchDestination("Dong Ha"));	
	}
	   
	/**
	 * Test for startTime()
	 */
	public void testStartTime() {
		ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
		ClockTime T3 = new ClockTime(1,34);
		ClockTime T4 = new ClockTime(2,53);
		 
		
		Schedule S1 = new Schedule(T1,T2);
		Schedule S2 = new Schedule(T3, T4);
		 
		Route R1 = new Route("Di An","Nha Trang");
		Route R2 = new Route("Hue","Dong Ha");
		   
		TrainTrip TT1 = new TrainTrip(R1,S1,false);
		TrainTrip TT2 = new TrainTrip( R2,S2,true);

		assertEquals(TT1.startTime(),T1);
		assertEquals(TT2.startTime(),T3);
	}
	/**
	 * Test for howLong()
	 */
	public void testHowLong() {
		ClockTime T1 = new ClockTime(6,28);
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
	}
}
