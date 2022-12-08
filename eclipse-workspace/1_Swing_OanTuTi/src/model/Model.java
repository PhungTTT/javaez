package model;

import java.util.Random;

public class Model {
	public Model() {}
	/*
	 * random ket qua cau may
	 */
	public String randomMay() {
		String x = null;
		String[] arr = {"keo","bua","bao"};
		Random r = new Random();
		for(int i=0;i<=2;i++) {
			x =arr[r.nextInt(arr.length)];
		}
		return x;
	}
	/**
	 * Ket qua tro choi
	 */
	public int ketQua(String luaChonMay,String luaChonNguoiChoi) {
		luaChonMay.trim();luaChonNguoiChoi.trim();
		if(luaChonNguoiChoi.equals(luaChonMay)) {
			return 0;
		}else {
			int result = 0;
			if(luaChonNguoiChoi.equals("keo")){
				if(luaChonMay.equals("bua")) {
					result = -1;
				}else if(luaChonMay.equals("bao")) {
					result = 1;
				}
			}else if(luaChonNguoiChoi.equals("bua")){
				if(luaChonMay.equals("bao")) {
					result = -1;
				}else if(luaChonMay.equals("keo")) {
					result = 1;
				}
			}else if(luaChonNguoiChoi.equals("bao")){
				if(luaChonMay.equals("keo")) {
					result = -1;
				}else if(luaChonMay.equals("bua")) {
					result = 1;
				}
			}
		return result;
		}
		
	}
	public static void main(String[] args) {
		Model model = new Model();
		System.out.println(model.ketQua("keo","bao"));
		
	}
}
