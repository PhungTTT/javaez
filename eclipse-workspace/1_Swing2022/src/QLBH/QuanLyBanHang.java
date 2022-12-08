package QLBH;

import java.util.ArrayList;
import java.util.Comparator;

public class QuanLyBanHang {
	private ArrayList<SanPham> listSP;
	private ArrayList<KhachHang> listKH;
	/**
	 * Constructor of QuanLyBanHang
	 * @param listSP
	 * @param listKH
	 */
	public QuanLyBanHang(ArrayList<SanPham> listSP, ArrayList<KhachHang> listKH) {
		super();
		this.listSP = listSP;
		this.listKH = listKH;
	}
	/*
	 * ThemKhachHang Method
	 */
	public void themKhachHang(String maKH,String tenKH) {
		ArrayList<SanPham> listSP = new ArrayList<SanPham>();
		this.listKH.add(new KhachHang(maKH, tenKH, listSP, 0));
	}
	/**
	 * Tim Khach Hang, neu khong tim thay tra null
	 */
	public KhachHang timKhachHang(String maKH) {
		KhachHang result = null;
		for(int i =0;i<listKH.size();i++) {
			if(listKH.get(i).getMaKH().equals(maKH)) {
				result = listKH.get(i);
			}
		}
		return result;
	}
	/**
	 * Tim San Pham theo ten SP
	 */
	public SanPham timSanPham(String tenSanPham) {
		tenSanPham =tenSanPham.trim();
		SanPham result = null;
		for(int i =0;i<listSP.size();i++) {
			if(listSP.get(i).getTenSanPham().equals(tenSanPham)) {
				result = listSP.get(i);
			}
		}
		return result;
	}
	/**
	 * Them SP cho KH
	 */
	public void themSPforKH(String maKH, String tenSP) {
		tenSP = tenSP.trim();
		for(int i =0;i<listKH.size();i++) {
			if(listKH.get(i).getMaKH().equals(maKH)) {
				for(int j = 0; j<listSP.size();j++) {
					int count =0;
					if(tenSP.equals(listSP.get(j).getTenSanPham())) {
						count++;
					}
					if(count ==1) {
						listKH.get(i).getListSP().add(listSP.get(j));
					}
				}
			}
		}
		//Tinh Tong Tien
		for(int i =0;i<listKH.size();i++) {
			listKH.get(i).tinhTongTien();
		}
	}
	/**
	 * Sap xep theo tong Tien
	 */
	public ArrayList<KhachHang> sapXepThanhTien(){
		//Sap Xep
		ArrayList<KhachHang> result =listKH;
		result.sort(new Comparator<KhachHang>() {
			@Override
			public int compare(KhachHang o1, KhachHang o2) {
				if(o1.getTongTien()>o2.getTongTien()) return -1;
				else if(o1.getTongTien() == o2.getTongTien()) return 0;
				else return 1;
			}
		});
		return result;
		
	}
	//In thong tin
	public void display() {
		for(KhachHang kh : listKH) {
			System.out.println(kh);
		}
	}
}
