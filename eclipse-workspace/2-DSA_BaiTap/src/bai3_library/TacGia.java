package bai3_library;

public class TacGia {
	private String tenTG;
	private int namSinh;
	/**
	 * @param tenTG
	 * @param namSinh
	 */
	public TacGia(String tenTG, int namSinh) {
		this.tenTG = tenTG;
		this.namSinh = namSinh;
	}
	@Override
	public String toString() {
		return "(TacGia: " + tenTG + ", " + namSinh+")";
	}
	public String getTenTG() {
		return tenTG;
	}
	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
}
