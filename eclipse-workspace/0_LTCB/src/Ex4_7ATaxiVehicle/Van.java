package Ex4_7ATaxiVehicle;

public class Van extends ATaxiVehicle {
	private boolean access;
	/**
	 * This is Constructor of Van
	 * Example:
	 * 
	 * @param idNum
	 * @param pasengers
	 * @param pricePerMile
	 * @param access
	 */
	public Van(int idNum, int pasengers, int pricePerMile, boolean access) {
		super(idNum, pasengers, pricePerMile);
		this.access = access;
	}
	/**
	 * which computes the fare for a vehicle, passengers in a van pay $1.00 
	 * extra for each passenger
	 * Example:
	 * 
	 * @return fare (double)
	 */
	public double fare(double numberOfMiles) {
		return this.pricePerMile * numberOfMiles + 1* this.pasengers;
	}

}
