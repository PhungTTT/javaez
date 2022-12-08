package QLBH;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private double donGia;
	/**
	 * Constructor of SanPham
	 * @param maSanPham
	 * @param tenSanPham
	 * @param donGia
	 */
	public SanPham(String maSanPham, String tenSanPham, double donGia) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		return "SanPham("+ maSanPham + ", " + tenSanPham + ", " + donGia + ")";
	}
	
	
}
