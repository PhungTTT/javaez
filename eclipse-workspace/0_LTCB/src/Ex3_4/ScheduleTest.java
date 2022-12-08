package Ex3_4;
import junit.framework.*;
public class ScheduleTest extends TestCase{
	public void testConstructor() {
		/**
		 * Create ClockTime
		 */
		ClockTime T1 = new ClockTime(6,28);
		 ClockTime T2 = new ClockTime(13,18);
		 ClockTime T3 = new ClockTime(1,34);
		 ClockTime T4 = new ClockTime(2,53);
		/**
		 * Create Schedule
		 */
		 Schedule S1 = new Schedule(T1,T2);
		 Schedule S2 = new Schedule(T3, T4);
	}
	
	/**
	 * Test for getDestiation() 
	 */
	public void testGetDestiation() {
		ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
		ClockTime T3 = new ClockTime(1,34);
		ClockTime T4 = new ClockTime(2,53);
		 
		Schedule S1 = new Schedule(T1,T2);
		Schedule S2 = new Schedule(T3, T4);
		 
		assertEquals(S1.getDestiation(),T1);
		assertEquals(S2.getDestiation(),T3);
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
		 
		assertEquals(S1.howLong(),410);
		assertEquals(S2.howLong(),79);
		
	}
}
