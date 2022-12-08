package Thi2022_Employee;

public class MTVehicle implements ListVehicle  {
	public  MTVehicle() {}

	@Override
	public String toString() {
		return "";
	}
	/**
	 *checkContainVehicle(int iid): Kiem tra list Vehicle co chua phuong tien theo iid
	 * @param iid
	 * @return false
	 */
	@Override
	public boolean checkContainVehicle(int iid) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * sortByVehicle Method: Sap xep danh sach phuong tien theo nam sx tang dan
	 * @return
	 */
			@Override
			public ListVehicle insertVehicle(Vehicle v) {
				// TODO Auto-generated method stub
				return new ConsVehicle(v, new MTVehicle());
			}
	@Override
	public ListVehicle sortByVehicle() {
		// TODO Auto-generated method stub
		return new MTVehicle();
	}

	
	
}