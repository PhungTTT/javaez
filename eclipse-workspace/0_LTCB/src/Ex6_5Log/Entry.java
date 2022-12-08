package Ex6_5Log;

public class Entry {
	private Date date;
	private double distance; //km
	private double minuteDuration;
	private String comment;
	/**
	 * This is COnstructor of Entry
	 * Example:
	 * Entry e1 = new Entry(new Date(20,2,2022),5.0,30.0,"Binh Thuong");
	 * Entry e2 = new Entry(new Date(21,2,2022),4.0,20.0,"Binh Thuong");
	 * Entry e3 = new Entry(new Date(22,2,2022),6.0,37.0,"Met");
	 * @param date,
	 * @param distace
	 * @param minuteDuration
	 * @param comment
	 */
	public Entry(Date date, double distance, double minuteDuration, String comment) {
		super();
		this.date = date;
		this.distance = distance;
		this.minuteDuration = minuteDuration;
		this.comment = comment;
	}
	/**
	 * Method toString()
	 */
	@Override
	public String toString() {
		return "Date:" + date + "; Distance=" + distance + "Km" +"; MinuteDuration=" + minuteDuration + "; comment="
				+ comment;
	}
	/**
	 * Tinh van toc (phut/met)
	 * @return double
	 */
	public double v() {
		return this.distance/ this.minuteDuration;
	}
}