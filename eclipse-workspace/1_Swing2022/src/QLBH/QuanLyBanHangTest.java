package QLBH;
import java.util.ArrayList;

class QuanLyBanHangTest  {
	public static void main(String[] args) {
	SanPham s1 = new SanPham("SP001","Nuoc Tang Luc", 15000);
	SanPham s2 = new SanPham("SP002","Tra Sua", 25000);
	SanPham s3 = new SanPham("SP003","Cafe", 15000);
	SanPham s4 = new SanPham("SP004","Banh Trang Tron", 15000);
	SanPham s5 = new SanPham("SP005","Kho Bo", 30000);
	SanPham s6 = new SanPham("SP006","Banh Mi", 13000);
	
	
	ArrayList<SanPham> listSP = new ArrayList<SanPham>();
	ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
	QuanLyBanHang qlbh = new QuanLyBanHang(listSP, listKH);
	
	
	/*
	 * test Them Khach Hang
	 */
		System.out.println("\nTest Them Khach Hang:");
		qlbh.themKhachHang("A01","Le Ba Phung");
		qlbh.themKhachHang("A02", "Ong A");
		qlbh.themKhachHang("B02", "Ba B");
		qlbh.display();
		
	
	/*
	 * Test tim Khach Hang
	 */
		System.out.println("\nTest tim Khach Hang:");
		System.out.println("A02! "+qlbh.timKhachHang("A02"));
		System.out.println("B01! "+qlbh.timKhachHang("B01"));
	/**
	 * Test tim SP trong listSp cua quay
	 */
		System.out.println("\nTest tim San Pham");
		//Them gia tri san pham cho listSP
		listSP.add(s1);listSP.add(s2);
		listSP.add(s3);listSP.add(s4);
		listSP.add(s5);listSP.add(s6);
		//Tim
		System.out.println("Tim Banh Mi! "+qlbh.timSanPham("Banh Mi"));
		System.out.println("Soda Bac Ha! "+qlbh.timSanPham("Soda Bac Ha"));
	
	/**
	 * Test Them SP cho khach Hang
	 */
		System.out.println("\nTest Them Sp cho Khach Hang");
		qlbh.themSPforKH("A01", "Banh Mi");
		qlbh.themSPforKH("A01", "Cafe");
		
		qlbh.themSPforKH("B02", "Hai San");
		qlbh.themSPforKH("B02", "Kho Bo");
		
		qlbh.themSPforKH("A02", "Banh Trang Tron");
		qlbh.display();
	/**
	 * Test Sap xep
	 */
		System.out.println("\n---Test Sap xep theo Tong Tien---");
		ArrayList<KhachHang> result= qlbh.sapXepThanhTien();
		for(int i =0; i<result.size();i++) {
			System.out.println(result.get(i).getMaKH()+", "
					+ result.get(i).getTenKH()+", "
					+ result.get(i).getTongTien());
		}
	}
	
}
