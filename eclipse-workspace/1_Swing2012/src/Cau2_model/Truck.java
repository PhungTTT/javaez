package Cau2_model;

public class Truck extends Vehicle {
	private double loadingCap;

	/**
	 * THis is Constructor of Truck
	 * @param model
	 * @param madeYear
	 * @param price
	 * @param manufactor
	 * @param loadingCap
	 * Ex: (("MIGHTY", 2010,18000,"Huyndai", "Korea", 2.5); 
	 */
	public Truck(String model, long madeYear, double price, Manufactor manufactor, double loadingCap) {
		super(model, madeYear, price, manufactor);
		this.loadingCap = loadingCap;
	}
	
	@Override
	public String toString() {
		return "Truck: "+ loadingCap + ", " + model + ", " + madeYear + ", " + price
				+ ", " + manufactor;
	}

	/**
	 * promotionalPrice Method: Gia sau khi khuyen mai theo tung loai xe:
	 * Struck: KM giam 10%
	 * @return double
	 */
	@Override
	public double promotionalPrice() {
		// TODO Auto-generated method stub
		return this.price*0.1;
	}
	

}
