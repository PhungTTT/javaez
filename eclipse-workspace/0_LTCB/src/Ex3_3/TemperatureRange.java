package Ex3_3;

public class TemperatureRange {
	int low;
	int high;
	 TemperatureRange(int low,int high) {
			this.low=low;
			this.high=high;
		}
	 /**Determines high and low
	  * @param that
	  * @return boolean
	  * Example: 
	  * TemperatureRange TemperatureRange1 = new TemperatureRange(22,30);
		TemperatureRange TemperatureRange2 = new TemperatureRange(23,31);
		TemperatureRange TemperatureRange3 = new TemperatureRange(20,32);
		assertFalse(TemperatureRange1.within(TemperatureRange2));
		assertFalse(TemperatureRange2.within(TemperatureRange1));
		assertTrue(TemperatureRange1.within(TemperatureRange3));
	  */
	 boolean within(TemperatureRange that) {
		 return (this.low >= that.low) && (this.high <= that.high);
	 }
	 /**Determines high or low
	  * 
	  * @param that
	  * @return boolean
	  * Example:
	  * TemperatureRange TemperatureRange1 = new TemperatureRange(22,30);
		TemperatureRange TemperatureRange2 = new TemperatureRange(23,31);
		TemperatureRange TemperatureRange3 = new TemperatureRange(20,32);
		assertFalse(TemperatureRange1.within(TemperatureRange2));
		assertFalse(TemperatureRange2.within(TemperatureRange1));
		assertTrue(TemperatureRange2.within(TemperatureRange3));
	  */
	 boolean within2(TemperatureRange that) {
		 return (this.low >= that.low) || (this.high <= that.high);
	 }
}
