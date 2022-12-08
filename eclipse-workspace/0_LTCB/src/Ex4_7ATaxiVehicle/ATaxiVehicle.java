package Ex4_7ATaxiVehicle;

public abstract class ATaxiVehicle {
	protected int idNum;
	protected int pasengers;
	protected int pricePerMile;
	/**
	 * This is Constructor of ATaxiVehicle
	 * Example:
	 * 
	 * @param idNum
	 * @param pasengers
	 * @param pricePerMile
	 */
	public ATaxiVehicle(int idNum, int pasengers, int pricePerMile) {
		super();
		this.idNum = idNum;
		this.pasengers = pasengers;
		this.pricePerMile = pricePerMile;
	}
	/**
	 * which computes the fare for a vehicle, based on the
		number of miles traveled, and using the following
		formulas for different vehicles
	 * Example:
	 * 
	 * @return fare (double)
	 */
	public abstract double fare(double numberOfMiles);
	/**
	 * which determines whether the fare for a given number
	    of miles is lower than some amount
	 * Example:
	 * 
	 * @param numberOfMiles
	 * @param amount
	 * @return lowerPrice (boolean)
	 */
	public boolean lowerPrice(double numberOfMiles, double amount) {
		return this.fare(numberOfMiles) < amount;
	}
	/**
	 * which determines whether the fare in one vehicle is lower than
	    the fare in another vehicle for the same number of miles.
	 * Example:
	 * 
	 * @param numberOfMiles
	 * @param that (ATaxiVahicel)
	 * @return  boolean
	 */
	public boolean cheaperThan(double numberOfMiles, ATaxiVehicle that) {
		return this.fare(numberOfMiles) < that.fare(numberOfMiles);
	}
}
