package bai3_library;

import java.util.List;

public class SachNuocNgoai extends Sach{
	private String quocGia;
	//THis is COnstructor of SachNuocNgoai
	public SachNuocNgoai(int maSo, String tieuDe, double gia, String theLoai, int namXuatBan, List<TacGia> dsTacGia, String quocGia) {
		super(maSo, tieuDe, gia, theLoai, namXuatBan, dsTacGia);
		this.quocGia = quocGia;
	}
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}	

	@Override
	public boolean checkSachNuocNgoai() {
		return true;
	}
}
