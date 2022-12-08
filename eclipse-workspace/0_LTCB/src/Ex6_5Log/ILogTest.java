package Ex6_5Log;

import junit.framework.TestCase;

public class ILogTest extends TestCase {
	public void testConstructor() {
		 //Test for class Entry
		 Entry e1 = new Entry(new Date(20,2,2022),5.0,30.0,"Binh Thuong");
		 Entry e2 = new Entry(new Date(21,2,2022),4.0,20.0,"Binh Thuong");
		 Entry e3 = new Entry(new Date(22,2,2022),6.0,37.0,"Met");
		 //Test for class Ilog
		 ILog l1 = new ConsLog(e1,new MTLog());
		 ILog l2 = new ConsLog(e2,l1);
		 ILog l3 = new ConsLog (e3,l2);
		 System.out.println("DS ban dau: ");
		 System.out.println(l3);
	 }
	 public void testBySortV() {
		//Test for class Entry
		 Entry e1 = new Entry(new Date(20,2,2022),5.0,30.0,"Binh Thuong");
		 Entry e2 = new Entry(new Date(21,2,2022),4.0,20.0,"Binh Thuong");
		 Entry e3 = new Entry(new Date(22,2,2022),6.0,37.0,"Met");
		 //Test for class Ilog
		 ILog l1 = new ConsLog(e1,new MTLog());
		 ILog l2 = new ConsLog(e2,l1);
		 ILog l3 = new ConsLog (e3,l2);
		 
		 System.out.println("V theo Ngay(phut/met): \n20: "+e1.v() + "\n21: "+ e2.v()+"\n22: "+e3.v()+"\n");
		 System.out.println("Sap xep theo Van toc:\n"+l3.sortByV());
	 }
}