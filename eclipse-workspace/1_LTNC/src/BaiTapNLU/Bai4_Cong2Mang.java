package BaiTapNLU;

import java.util.Arrays;

public class Bai4_Cong2Mang {
	
	public static int[] arrayPlus(int[] arr1, int[] arr2) {
		int[] myArray;
		/**
		 */
		if(arr1.length >= arr2.length) {
			myArray = new int[arr1.length];
			
			for(int i = 0; i < arr2.length;i++) {
				myArray[i] = arr1[i] + arr2[i];
			}
			
			for(int i = arr2.length;i < myArray.length;i++) {
				myArray[i] = arr1[i];
			}
		}
		else {
			myArray = new int[arr2.length];
			
			for(int i = 0; i< arr1.length; i++){
				myArray[i] = arr1[i] + arr2[i];
			}
			for(int i = arr1.length;i <myArray.length;i++) {
				myArray[i] = arr2[i];
			}
		}
		
		return myArray;
	}
	
	/**
	 * Test
	 */
	public static void main(String[] args) {

		int[] a = {2,5,4,6};
		System.out.println("a"+Arrays.toString(a));

		int[] b = {9,8,7};
		System.out.println("b" +Arrays.toString(b));
		System.out.println("KQ:" +Arrays.toString(arrayPlus(a,b)));
	}
}
