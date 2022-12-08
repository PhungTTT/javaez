
package Ex3_1;
import junit.framework.*;
public class HouseTest extends TestCase{
	public void testConstructor() {
		new House("Ranch",7,375000,new Address("23 Maple Street","Brookline"));
		new House("Colonial", 9, 450000,new Address( "5 Joye Road","Newton"));
		new House("Cape",6, 235000,new Address("83 Winslow Road","Waltham"));
	}
	/**
	 * Test for hasMoreRoom()
	 */
	public void testHasMoreRoom() {
		House House1 = new House("Ranch",7,375000,new Address("23 Maple Street","Brookline"));
		House House2 = new House("Colonial", 9, 450000,new Address( "5 Joye Road","Newton"));
		House House3 = new House("Cape",6, 235000,new Address("83 Winslow Road","Waltham"));
		assertFalse(House1.hasMoreRoom(House2));
		assertTrue(House1.hasMoreRoom(House3));
		assertTrue(House2.hasMoreRoom(House3));
	}
House House1 = new House("Ranch",7,375000,new Address("23 Maple Street","Brookline"));
House House2 = new House("Colonial", 9, 450000,new Address( "5 Joye Road","Newton"));
House House3 = new House("Cape",6, 235000,new Address("83 Winslow Road","Waltham"));
	/**
	 * Test inThisCity()
	 */

	public void testInThisCity() {
	    assertTrue(House1.inThisCity("Brookline"));
	    assertFalse(House1.inThisCity("Newton"));
	    assertFalse(House2.inThisCity("Waltham"));
	}   
	
	/*
	 * Test for sameCity()
	 */
	public void testInBrookline() {
		assertFalse(House1.sameCity(House2));
		assertTrue(House1.sameCity(new House("Colonial", 9, 450000,new Address("24 Maple Street","Brookline"))));
		assertFalse(House2.sameCity(House3));
	}

	
}
