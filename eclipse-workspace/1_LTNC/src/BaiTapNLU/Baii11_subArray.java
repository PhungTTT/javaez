package BaiTapNLU;

import java.util.Arrays;
import java.util.Random;

public class Baii11_subArray {
	/**
	 * Thuat Toan
	 * @param arr
	 * @param qty
	 * @return
	 */
	public static int[] subArray(int[] arr, int qty) {
		Random r=new Random(); 
		int[] result = new int[qty];
		if(qty < arr.length) {
      		for(int i = 0; i<result.length;i++) {
      			result[i] = arr[r.nextInt(arr.length-1)];
      		}
		}
      		return result;
	}
	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr={5,2,9};     
      	int qty = 2;
      	int[] result = subArray(arr,qty);
      		System.out.println(Arrays.toString(result));
      	}
}