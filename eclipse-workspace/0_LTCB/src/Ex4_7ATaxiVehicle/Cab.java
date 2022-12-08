package Ex4_7ATaxiVehicle;

public class Cab extends ATaxiVehicle {
	/**
	 * This is Constructor of Cab
	 * Example:
	 * 
	 * @param idNum
	 * @param passengers
	 * @param pricePerMile
	 */
	public Cab(int idNum, int passengers, int pricePerMile) {
		super(idNum,passengers, pricePerMile);
	}
	/**
	 * which computes the fare for a vehicle,passengers in a cab just pay flat fee per mile
	 * Example:
	 * 
	 * @return fare (double) 
	 */
	public double fare(double numberOfMiles) {
		return this.pricePerMile * numberOfMiles;
	}
	/**
	 * 
	 */
	
}
