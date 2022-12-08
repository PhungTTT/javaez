package Ex5_0Log;

public class Date {
	private int day;
	private int month;
	private int year;
	/**
	 * This is Constructor of class Date
	 * Example:
	 * Date d1 = new Date(31,12,2021);
	 * Date d2 = new Date(1,1,2022);
	 * Date d3 = new Date(2,1,2022);
	 * Date d4 = new Date(3,1,2022);
	 * Date d5 = new Date(4,1,2022);
	 * Date d6 = new Date(5,1,2022);
	 * Date d7 = new Date(6,1,2022);
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return this.day + "/"+ this.month+"/"+this.year;
	}
	public boolean equals(Object obj) {
		   if (obj == null || !(obj instanceof Date)) 
		      return false;
		   else {
		      Date that = (Date) obj;
		      return this.day == that.day && 
		             this.month == that.month && 
		             this.year == that.year;
		   }
	}
	public boolean sameMonthInAYear(int month2, int year2) {
		// TODO Auto-generated method stub
		return (this.month == month) && 
	             (this.year == year);

	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
