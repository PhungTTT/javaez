package bai3_library;

import java.util.HashSet;
import java.util.List;

public abstract class Sach {
	protected int maSo;
	protected String tieuDe;
	protected double gia;
	protected String theLoai;
	protected int namXuatBan;
	protected List<TacGia> dsTacGia;
	/**
	 * @param maSo
	 * @param tieuDe
	 * @param gia
	 * @param theLoai
	 * @param namXuatBan
	 * @param dsTacGia
	 */
	public Sach(int maSo, String tieuDe, double gia, String theLoai, int namXuatBan, List<TacGia> dsTacGia) {
		this.maSo = maSo;
		this.tieuDe = tieuDe;
		this.gia = gia;
		this.theLoai = theLoai;
		this.namXuatBan = namXuatBan;
		this.dsTacGia = dsTacGia;
	}
	
	public int getMaSo() {
		return maSo;
	}

	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public List<TacGia> getDsTacGia() {
		return dsTacGia;
	}

	public void setDsTacGia(List<TacGia> dsTacGia) {
		this.dsTacGia = dsTacGia;
	}

	@Override
	public String toString() {
		return "Sach [maSo=" + maSo + ", tieuDe=" + tieuDe + ", gia=" + gia + ", theLoai=" + theLoai + ", namXuatBan="
				+ namXuatBan + ", dsTacGia=" + dsTacGia + "]";
	}

	//Kiem tra co phai la sachNuocNgoai
	public abstract boolean checkSachNuocNgoai();
}
