package Ex5_5Person;

import junit.framework.TestCase;

public class APersonTest extends TestCase {
	/**
	 * Test for Constructor 
	 */
	public void testPerson() {
		APerson p1 = new ConsPerson("Angela", 1936, new MTPerson(), new MTPerson());
		APerson p2 = new ConsPerson("Robert", 1935, new MTPerson(), new MTPerson());
		APerson p5 = new ConsPerson("Janet", 1958, p1, p2);
		
		APerson p3 = new ConsPerson("Bod", 1917, new MTPerson(), new MTPerson());
		APerson p4 = new ConsPerson("Annie", 1938, new MTPerson(),p3);
		APerson p6 = new ConsPerson("Paul", 1956, p4,new MTPerson());
		
		APerson p7 = new ConsPerson("Peter", 1980, p5,p6);
		
		System.out.print(p7);
		
	}
}
