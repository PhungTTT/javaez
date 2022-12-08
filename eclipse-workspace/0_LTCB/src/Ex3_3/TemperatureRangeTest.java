package Ex3_3;
import junit.framework.TestCase;
public class TemperatureRangeTest extends TestCase {
	public void testConstructor() {
		new TemperatureRange(22,30);
		new TemperatureRange(23,31);
		new TemperatureRange(20,32);
	}
	/**
	 * Test for within(TemperatureRange that)
	 */
	public void testWithin() {
		TemperatureRange TemperatureRange1 = new TemperatureRange(22,30);
		TemperatureRange TemperatureRange2 = new TemperatureRange(23,31);
		TemperatureRange TemperatureRange3 = new TemperatureRange(20,32);
		assertFalse(TemperatureRange1.within(TemperatureRange2));
		assertFalse(TemperatureRange2.within(TemperatureRange1));
		assertTrue(TemperatureRange1.within(TemperatureRange3));
	}
	/**
	 * Test for  within2(TemperatureRange that)
	 */
	public void testWithin2() {
		TemperatureRange TemperatureRange1 = new TemperatureRange(22,30);
		TemperatureRange TemperatureRange2 = new TemperatureRange(23,31);
		TemperatureRange TemperatureRange3 = new TemperatureRange(20,32);
		assertFalse(TemperatureRange1.within(TemperatureRange2));
		assertFalse(TemperatureRange2.within(TemperatureRange1));
		assertTrue(TemperatureRange2.within(TemperatureRange3));
	}
}
