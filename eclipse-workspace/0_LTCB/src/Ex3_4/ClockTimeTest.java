package Ex3_4;

import junit.framework.TestCase;

public class ClockTimeTest extends TestCase {
	/**
	 * Test for constructor of ClockTime
	 */
	public void testClockTime() {
		ClockTime T1 = new ClockTime(6,28);
		 ClockTime T2 = new ClockTime(13,18);
		 ClockTime T3 = new ClockTime(1,34);
		 ClockTime T4 = new ClockTime(2,53);
	}
	/**
	 * Test for convertToMinutes()
	 */
	public void testConvertToMinutes() {
		ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
	 	ClockTime T3 = new ClockTime(1,34);
	 	ClockTime T4 = new ClockTime(2,53);
	 	
	 	assertEquals(T1.convertToMinutes(),388);
	 	assertEquals(T2.convertToMinutes(),798);
	 	assertEquals(T3.convertToMinutes(),94);
	 	assertEquals(T4.convertToMinutes(),173);
	}
	/**
	 * Test for sub() 
	 */
	public void testsub() {
		ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
	 	ClockTime T3 = new ClockTime(1,34);
	 	ClockTime T4 = new ClockTime(2,53);
	 	
	 	assertEquals(T2.sub(T1),410);
	 	assertEquals(T4.sub(T3),79);
	}
}
