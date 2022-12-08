package Ex3_3;

public class WeatherRecord {
	Date date;
	String province;
	TemperatureRange today;
	TemperatureRange normal;
	TemperatureRange record;
	double precipitation; //mm
	WeatherRecord(Date date,String province,TemperatureRange today,TemperatureRange normal,TemperatureRange record,double precipitation) {
		this.date=date;
		this.province=province;
		this.today=today;
		this.normal=normal;
		this.record = record;
		this.precipitation=precipitation;
	}
	/**which determines whether today's high and low were within the normal range;
	 * 
	 * @return boolean
	 * Example:
	   WeatherRecord WeatherRecord4 = new WeatherRecord(new Date(4,11,2021),"Hue",new TemperatureRange(22,30),
				new TemperatureRange(23,31),new TemperatureRange(20,32),0);
	   WeatherRecord WeatherRecord22 = new WeatherRecord(new Date(22,11,2021),"Hue",new TemperatureRange(21,23),
				new TemperatureRange(20,24),new TemperatureRange(20,25),7);	
	   assertFalse(WeatherRecord4.withinRange());
	   assertTrue(WeatherRecord22.withinRange());
	 */
	boolean withinRange() {
		return this.today.within(this.normal);
	}
	/**which determines whether the precipitation is higher than some given value;
	 * @param double thatPrecipitation
	 * @return boolean
	 * Example: 
	   WeatherRecord WeatherRecord4 = new WeatherRecord(new Date(4,11,2021),"Hue",new TemperatureRange(22,30),
				new TemperatureRange(23,31),new TemperatureRange(20,32),0);
	   WeatherRecord WeatherRecord22 = new WeatherRecord(new Date(22,11,2021),"Hue",new TemperatureRange(21,23),
				new TemperatureRange(20,24),new TemperatureRange(20,25),7);	
		assertFalse(WeatherRecord4.rainyDay(5.0));
		assertTrue(WeatherRecord22.rainyDay(5.0));
	 */
	boolean rainyDay(double thatPrecipitation) {
		return this.precipitation >= thatPrecipitation;
	}
	/**which determines whether the temperature today broke either the high or the low record.
	 * 
	 * @return boolean
	 * Example:
	   WeatherRecord WeatherRecord4 = new WeatherRecord(new Date(4,11,2021),"Hue",new TemperatureRange(22,30),
				new TemperatureRange(23,31),new TemperatureRange(20,32),0);
	   WeatherRecord WeatherRecord22 = new WeatherRecord(new Date(22,11,2021),"Hue",new TemperatureRange(21,23),
				new TemperatureRange(20,24),new TemperatureRange(20,25),7);	
	   assertTrue(WeatherRecord4.recordDay());
	   assertTrue(WeatherRecord22.recordDay());
	   
	 */
	boolean recordDay() {
		return this.today.within2(this.record);
	}
}
