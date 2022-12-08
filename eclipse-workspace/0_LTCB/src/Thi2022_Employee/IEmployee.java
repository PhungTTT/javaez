package Thi2022_Employee;

public interface IEmployee {
	/**
	 * getBirthday Method: lay ngay sinh 1 nhan vien
	 */
	public Date getBirthday(int eid);
	/**
	 * salary Method: tinh luong:LCB*salaryRate
	 * biet: LCB Staff 1.000.000, Driver 900.000
	 * 
	 */
	public double salary(int eid);
	/**
	 * howManyEmployee Method: Dem so nhan vien
	 */
	public int howManyEmployee();
	/**
	 * getdrivers Method: Tim ds nhan vien co cung loai phuong tien theo iid
	 * @param iid
	 * @return
	 */
	public IEmployee getDrivers(int iid);
	/**
	 * sortByEmployee: sap xep danh sach cac phuong tien giao thong theo thu tu NSX tang dan
	 * 
	 */
	public void sortByEmployee();
}
