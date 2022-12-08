package BaiTapNLU;

public class Bai6_bTamGiacPascal {
	
	public static void createPascalTriangle(int size){
		for(int i=1; i<=size;i++) {
			if(i==1) {
				System.out.print(1);
			}else if(i!=2){
				for(int j =1; j< i+1;j++) {
					System.out.print(j+" ");
				}
			}
		if(i!=2) System.out.println();
		}
	}
	//Test
	public static void main(String[] args) {
		createPascalTriangle(7);
	}
}
