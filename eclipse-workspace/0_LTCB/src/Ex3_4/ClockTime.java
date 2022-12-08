package Ex3_4;

public class ClockTime {
	private int hour;//1-24h
	private int minute;//0-59m
	/**
	 * This is constructor of ClockTime
	 * Example:
	 * 	ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
	 	ClockTime T3 = new ClockTime(1,34);
	 	ClockTime T4 = new ClockTime(2,53);
	 * @param hour
	 * @param minute
	 */
	ClockTime(int hour, int minute) {
		this.hour=hour;
		this.minute=minute;
	}
	/*
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if((obj == null) || !(obj instanceof ClockTime))
			return false;
		else{
			ClockTime that = (ClockTime)obj;
			return this.hour == that.hour && this.minute == that.minute;
		}
	}
	/*
	 * This is function to convert ClockTime to minutes
	 * Example:
	 * 	ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
	 	ClockTime T3 = new ClockTime(1,34);
	 	ClockTime T4 = new ClockTime(2,53);
	 	
	 	assertEquals(T1.convertToMinutes(),388);
	 	assertEquals(T2.convertToMinutes(),798);
	 	assertEquals(T3.convertToMinutes(),94);
	 	assertEquals(T4.convertToMinutes(),173);
	 */
	public int convertToMinutes() {
		return this.hour*60 + this.minute;
	}
	/**
	 * This is sub of 2 Clock Time
	 * Example:
	 * 	ClockTime T1 = new ClockTime(6,28);
	 	ClockTime T2 = new ClockTime(13,18);
	 	ClockTime T3 = new ClockTime(1,34);
	 	ClockTime T4 = new ClockTime(2,53);
	 	
	 	assertEquals(T2.sub(T1),410);
	 	assertEquals(T4.sub(T3),79);
	 * @param other (ClockTime)
	 * @return int
	 */
	public int sub(ClockTime other) {
		// TODO Auto-generated method stub
		int result = this.convertToMinutes() - other.convertToMinutes();
		//Departure is in the next day
		if(result <= 0) {result = result + 1440;
		}
		return result;
	}
	
}
