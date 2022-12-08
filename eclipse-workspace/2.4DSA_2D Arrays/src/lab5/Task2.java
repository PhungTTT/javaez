package lab5;

public class Task2 {
	//check theo dong
	public static boolean checkRow(char[][] board) {
		for(int i=0;i<board.length;i++) {
			int count =0;
			char c = board[i][0];
			if(c != ' ') {
				for(int j=1;j<board[0].length;j++) {
					if(c == board[i][j]) count++;
					if(count == board[0].length-1) return true;
				}
			}
		}
	return false;
	}
	//Check theo cot
	public static boolean checkColumns(char[][] board) {
		for(int j =0;j<board[0].length;j++) {
			int count =0;
			char c = board[0][j];
			if(c != ' ') {
				for(int i=1;i<board.length;i++) {
					if(c == board[i][j]) count++;
					if(count == board.length-1) return true;
				}
			}
		}
		return false;
	}
	//check theo duong cheo: \ /
	public static boolean checkDiagonals(char[][] board) {
		//Th1 :\
		int count1 = 0;
		char c = board[0][0];
		for(int i=1; i<board.length;i++) {
			if(c == board[i][i]) count1++;
			if(count1 == board.length-1) return true;
		}
		//Th2: /
		int count2 = 0;
		char c2 = board[board.length-1][0];
		for(int i=board.length-1-1, j=1; i>=0 && j<board.length;i--,j++) {
			if(c2 == board[i][i]) count2++;
			if(count2 == board.length-1) return true;
		}
		return false;
	}
	//Test
	public static void main(String[] args) {
		char[][] a = {{'x','x','x'},{'O','x','O'},{'x','O','O',}};
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("check dong: "+checkRow(a));
		System.out.println("check cot: "+checkColumns(a));
		System.out.println("check duonng cheo: "+checkDiagonals(a));
	}
}
