package lab5;

import java.util.Iterator;

public class Task1 {
	/*
	 * add 2 matrices
	 */
	public static int[][] add(int[][] a, int[][] b){
		int[][] result = new int[a.length][a[0].length];
		for(int i =0; i<a.length;i++) {
			for(int j =0; j<a[0].length;j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}
	/*
	 * subtract 2 matrices
	 */
	public static int[][] subtract(int[][] a, int[][] b){
		int[][] result = new int[a.length][a[0].length];
		for(int i =0; i<a.length;i++) {
			for(int j =0; j<a[0].length;j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}
	/*
	 * multiply 2 matrices
	 */
	public int[][] multiply(int[][]a, int[][] b){
		int[][] result = new int[a.length][b[0].length];
		for (int i =0;i<a.length;i++){
			for(int j = 0;j<b[0].length;j++) {
				for(int k =0;k<a[0].length;k++) {
					result[i][j] += a[i][k]*b[k][j];
				}
			}
			
		}
		return result;
	}
	/*
	 * transpose a matrix
	 */
	public static int[][] transpose (int[][] a){
		int[][] result = new int[a[0].length][a.length];
		for(int i =0;i<a[0].length;i++) {
			for(int j =0; j<a.length;j++) {
				result[i][j] = a[j][i];
			}
		}
		return result;
	}
	/*
	 * display
	 */
	public static void displayScreen(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}