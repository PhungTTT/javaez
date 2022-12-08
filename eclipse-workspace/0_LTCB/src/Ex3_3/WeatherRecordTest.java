package Ex3_3;
import junit.framework.*;
public class WeatherRecordTest extends TestCase {
	public void testConstructor() {
		new WeatherRecord(new Date(4,11,2021),"Hue",new TemperatureRange(22,30),
				new TemperatureRange(23,31),new TemperatureRange(20,32),0);
		new WeatherRecord(new Date(22,11,2021),"Hue",new TemperatureRange(21,23),
				new TemperatureRange(20,24),new TemperatureRange(20,25),7);
	}
	
 WeatherRecord WeatherRecord4 = new WeatherRecord(new Date(4,11,2021),"Hue",new TemperatureRange(22,30),
			new TemperatureRange(23,31),new TemperatureRange(20,32),0);
 WeatherRecord WeatherRecord22 = new WeatherRecord(new Date(22,11,2021),"Hue",new TemperatureRange(21,23),
			new TemperatureRange(20,24),new TemperatureRange(20,25),7);

	 /**
	 * Test for withinRange()
	 */
 public void testWithinRange() {
	 WeatherRecord WeatherRecord4 = new WeatherRecord(new Date(4,11,2021),"Hue",new TemperatureRange(22,30),
				new TemperatureRange(23,31),new TemperatureRange(20,32),0);
	   WeatherRecord WeatherRecord22 = new WeatherRecord(new Date(22,11,2021),"Hue",new TemperatureRange(21,23),
				new TemperatureRange(20,24),new TemperatureRange(20,25),7);	
	   assertFalse(WeatherRecord4.withinRange());
	   assertTrue(WeatherRecord22.withinRange());
 }
	/**
	 * Test for rainyDay(double thatPrecipitation)
	 */
	public void testRainyDay() {
		assertFalse(WeatherRecord4.rainyDay(5.0));
		assertTrue(WeatherRecord22.rainyDay(5.0));
	}
	/**
	 * Test for recordDay()
	 */
	public void testRecorDay() {
		   assertTrue(WeatherRecord4.recordDay());
		   assertTrue(WeatherRecord22.recordDay());
	}
}
