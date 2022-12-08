package Ex5_0Inventory;

public interface Inventory {
	/**
	 * X�?C �?�?NH XEM T�?N �?Ồ CHƠI CÓ XUẤT HIỆN TRONG HAY KHÔNG
	 * Example:
	 * 	Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll,i2);
			
		assertFalse(empty.contains("dool"));
		assertTrue(i1.contains("gun"));
		assertTrue(i2.contains("robot"));
		assertTrue(i3.contains("robot"));
		assertTrue(all.contains("robot"));
		assertFalse(all.contains("toyOther"));
	 * @param toyName
	 * @return T/F (boolean)
	 */
	public boolean contains(String toyName);
	
	/**
	 * KIỂM TRA XEM TẤT CẢ GI�? �?Ồ CHƠI TRONG KHO DƯ�?I 1 MỨC NÀO �?Ó
	 * Example:
	 * 	Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll,
		i2);
		
		assertTrue(empty.isBelow(12.0));
		assertTrue(all.isBelow(25.0));
		assertTrue(i1.isBelow(15.5));
		assertTrue(i2.isBelow(23.0));
		assertFalse(i2.isBelow(22.0));
	 * @param threshold
	 * @return T/F (boolean)
	 */
	public boolean isBelow(double threshold);
	
	/**
	 * CHO BIẾT S�? LƯỢNG MẶT HÀNG �?Ồ CHƠI TRONG KHO
	 * Example:
	 * 	Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		
		Inventory all = new ConsInventory(doll,
		i2);
		
		assertEquals(empty.howMany(),0);
		assertEquals(i1.howMany(),1);
		assertEquals(i2.howMany(),2);
		assertEquals(i3.howMany(),3);
	 * @return int
	 */
	public int howMany();
	
	/**
	 * TĂNG GI�? LEN MỘT TỶ LỆ NHẤT DINH
	 * Example:
	 * Toy doll = new Toy("doll", 17.95, 5);
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
	 * @param rate
	 * @return Inventory
	 */
	public Inventory raisePrice(double rate);
			/**
			 * TĂNG GI�? L�?N NHƯNG CHỈ CẬP NHẬT MỖI THUỘC T�?NH GI�?
			 */
			public void raisePriceMutable(double rate);
	/**
	 * TỔNG GI�? 
	 * Example:
	 *  Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll,i2);
		
		assertEquals(all.totalPrice(),55.0);
	 */
	public double totalPrice();
	/*
	 * GI�? TB
	 * Example:
	 * 	Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll,i2);
		
		assertEquals(all.averagePrice(),18.3,0.1);
	 */
	public double averagePrice();
	/**
	 * �?ỔI T�?N SẢN PHẨM
	 * Example:
	 * 	Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy ("gun", 15.0, 4);
		
		Inventory empty = new EmptyInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		Inventory all = new ConsInventory(doll,i2);
		
		all.replaceName("robot","r2d2");
		assertEquals(all,i3);
	 */
	public void replaceName(String findName, String replaceName);
	/**
	 * LOẠI B�? �?Ồ CHƠI CÓ T�?N TRÙNG V�?I toyOfname
	 * Example:
	 */
	public Inventory eliminate(String toyOfName);
}
