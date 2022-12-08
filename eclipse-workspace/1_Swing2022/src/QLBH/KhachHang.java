package QLBH;

import java.util.ArrayList;
import java.util.Arrays;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private ArrayList<SanPham> listSP;
	private double tongTien;
	/**
	 * Constructor of KhachHang
	 * @param maKH
	 * @param tenKH
	 * @param listSP
	 * @param tongTien
	 */
	public KhachHang(String maKH, String tenKH, ArrayList<SanPham> listSP, double tongTien) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.listSP = listSP;
		this.tongTien = tongTien;
	}
	/**
	 * Getter and Setter
	 */
		public String getMaKH() {
				return maKH;
			}
			public void setMaKH(String maKH) {
				this.maKH = maKH;
			}
			public String getTenKH() {
				return tenKH;
			}
			public void setTenKH(String tenKH) {
				this.tenKH = tenKH;
			}
			public ArrayList<SanPham> getListSP() {
				return listSP;
			}
			public void setListSP(ArrayList<SanPham> listSP) {
				this.listSP = listSP;
			}
			public double getTongTien() {
				return tongTien;
			}
			public void setTongTien(double tongTien) {
				this.tongTien = tongTien;
			}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "KhachHang: " + maKH + ", " + tenKH + ", Cac San Pham"+listSP+ ", TongTien:"
				+ tongTien;
	}
	/**
	 * Tinh tong Tien
	 */
	public void tinhTongTien() {
		tongTien =0;
		for(int i =0 ; i<this.listSP.size();i++) {
			tongTien += listSP.get(i).getDonGia();
		}
	}
}
