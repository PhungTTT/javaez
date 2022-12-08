package Ex6_3Log;

public class Entry {
	private Date date;
	private double distance;//Km
	private Time duration;//Hour,Minute
	private String comment;//Met, BinhThuong
	/**
	 * This is Constructor of class Entry
	 * Example:
	 * Date d1 = new Date(31,12,2021);
	 * Date d2 = new Date(1,1,2022);
	 * Date d3 = new Date(2,1,2022);
	 * Date d4 = new Date(3,1,2022);
	 * Date d5 = new Date(4,1,2022);
	 * Date d6 = new Date(5,1,2022);
	 * Date d7 = new Date(6,1,2022);
	 * 
	 * Entry e1 = new Entry(d1,5.5,new Time(0,30),"BinhThuong");
	 * Entry e2 = new Entry(d2,6.0,new Time(0,30),"Met");
	 * Entry e3 = new Entry(d3,7.2,new Time(0,30),"BinhThuong");
	 * Entry e4 = new Entry(d4,5.5,new Time(0,30),"BinhThuong");
	 * Entry e5 = new Entry(d5,7.0,new Time(0,30),"Met");
	 * Entry e6 = new Entry(d6,3.5,new Time(0,30),"BinhThuong");
	 * Entry e7 = new Entry(d7,8.0,new Time(0,30),"Met");
	 * @param date
	 * @param distance
	 * @param duration
	 * @param comment
	 */
	public Entry(Date date, double distance, Time duration, String comment) {
		super();
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
		@Override
			//toString
			public String toString() {
				return "DATE:" + this.date+ "\t"+ "DISTANCE:"+this.distance +"Km"+"\t" +"DURATION:"+
						this.duration+"\t"+"COMMENT:"+this.comment;
			}
			//equals
			public boolean equals(Object obj) {
				   if (obj == null || !(obj instanceof Entry))
				      return false;
				   else {
				      Entry that = (Entry) obj;
				      return this.date.equals(that.date) && 
				          this.distance == that.distance && 
				          this.duration == that.duration && 
				          this.comment.equals(that.comment);
				      }
				   }
	public double getDistance() {
		// TODO Auto-generated method stub
		return this.distance;
	}
	public boolean sameMonthAndYear(int month2, int year2) {
		return this.date.sameMonthAndYear(month2, year2);
	}
}
