package Ex2_2;

public class Theater {
	double ticketPrice; //Gia ve:$
	double perfomanceCost;//Chi phi tra cho nha hat
	double serviceCharge;//Phi dich vu
	public Theater(double ticketPrice, double perfomanceCost, double serviceCharge) {
		this.ticketPrice = ticketPrice;
		this.perfomanceCost = perfomanceCost;
		this.serviceCharge = serviceCharge;
	}
	/**Xac dinh loi nhuan thu ve
	 * 
	 * @param numberOfAttendees
	 * @return double
	 * Examples: new Theater(5,20,0.5).totalProfit(1000),4480;
	 */
	double totalProfit(int numberOfAttendees) {
		return this.ticketPrice*numberOfAttendees-(this.perfomanceCost+numberOfAttendees*serviceCharge);
	}
}	