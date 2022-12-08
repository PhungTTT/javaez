package Cau2_model;

public abstract class Vehicle {
	protected String model;
	protected long madeYear;
	protected double price;
	protected Manufactor manufactor;
	public Vehicle(String model, long madeYear, double price, Manufactor manufactor) {
		super();
		this.model = model;
		this.madeYear = madeYear;
		this.price = price;
		this.manufactor = manufactor;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getMadeYear() {
		return madeYear;
	}

	public void setMadeYear(long madeYear) {
		this.madeYear = madeYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Manufactor getManufactor() {
		return manufactor;
	}

	public void setManufactor(Manufactor manufactor) {
		this.manufactor = manufactor;
	}

	/**
	 * promotionalPrice Method: Gia sau khi khuyen mai theo tung loai xe:
	 * Struck: KM giam 10%
	 * Bus: giam 1000$
	 * Car: co cai nit
	 * @return double
	 */
	public abstract double promotionalPrice();
	
}
