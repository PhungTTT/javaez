package Thi2022_Employee;

public interface ListVehicle {
	/**
	 *checkContainVehicle Method: Kiem tra list Vehicle co chua phuong tien theo iid
	 * @param iid
	 * @return
	 */
	public boolean  checkContainVehicle(int iid);
	/**
	 * sortByVehicle Method: Sap xep danh sach phuong tien theo nam sx tang dan
	 * @return
	 */
	public ListVehicle insertVehicle(Vehicle v);
	public ListVehicle sortByVehicle();
}
