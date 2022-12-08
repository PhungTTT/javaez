package Ex4_3Vehicles;

public abstract class AVehicle implements IVehicle {
	protected int seats;
	protected double price;
	/**
	 * This is Constructor of AVehicle
	 * Example:
	 * AVehicle b1 = new Buses(30,3000.0);
	 * AVehicle l1 = new Limos(7,750000.0);
	 * AVehicle s1 = new Subways(500, 15000.0);
	 * AVehicle c1= new Cars(4,200000.0);
	 * @param seats
	 * @param price
	 */
	public AVehicle(int seats, double price) {
		super();
		this.seats = seats;
		this.price = price;
	}
	
}
