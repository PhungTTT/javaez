package Ex5_0Log;

import junit.framework.TestCase;
public class LogTest extends TestCase {
	/**
	 * Test for Constructor of class ILog
	 */
	public void testConstructor () {
		 // Test class Date
		  Date d1 = new Date(1,1,2022);
		  Date d2 = new Date(2,1,2022);
		  Date d3 = new Date(3,1,2022);
		  Date d4 = new Date(4,1,2022);
		  Date d5 = new Date(5,1,2022);
		  Date d6 = new Date(6,1,2022);
		  //Test class Entry
		  Entry e1 = new Entry(d1,6.0,new Time(0,35),"Met");
		  Entry e2 = new Entry(d2,7.2,new Time(0,45),"BinhThuong");
		  Entry e3 = new Entry(d3,5.5,new Time(0,30),"BinhThuong");
		  Entry e4 = new Entry(d4,7.0,new Time(0,50),"Met");
		  Entry e5 = new Entry(d5,3.5,new Time(0,25),"BinhThuong");
		  Entry e6 = new Entry(d6,8.0,new Time(0,5),"Met");
		  //Test class ILog
		  ILog I1 = new ConsLog(e1,new MTLog());
		  ILog I2 = new ConsLog(e2,I1);
		  ILog I3 = new ConsLog(e3,I2);
		  ILog I4 = new ConsLog(e4,I3);
		  ILog I5 = new ConsLog(e5,I4);
		  ILog I6 = new ConsLog(e6,I5);
		  
		  System.out.println(" List:\n"+I6);
	}
	/**
	 * Test for miles()
	 */
	public void testMiles() {
		  Date d1 = new Date(1,1,2022);
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
		  
		  assertEquals(I1.miles(),6.0);
		  assertEquals(I2.miles(),7.2+6);
		  assertEquals(I3.miles(),5.5+7.2+6);
		  assertEquals(I4.miles(),7.0+5.5+7.2+6);
		  assertEquals(I5.miles(),3.5+7.0+5.5+7.2+6);
		  assertEquals(I6.miles(),8.0+3.5+7.0+5.5+7.2+6);
		  
		  System.out.println("Miles: "+I6.miles()+"km");
	}
	/**
	 * Test for milesAMonth()
	 */
	public void testMilesAMonth() {
		 Date d1 = new Date(1,1,2022);
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
		  assertEquals(I6.milesAMonth(2),0.0);
		  System.out.println("milesAMonth(1):  " + I6.milesAMonth(1)+"Km");
		  System.out.println("milesAMonth(2):  " + I6.milesAMonth(2)+"Km");
	}
	/**
	 * Test for maxDistance()
	 */
	public void testMaxDistance() {
		 Date d1 = new Date(1,1,2022);
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
		  System.out.println("Max Distance: "+I6.maxDistance());
	}
	/*
	 * Test for getLogs()
	 */
	public void testGetLogs() {
		  Date d1 = new Date(31,12,2021);
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
		  
		  assertEquals(I6.getLogs(1, 2022),new ConsLog(e6,
				  							new ConsLog(e5,
				  									new ConsLog(e4,
				  											new ConsLog(e3,new ConsLog(e2,
				  																	new MTLog()))))));
		  System.out.println("GetLogs: \n"+I6.getLogs(1, 2022));
		  
	}
	/**
	 * Test for sortByDistance()
	 */
	public void testSortByDistance() {
		Date d1 = new Date(1,1,2022);
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
		  
		  assertEquals(I6.sortByDistance(),new ConsLog(e5,
												new ConsLog(e3,
												 new ConsLog(e1,
												  new ConsLog(e4,
												   new ConsLog(e2,
												    new ConsLog(e6,new MTLog())))))));
		  System.out.println("SortByDistance: \n"+I6.sortByDistance());
	}
	
}
