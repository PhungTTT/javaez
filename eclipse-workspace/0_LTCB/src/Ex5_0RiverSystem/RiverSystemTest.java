package Ex5_0RiverSystem;

import junit.framework.TestCase;

public class RiverSystemTest extends TestCase {
	public void testConstructor() {
	  Location l1 = new Location("s",1,1);
	  Location l2 = new Location("t",1,5);
	  Location l3 = new Location("u",3,7);
	  Location l4 = new Location("b",3,3);
	  Location l5 = new Location("a",5,5);
	  Location l6 = new Location("m",7,5);
	  
	  ARiver s1 = new Source(l1,120.0);
	  ARiver s2 = new Source(l2,50.0);
	  ARiver s3 = new Source(l3,100.0);
	  
	  ARiver b = new Confluence(l4,60.0,s1,s2);
	  ARiver a = new Confluence(l5,30.0,s2,s3);
	  
	  ARiver M = new Mouth(l6,0.0,a);
	
	  System.out.println(s1);
	  System.out.println(s2);
	  System.out.println(s3);
	  System.out.println("\t");
	  System.out.println(b);
	  System.out.println(a);
	  System.out.println("\t");
	  System.out.println(M);

	}
}
