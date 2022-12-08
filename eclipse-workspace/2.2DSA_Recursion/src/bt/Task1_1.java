package bt;

public class Task1_1 {
	//a) S(n)=1-2+3-4+...+[(-1)^(n+1)]*n n>0
	public static int getSn1(int n) {
		if(n==1) {
			return 1;
		}
		else {
			if(n%2==0) {
				return -1*n + getSn1(--n);
			}else return n + getSn1(--n);
		}
	}
	//b) S(n)=1+1.2+1.2.3+�+1.2.3�n, n>0
		public static int giaiThua(int n) {
			if(n==1) {
				return 1;
			}
			else return n*giaiThua(--n);
		}
		
	public static int getSn2(int n) {
		if(n==1) {
			return 1;
		}else {
			return giaiThua(n)+getSn2(--n);
		}
	}
	//c) S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*n +getSn3(--n);
		}
	}
	//d) S(n)=1+1/2+1/(2.4)+1/(2.4.6)+�+1/(2.4.6.2n), n>=0
	public static int giaiThuaChan(int n) {
		if(n==1) {
			return 1;
		}
		else return ((n*2)-2)*giaiThuaChan(--n);
	}
	public static double getSn4(int n) {
		if(n==1) {
			return 1;
		}else {
			return (double) 1/giaiThuaChan(n)+getSn4(--n);
		}
	}

	/**
	 *Test
	 */
	public static void main(String[] args) {
		System.out.println("a) S("+3+") = 1-2+3-4+5-6 = "+ getSn1(3));
		System.out.println("b) S("+3+") = 1+1.2+1.2.3 = "+getSn2(3));
		System.out.println("c) S("+3+") = 1+2^2+3^2 = "+getSn3(3));
		System.out.println("d) S("+3+") = 1+1/2+1/(2.4) = "+getSn4(3));
	}
}
