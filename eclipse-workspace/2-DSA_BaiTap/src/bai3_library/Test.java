package bai3_library;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		TacGia t1 = new TacGia("A", 1999);
		TacGia t2 = new TacGia("D", 2000);
		TacGia t3 = new TacGia("A", 1990);
		TacGia t4 = new TacGia("C", 2005);
		TacGia t5 = new TacGia("B", 2003);
		
		TacGia[] listTG1 = {t1,t2,t3};
		Sach s1 = new SachNuocNgoai(01, "Sach 1", 150000, "IT", 2022,Arrays.asList(listTG1), "USA");
	
		TacGia[] listTG2 = {t4,t5};
		Sach s2 = new SachNuocNgoai(02, "Sach 2", 100000, "IT", 2022,Arrays.asList(listTG2), "Anh");
		
		TacGia[] listTG3 = {t2,t4,t5};
		Sach s3 = new SachTrongNuoc(03, "Sach 3", 200000, "QuaTangCS", 2003,Arrays.asList(listTG3));
		
		Sach[] dsS1 = {s1,s2,s3};
		ChiNhanhTV c1 = new ChiNhanhTV("CHiNhanh1", "Quang Tri", Arrays.asList(dsS1));
		
		Sach[] dsS2 = {s2,s3};
		ChiNhanhTV c2 = new ChiNhanhTV("CHiNhanh1", "HueMongMo", Arrays.asList(dsS2));
		
		ChiNhanhTV[] listChiNhanh = {c1,c2};
		ThuVien t = new ThuVien(Arrays.asList(listChiNhanh));
		
		System.out.println(c1.maxAuthor());
		System.out.println(t.thongKe());
	}
}
