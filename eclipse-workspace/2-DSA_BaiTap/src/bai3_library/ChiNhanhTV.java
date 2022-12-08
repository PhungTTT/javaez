package bai3_library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ChiNhanhTV {
	private String tenChiNhanh;
	private String diaChi;
	private List<Sach> dsSach;
	//This is COnstructor of ChiNhanhTV
	public ChiNhanhTV(String tenChiNhanh, String diaChi, List<Sach> dsSach) {
		this.tenChiNhanh = tenChiNhanh;
		this.diaChi = diaChi;
		this.dsSach = dsSach;
	}
	//c2: 
	public Sach maxAuthor() {
		//Danh sach chua sach NuocNgoai
		ArrayList<Sach> dsSachNuocNgoai = new ArrayList<>();
		for(int i=0;i<dsSach.size();i++) {
			if(dsSach.get(i).checkSachNuocNgoai()) {
				dsSachNuocNgoai.add(dsSach.get(i));
			}
		}
		//SachNuocNgoai nhieu TacGia nhat
		Sach re =dsSachNuocNgoai.get(0);
		for(int i=0;i<dsSachNuocNgoai.size();i++) {
				if(dsSachNuocNgoai.get(i).getDsTacGia().size()>re.getDsTacGia().size()) {
					re = dsSachNuocNgoai.get(i);
			}
		}
		//Sap xep
		re.getDsTacGia().sort(new Comparator<TacGia>() {
			@Override
			public int compare(TacGia o1, TacGia o2) {
				if(! o1.getTenTG().equals(o2.getTenTG())) {
					return o1.getTenTG().compareTo(o2.getTenTG());
				}
				else return -o1.getNamSinh() + o2.getNamSinh();
			}
		});
		return re;
	}
	//c3: Thong ke so luong sach cung nam XB
	public HashMap<Integer, Integer> thongKe(){
		HashMap<Integer, Integer> re  = new HashMap<>();
		for(Sach s : dsSach) {
			if(re.containsKey(s.getNamXuatBan())) {
				re.put(s.getNamXuatBan(), re.get(s.getNamXuatBan())+1);
			}else {
				re.put(s.getNamXuatBan(), 1);
			}
		}
		return re;
	}
}
