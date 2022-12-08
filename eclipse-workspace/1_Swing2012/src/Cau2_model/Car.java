package Cau2_model;

public class Car extends Vehicle{
	private int noSeats;
	private double maxSpeed;
	private double fuelPer100km;
	/**
	 * This is Constructor of Car
	 * Ex:("Civic", 2010, 4,200, 13,28000,"Honda","Japan");
	 * @param model
	 * @param madeYear
	 * @param price
	 * @param manufactor
	 * @param noSeats
	 * @param maxSpeed
	 * @param fuelPer100km
	 */
	public Car(String model, long madeYear, double price, Manufactor manufactor, int noSeats, double maxSpeed,
			double fuelPer100km) {
		super(model, madeYear, price, manufactor);
		this.noSeats = noSeats;
		this.maxSpeed = maxSpeed;
		this.fuelPer100km = fuelPer100km;
	}
	
	@Override
	public String toString() {
		return "Car: " + noSeats + ", " + maxSpeed + ", " + fuelPer100km + ", "
				+ model + ", " + madeYear + ", " + price + ", " + manufactor;
	}

	/**
	 * promotionalPrice Method: Gia sau khi khuyen mai theo tung loai xe:
	 * Car: co cai nit
	 * @return double
	 */
	@Override
	public double promotionalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
