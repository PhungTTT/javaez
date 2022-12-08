package Thi2022_Employee;

public class Staff extends AEmployee {
	private String department;
	/**
	 * THis is Constructor of Staff
	 * Ex:
	 *  101, Le Nhan Minh, 2/8/1994, 1.2, Giao hang
 		102, Ai Nguyen, 1/1/1989, 1.5, Ke Toan
	 * @param eid
	 * @param name
	 * @param birthday
	 * @param salaryRate
	 * @param department
	 */
	public Staff(int eid, String name, Date birthday, double salaryRate, String department) {
		super(eid, name, birthday, salaryRate);
		this.department = department;
	}
	@Override
	public String toString() {
		return "Staff: "  + eid + ", " + name + ", " + birthday
				+ ", " + salaryRate + ", " + department ;
	}
	/**
	 * salary Method: tinh luong:LCB*salaryRate
	 * biet: LCB Staff 1.000.000
	 * 
	 */
	@Override
	public double salary() {
		return 1000000*this.salaryRate;
	}
	/**
	 * checkDriver Method: false
	 */
	@Override
	public boolean checkDriver(int iid) {
		return false;
	}
	@Override
	public void sortByVehicle() {
	}
	
	
		
	
	
}
