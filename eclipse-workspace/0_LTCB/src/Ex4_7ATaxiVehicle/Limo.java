package Ex4_7ATaxiVehicle;

public class Limo extends ATaxiVehicle {
	private int minRenal;
	/**
	 * This is Constructor of Limo
	 * Example:
	 * 
	 * @param idNum
	 * @param pasengers
	 * @param pricePerMile
	 * @param minRenal
	 */
	public Limo(int idNum, int pasengers, int pricePerMile, int minRenal) {
		super(idNum, pasengers, pricePerMile);
		this.minRenal = minRenal;
	}
	/**
	 * which computes the fare for a vehicle, passengers in a limo must pay 
	 * at least the minimum rental fee, otherwise they pay by the mile
	 * Example:
	 * 
	 * @return fare (double) 
	 */
	public double fare(double numberOfMiles) {
		double f = this.pricePerMile * numberOfMiles;
		if (f < this.minRenal) return this.minRenal;
		else return f;
	}

}
