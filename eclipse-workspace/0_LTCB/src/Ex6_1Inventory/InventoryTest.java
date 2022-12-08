package Ex6_1Inventory;
import junit.framework.TestCase;
public class InventoryTest extends TestCase{
	/**
	 * Test Constructor of Inventory
	 */
	public void testConstructor () {
		System.out.print("\t"+"Danh sach Ban Dau: ");
		//Test for class Toy
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		//Test for class EmptyInventory
		Inventory empty = new EmptyInventory();
		System.out.println(empty);
		
		//Test for class ConsInventory
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		
		Inventory all = new ConsInventory(doll,
		i2);
		
		System.out.println("All:" + "\n" +all);
	}
	/**
	 * Test for Contains()
	 */
	public void testContains() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		
		Inventory all = new ConsInventory(doll,
		i2);
			
		assertFalse(empty.contains("dool"));
		assertTrue(i1.contains("gun"));
		assertTrue(i2.contains("robot"));
		assertTrue(i3.contains("robot"));
		assertTrue(all.contains("robot"));
		assertFalse(all.contains("toyOther"));	
	}
	/**
	 * Test for isBelow()
	 */
	public void testIsBelow() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		
		Inventory all = new ConsInventory(doll,i2);
		
		assertTrue(empty.isBelow(12.0));
		assertTrue(all.isBelow(25.0));
		assertTrue(i1.isBelow(15.5));
		assertTrue(i2.isBelow(23.0));
		assertFalse(i2.isBelow(22.0));
	}
	/**
	 * Test for howMany ()
	 */
	public void testHowMany() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		
		Inventory all = new ConsInventory(doll,i2);
		
		assertEquals(empty.howMany(),0);
		assertEquals(i1.howMany(),1);
		assertEquals(i2.howMany(),2);
		assertEquals(i3.howMany(),3);
	}
	/**
	 * Test for raisePrice()
	 */
	public void testRaisePrice() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll,i2);
		
		assertEquals(empty.raisePrice(0.2),new EmptyInventory());
		assertEquals(i1.raisePrice(0.2),new ConsInventory(new Toy("gun", 18.0, 4), empty));
		assertEquals(i2.raisePrice(0.2),new ConsInventory(new Toy("robot", 26.46, 3),
										new ConsInventory(new Toy("gun", 18.0, 4), empty)));
		assertEquals(all.raisePrice(0.2),new ConsInventory(new Toy("doll", 21.54, 5),
											new ConsInventory(new Toy("robot", 26.46, 3),
												new ConsInventory(new Toy("gun", 18.0, 4), new EmptyInventory()))));
		System.out.println("\t"+"Method raisePrice:");
		System.out.println("rate = 0.2" +"\n"+ all.raisePrice(0.2));
		// Test for raisePriceMutable()
		all.raisePriceMutable(0.25);
		System.out.println("\t"+"raisePriceMutable: \nrate = 0.25 \n"+all);
		
		}	
	/**
	 * Test for totalPrice()
	 */
	public void testTotalPrice() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll,i2);
		
		assertEquals(all.totalPrice(),55.0);
		
		System.out.println("\t TotalPrice: "+all.totalPrice());
	}
	/**
	 * Test for averagePrice()
	 */
	public void testAveragePrice() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll,i2);
		
		assertEquals(all.averagePrice(),18.3,0.1);
		
		System.out.println("\t AveragePrice: "+all.averagePrice());
	}
	/**
	 * Test for replaceName()
	 */
	public void testReplaceName() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll,i2);
		
		all.replaceName("robot","r2d2");
		System.out.println("\tReplaceName(robot,r2d2): \n"+all);
		assertEquals(all,i3);
	}
	/**
	 * Test for eliminate()
	 */
	public void testEliminate() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll,i2);
		
		assertEquals(empty.eliminate("gun"),new EmptyInventory());
		assertEquals(all.eliminate("gun"),new ConsInventory(doll,
										new ConsInventory(robot,new EmptyInventory())));
		
		System.out.println("\teliminate: \n"+all.eliminate("gun"));
	}
}
