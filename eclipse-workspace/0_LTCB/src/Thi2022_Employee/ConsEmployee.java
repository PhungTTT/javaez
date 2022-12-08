package Thi2022_Employee;

public class ConsEmployee implements IEmployee{
	private AEmployee first;
	private IEmployee rest;
	/**
	 * This is Contructor of ConsEmployee
	 * 
	 * @param employee
	 * @param rest
	 */
	public ConsEmployee(AEmployee first, IEmployee rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return  first + "\n" + rest;
	}
	//getBirthday Method: lay ngay sinh 1 nhan vien
	@Override
	public Date getBirthday(int eid) {
		if(eid==this.first.getEid()) {
			return this.first.getBirthday();
			}
		else return this.rest.getBirthday(eid);
	}
	/**
	 * salary Method: tinh luong:LCB*salaryRate
	 * biet: LCB Staff 1.000.000, Driver 900.000
	 * 
	 */
	@Override
	public double salary(int eid) {
		if(eid==this.first.getEid()) {
			return this.first.salary();
			}
		else return this.rest.salary(eid);
	}
	/**
	 * howManyEmployee Method: Dem so nhan vien
	 */
	@Override
	public int howManyEmployee() {
		return 1 + this.rest.howManyEmployee();
	}
	/**
	 * getdrivers Method: Tim ds nhan vien co cung loai phuong tien theo iid
	 * @param iid
	 * @return
	 */
	@Override
	public IEmployee getDrivers(int iid) {
		if(this.first.checkDriver(iid)==false) {
			return this.rest.getDrivers(iid); 
		}else
			return new ConsEmployee(first, rest.getDrivers(iid));
	}
	/**
	 * sortByEmployee: sap xep danh sach cac phuong tien giao thong theo thu tu NSX tang dan
	 * 
	 */
	@Override
	public void sortByEmployee() {
		this.first.sortByVehicle();
		this.rest.sortByEmployee();
	}
	
	
}
