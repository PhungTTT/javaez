package tuluyen;

import java.util.Arrays;

public class MaxArray {
	//Iteration Use
	public static int iterationUse(int[] arr) {
		int max = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	//Recursion Use
	static int max = Integer.MIN_VALUE;
	public  static int recursionUse(int[] arr) {
		recursionUseHelp(arr,arr.length);
		return max;
	}
		public  static void recursionUseHelp(int[] arr,int n) {
			if(n>1) {
				if(max < arr[n-1]) {
					max = arr[--n];
					recursionUseHelp(arr,n);
				}
			}
		}
	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {3,1,2,3,5};
		System.out.println(Arrays.toString(arr));
		
		long s1 = System.nanoTime();
		int r1 = iterationUse(arr);
		long e1 = System.nanoTime();
		System.out.println("Max = "+r1+ " -time Iteration: "+ (e1-s1) );
		
		long s2 = System.nanoTime();
		int r2 = recursionUse(arr);
		long e2 = System.nanoTime();
		System.out.println("Max = "+r2+ " -time Recursion: "+ (e2-s2) );
		
		
	}
}
