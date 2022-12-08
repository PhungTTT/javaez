package lab11_task4;

public class B1 {
	// max
	public static int max(int[] arr) {
		return maxHelp(arr,0);
	}
	private static int maxHelp(int[] arr, int i) {
		 if (i < arr.length) {
		        return Math.max(arr[i], maxHelp(arr, i+1));
		    } else {
		        return arr[0];
		    }
	}

	// 4.2: x^N
	public static long luyThua(int x, int n) {
		if (n == 1)
			return x;
		else {
			return x * luyThua(x, n - 1);
		}
	}

	//4.3: findCharIndex
	public static int findCharIndex(String s, char c) {
		return findCharIndexHelp(s, c, 0);

	}

	private static int findCharIndexHelp(String s, char c, int n) {
		if (n < s.length() - 1) {
			if (s.charAt(n) == c)
				return n;
			else
				return findCharIndexHelp(s, c, n + 1);
		}
		return -1;
	}
	//4.4: So le gioi han boi(0,n)
	public static void soLe(int n) {
		if(n>=1) {
			if( n%2 == 1) {
				System.out.print(n+ " ");
				soLe(n-1);
			}
			else soLe(n-1);
		}
	}
	//4.5: Sum Le trong mang
	public static int sumLe(int[] arr) {
		return sumLeHelp(arr,0);
	}
	public static int sumLeHelp(int[] arr, int n) {
		if(n<arr.length-1) {
			if(arr[n]%2 ==1) {
				return arr[n]+= sumLeHelp(arr, ++n);
			}
			else return sumLeHelp(arr, ++n);
		}
		return 0;
	}
	//4.6
	//4.7: x*y
	public static int multiply(int x, int y) {
		if(y==0) return 0;
		else return x+multiply(x, --y);
	}
	//x--y
	public int subtract(int x,int y) {
		return 1;
	}

	// Test
	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 8, 6 };
		System.out.println(max(arr));
		// luyThua
		System.out.println(luyThua(5, 4));
		// findCharIndexHelp
		System.out.println(findCharIndex("Xin chao, hom nay la thu 7", 'c'));
		//soLe
		soLe(5);
		System.out.println();
		//sumLe
		System.out.println(sumLe(arr));
		//x^y
		System.out.println(multiply(3, 3));
	}
}
