package tuluyen;

public class GiaiThua {
	//Iteration 
	public static int giaiThuaIteration(int n) {
		int result = 1;
		for(int i=n ; i>=1; i--) {
			result*=i;
		}
		return result;
	}
	//Recursion 
	static int r = 1;
	public static int giaiThuaRecursion(int n) {
		if(n>=1) {
			 r*=n;
			 giaiThuaRecursion(--n);
		}
			return r;
	}
	public static void main(String[] args) {
		System.out.println(giaiThuaIteration(4));
		System.out.println(giaiThuaRecursion(3));
	}
}
