package BaiTapNLU;

public class Baii12_ConvertStringToDate {
	public static void convertStringToDate(String str) {
		//dd/MM/yyyy -> dd Month_name yyyy
		String s = str.trim();
		int x1 = str.indexOf("/",0);
		int x2 = str.indexOf("/",x1+1);
		
		int d = Integer.valueOf(str.substring(0,x1));//substring(a,b-1)
		int m = Integer.valueOf(str.substring(x1+1,x2));
		int y = Integer.valueOf(str.substring(x2+1,str.length()));
		
		String monthName = "";
		switch(m){
		case 1: monthName = "January1";
		break;
		case 2:	monthName = "February2";
		break;
		case 3:	monthName = "March3";
		break;
		case 4:	monthName = "April4";
		break;
		case 5:	monthName = "May5";
		break;
		case 6:	monthName = "June6";
		break;
		case 7:	monthName = "July7";
		break;
		case 8:	monthName = "August8";
		break;
		case 9:	monthName = "September9";
		break;
		case 10:monthName = "October10";
		break;
		case 11:monthName = "November11";
		break;
		case 12:monthName = "December12";
		break;
		}
		System.out.println(d+" "+monthName+" "+y);
	}
	public static void main(String[] args) {
		convertStringToDate("21/12/2000");
		convertStringToDate("2/7/2000");
		convertStringToDate("02/02/2000");
	}
}
