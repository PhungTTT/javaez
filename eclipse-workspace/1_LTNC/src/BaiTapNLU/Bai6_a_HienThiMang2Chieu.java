package BaiTapNLU;

public class Bai6_a_HienThiMang2Chieu {
	public static void printMatrix(int[][] matrix) {
	  
	        for (int i = 0; i < matrix.length; ++i) {
	            for(int j = 0; j < matrix[i].length; ++j) {
	                System.out.println(matrix[i][j]);
	            }
	        }
	}
	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] a = {
	            {1, -2, 3}, 
	            {-4, -5, 6, 9}, 
	            
	        };
		printMatrix(a);
	}
}
