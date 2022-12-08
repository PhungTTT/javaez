package Thi2022_Employee;

public class Driver extends AEmployee {
	private ListVehicle listVehicle;
	/**
	 * This is Constructor of Driver
	 * @param eid
	 * @param name
	 * @param birthday
	 * @param salaryRate
	 * @param listVehicle
	 */
	public Driver(int eid, String name, Date birthday, double salaryRate, ListVehicle listVehicle) {
		super(eid, name, birthday, salaryRate);
		this.listVehicle = listVehicle;
	}
	@Override
	public String toString() {
		return "Driver: "  + eid + ", " + name + ", " + birthday
				+ ", " + salaryRate  + ", Vehicle: "+ listVehicle;
	}
	/**
	 * salary Method: tinh luong:LCB*salaryRate
	 * biet: LCB Driver 900.000
	 */
	@Override
	public double salary() {
		return 900000*this.salaryRate;
	}
	/**
	 * checkDriver:
	 * 
	 */
	@Override
	public boolean checkDriver(int iid) {
		return this.listVehicle.checkContainVehicle(iid);
	}
	public void sortByVehicle(){
		this.listVehicle = this.listVehicle.sortByVehicle();
	}
	
	
}
