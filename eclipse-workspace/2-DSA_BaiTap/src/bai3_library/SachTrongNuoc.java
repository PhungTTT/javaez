package bai3_library;

import java.util.HashSet;
import java.util.List;

public class SachTrongNuoc extends Sach {
	
	//THis is COnstructor of SachTrongNuoc
	public SachTrongNuoc(int maSo, String tieuDe, double gia, String theLoai, int namXuatBan, List<TacGia> dsTacGia) {
		super(maSo, tieuDe, gia, theLoai, namXuatBan, dsTacGia);
	}
	
	@Override
	public boolean checkSachNuocNgoai() {
		return false;
	}

	


}
