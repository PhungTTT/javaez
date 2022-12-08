package BaiTapNLU;

public class Bai8_XOR {
	public static String XORAlg(String mahoa, byte key) {
		String reuString;
		byte[] mh = mahoa.getBytes();
		for(int i = 0; i<mh.length; i++) {
			mh[i] ^=key;
		}
		reuString = new String(mh);
		return reuString;
	}
	
	public static String XORAlgDec(String mahoa, byte key) {
		String reuString = XORAlg(mahoa,key);
		byte[] gm = mahoa.getBytes();
		
		for(int i = 0; i<gm.length; i++) {
			key ^= gm[i];
		}
		reuString = new String(gm);//gm+" " //gm.toString()
		return reuString;
	}
	/*
	 * Test
	 */
	public static void main(String[] args) {
		String mh = "LeBaPhung";
				byte key = 3;
		System.out.println("MA HOA: "+XORAlg(mh,key));
		System.out.println("GIAI MA: "+XORAlgDec(mh,key));
	}
}
