package Thi2022_Employee;

public class MTEmployee implements IEmployee{
	public MTEmployee() {}

	@Override
	public String toString() {
		return " ";
	}
	/**
	 * getBirthday Method: lay ngay sinh 1 nhan vien = null
	 */
	@Override
	public Date getBirthday(int eid) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * salary Method: tinh luong:LCB*salaryRate
	 * biet: LCB Staff 1.000.000, Driver 900.000
	 * Kq: null
	 * 
	 */
	@Override
	public double salary(int eid) {
		return 0;
	}
	/**
	 * howManyEmployee Method: Dem so nhan vien
	 */
	@Override
	public int howManyEmployee() {
		return 0;
	}
	/**
	 * getdrivers Method: Tim ds nhan vien co cung loai phuong tien theo iid
	 * @param iid
	 * @return
	 */
	@Override
	public IEmployee getDrivers(int iid) {
		return new MTEmployee();
	}
	/**
	 * sortByEmployee: sap xep danh sach cac phuong tien giao thong theo thu tu NSX tang dan
	 * 
	 */
	@Override
	public void sortByEmployee() {
	}
	
}
