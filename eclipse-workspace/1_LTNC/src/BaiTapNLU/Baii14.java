package BaiTapNLU;

public class Baii14 {
	public final int col_num = 5;

	public String enCode(String data) {
		int x = data.length();
		String res = "";
		// Buoc 1: Tinh so hang :
		int row = (x % col_num == 0) ? (x % col_num) : (x / col_num + 1);
		// Buoc 2: Chen khoang trang vao chuoi de du so luong trong o:
		for (int i = 1, size = col_num * row - x; i <= size; i++) {
			data += " ";
		}
		// Buoc 3: Tao mang de rai chuoi :
		char[][] arr = new char[row][col_num];
		// Buoc 4: Rai chuoi len mang:
		for (int ro = 0, index = 0; ro < row; ro++) {
			for (int col = 0; col < col_num; col++) {
				arr[ro][col] = data.charAt(index++);
			}
		}
		// Buoc 5: Lay cac ki tu theo cot:
		String donlai = "";
		for (int col = 0; col < col_num; col++) {
			for (int ro = 0; ro < row; ro++) {
				donlai += arr[ro][col];
			}
		}
		res= donlai.replace(" ", "-");
		return res;
	 	}
	
	 
	 	//GIAI MA
	 	public String Decode(String data) {
	 		String result = " ";
	 		int row = (data.length() % col_num == 0) ? data.length() / col_num : data.length() / col_num + 1;
	 		char matrix[][] = new char[row][col_num];
		// Rai theo cot
	 		for (int col = 0, index = 0; col < col_num; col++) {
	 			for (int ro = 0; ro < row; ro++) {
	 				matrix[ro][col] = data.charAt(index++);
	 			}
	 		}
		// Don theo hang:
	 		String temp = "";
	 		for (int ro = 0; ro < row; ro++) {
	 			for (int col = 0; col < col_num; col++) {
	 				temp += matrix[ro][col];
	 			}
	 		}
	 		result = temp.replace("-", " ");
	 		result.trim();
	 		return result;

	 	}
	 
	 	public static void main(String[] args) {
	 		Baii14 m = new Baii14();
	 		String data=("I am student");
	 		System.out.println(m.enCode(data));
	 		System.out.println(m.Decode("Isn-ttau-md--e-"));
	
	 	}
}
