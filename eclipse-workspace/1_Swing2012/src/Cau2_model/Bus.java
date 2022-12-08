package Cau2_model;

public class Bus extends Vehicle{
	private int noSeat;

	/**
	 * This is Constructor of Bus
	 * @param model
	 * @param madeYear
	 * @param price
	 * @param manufactor
	 * @param noSeat
	 * Ex:("Hiace", 2011,35000,"Toyota", "Japan", 12);
	 */
	public Bus(String model, long madeYear, double price, Manufactor manufactor, int noSeat) {
		super(model, madeYear, price, manufactor);
		this.noSeat = noSeat;
	}
	
	@Override
	public String toString() {
		return "Bus: " + noSeat + ", " + model + ", " + madeYear + ", " + price
				+ ", " + manufactor;
	}

	/**
	 * promotionalPrice Method: Gia sau khi khuyen mai theo tung loai xe:
	 * Bus: giam 1000$
	 * @return double
	 */
	@Override
	public double promotionalPrice() {
		// TODO Auto-generated method stub
		return 1000;
	}
	
	
}
