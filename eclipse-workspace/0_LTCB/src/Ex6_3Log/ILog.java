package Ex6_3Log;

public interface ILog {
	/**
	 * So Km trong mot Thang
	 * Example:
	 * Date d1 = new Date(1,1,2022);
	  Date d2 = new Date(2,1,2022);
	  Date d3 = new Date(3,1,2022);
	  Date d4 = new Date(4,1,2022);
	  Date d5 = new Date(5,1,2022);
	  Date d6 = new Date(6,1,2022);
	  
	  Entry e1 = new Entry(d1,6.0,new Time(0,35),"Met");
	  Entry e2 = new Entry(d2,7.2,new Time(0,45),"BinhThuong");
	  Entry e3 = new Entry(d3,5.5,new Time(0,30),"BinhThuong");
	  Entry e4 = new Entry(d4,7.0,new Time(0,50),"Met");
	  Entry e5 = new Entry(d5,3.5,new Time(0,25),"BinhThuong");
	  Entry e6 = new Entry(d6,8.0,new Time(0,5),"Met");
	  
	  ILog I1 = new ConsLog(e1,new MTLog());
	  ILog I2 = new ConsLog(e2,I1);
	  ILog I3 = new ConsLog(e3,I2);
	  ILog I4 = new ConsLog(e4,I3);
	  ILog I5 = new ConsLog(e5,I4);
	  ILog I6 = new ConsLog(e6,I5);
	  
	  assertEquals(I6.milesAMonth(1),37.2);
	 * @param monthFind
	 * @return
	 */
	public double milesAMonth(int monthFind, int yearFind);
	/**
	 * Quang duong toi da dat duoc
	 * Example:
	 * Date d1 = new Date(1,1,2022);
	  Date d2 = new Date(2,1,2022);
	  Date d3 = new Date(3,1,2022);
	  Date d4 = new Date(4,1,2022);
	  Date d5 = new Date(5,1,2022);
	  Date d6 = new Date(6,1,2022);
	  
	  Entry e1 = new Entry(d1,6.0,new Time(0,35),"Met");
	  Entry e2 = new Entry(d2,7.2,new Time(0,45),"BinhThuong");
	  Entry e3 = new Entry(d3,5.5,new Time(0,30),"BinhThuong");
	  Entry e4 = new Entry(d4,7.0,new Time(0,50),"Met");
	  Entry e5 = new Entry(d5,3.5,new Time(0,25),"BinhThuong");
	  Entry e6 = new Entry(d6,8.0,new Time(0,5),"Met");
	  
	  ILog I1 = new ConsLog(e1,new MTLog());
	  ILog I2 = new ConsLog(e2,I1);
	  ILog I3 = new ConsLog(e3,I2);
	  ILog I4 = new ConsLog(e4,I3);
	  ILog I5 = new ConsLog(e5,I4);
	  ILog I6 = new ConsLog(e6,I5);
	  
	  assertEquals(I6.maxDistance(),8.0);
	 * @return double
	 */
	public double maxDistance();

	
}
