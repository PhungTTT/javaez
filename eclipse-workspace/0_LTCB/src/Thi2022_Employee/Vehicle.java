package Thi2022_Employee;

public class Vehicle {
	private int iid;
	private String vehicalname;
	private long yearManufacture;
	/**
	 * THis is COnstructor of Vehicle
	 * @param iid
	 * @param vehicalname
	 * @param yearManufacture
	 */
	public Vehicle(int iid, String vehicalname, long yearManufacture) {
		super();
		this.iid = iid;
		this.vehicalname = vehicalname;
		this.yearManufacture = yearManufacture;
	}
	@Override
	public String toString() {
		return "[" + iid + ", " + vehicalname + ", " + yearManufacture+"]";
	}
	/**
	 * getter and setter
	 */
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getVehicalname() {
		return vehicalname;
	}
	public void setVehicalname(String vehicalname) {
		this.vehicalname = vehicalname;
	}
	public long getYearManufacture() {
		return yearManufacture;
	}
	public void setYearManufacture(long yearManufacture) {
		this.yearManufacture = yearManufacture;
	}
	
	
}
