package tuluyen;

public class SumArray {
	public static int sum(int[] arr) {
		return sumHelp(arr,arr.length-1);
	}

	private static int sumHelp(int[] arr, int n) {
		if(n<0) return 0;
		else {
			return arr[n] += sumHelp(arr, --n);
		}
	}
	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {3,2,6,4};
		System.out.println(sum(arr));
	}
}
