package Thi2022_Employee;

public class ConsVehicle implements ListVehicle {
	private Vehicle firstVehicle;
	private ListVehicle restVehicle;
	/**
	 * This is Constructor of ConsDriver
	 * @param firstDriver
	 * @param resrDriver
	 */
	
	public ConsVehicle(Vehicle firstVehicle, ListVehicle restVehicle) {
		super();
		this.firstVehicle = firstVehicle;
		this.restVehicle = restVehicle;
	}
	@Override
	public String toString() {
		return  firstVehicle +""+ restVehicle;
	}
	/**
	 *checkContainVehicle(int iid): Kiem tra list Vehicle co chua phuong tien theo iid
	 * @param iid
	 * @return
	 */
	@Override
	public boolean checkContainVehicle(int iid) {
		if(this.firstVehicle.getIid()!=iid) {
			return this.restVehicle.checkContainVehicle(iid);
		}else
			return true;
	}
	/**
	 * sortByVehicle Method: Sap xep danh sach phuong tien theo nam sx tang dan
	 * @return
	 */
			@Override
			public ListVehicle insertVehicle(Vehicle v) {
				if(v.getYearManufacture()<this.firstVehicle.getYearManufacture()) {
					return new ConsVehicle(v,this);
				}else
					return new ConsVehicle(this.firstVehicle, this.restVehicle.insertVehicle(v));
			}
	@Override
	public ListVehicle sortByVehicle() {
		// TODO Auto-generated method stub
		 return this.restVehicle.sortByVehicle().insertVehicle(this.firstVehicle);
	}

}
