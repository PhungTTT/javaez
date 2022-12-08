package Ex6_5Log;

public class Date {
	private int day, month, year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "," + month + "," + year;
	}
	
}
