package Ex3_1;

public class House {
	String kind;
	int the_number_of_room; //rooms
	double price; //$
	Address address;
	House(String kind,int the_number_of_room,double price, Address address){
		this.kind=kind;
		this.the_number_of_room=the_number_of_room;
		this.price=price;
		this.address=address;
	}
	/**which determines whether one house has more rooms than some other house;
	 * @param House other
	 * @return boolean
	 * Example:
	 *  House House1 = new House("Ranch",7,375000,new Address("23 Maple Street","Brookline"));
		House House2 = new House("Colonial", 9, 450000,new Address( "5 Joye Road","Newton"));
		assertFalse(House1.hasMoreRoom(House2));
		assertTrue(House2.hasMoreRoom(House1));
	 */
	boolean hasMoreRoom(House other) {
		return (this.the_number_of_room > other.the_number_of_room);
		
	}
	/**which checks whether the advertised house is in some given city 
	 (assume we give the method a city name);
	 * @param String city
	 * @return boolean
	 * Example:
	 * House House1 = new House("Ranch",7,375000,new Address("23 Maple Street","Brookline"));
	   House House2 = new House("Colonial", 9, 450000,new Address( "5 Joye Road","Newton"));
	   House House3 = new House("Cape",6, 235000,new Address("83 Winslow Road","Waltham"));
	   assertTrue(House1.inThisCity("Brookline"));
	   assertFalse(House1.inThisCity("Newton"));
	 */
	boolean inThisCity(String city) {
		return this.address.city == city;
	}
	/**which checks whether the advertised house is in some given city 
	 (assume we give the method a city name);
	 * 
	 * @return boolean
	 * Example:
	 *  House House1 = new House("Ranch",7,375000,new Address("23 Maple Street","Brookline"));
	    House House2 = new House("Colonial", 9, 450000,new Address( "5 Joye Road","Newton"));
		House House3 = new House("Cape",6, 235000,new Address(("83 Winslow Road","Waltham"));
		assertFalse(House1.inBrookline(House2));
		assertTrue(House1.sameCity(new House("Colonial", 9, 450000,new Address("24 Maple Street","Brookline"))));
		assertFalse(House2.inBrookline(House3));
	 */
	boolean sameCity(House other) {
		return this.address.city == other.address.city;
	}
}
