package BaiTapNLU;

public class Baii16_ktArr1_Chua_Arr2 {
	public static boolean isSubset(int arr1[],int arr2[]){
		int i,j;
		for (i = 0; i < arr2.length; i++) {//arr2: 2,4 con 
			for (j = 0; j < arr1.length; j++) {//arr1: 1,2,3,5 cha
				if (arr2[i] == arr1[j])
				    break;
			}
			
		if (j == arr1.length)//Neu j chay den size Arr1 => khong tim thay arr1[j] = arr2[i]
			return false;
		}
			return true;
		}
	
		/*
		 * Test
		 */
	public static void main(String args[]){
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11,3};
		
		if (isSubset(arr1, arr2))
		System.out.print("arr2[] la con cua arr1[] ");
		else {
		System.out.print("arr2[] khong phai con cua arr1[]");
		}
	}
}
