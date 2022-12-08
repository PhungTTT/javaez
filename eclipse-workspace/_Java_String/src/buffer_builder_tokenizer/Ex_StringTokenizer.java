package buffer_builder_tokenizer;

import java.util.StringTokenizer;

public class Ex_StringTokenizer {
	///Cho phep chia chuoi thanh cac token
	public static void main(String[] args) {
		/*
		 * 3 Constructor
		 */
		//(1)//ngoai le neu tham so truyen vao null
		StringTokenizer s1 = new StringTokenizer("What is StringTokenier?");
		//(2)truyen vao them String delim de xac dinh den delim do la nextLine, mac dinh la khoang trang
		StringTokenizer s2 = new StringTokenizer("Hanh phuc hay kho dau...la do chinh suy nghi dang co trong ban",";");
		StringTokenizer s3 = new StringTokenizer("Hanh phuc hay kho dau la do chinh suy nghi dang co trong ban",";",true);//or false
		/*
		 * Method
		 */
		//1. boolean hasMoreToken(): kiem tra nhieu token co san khong
		while(s1.hasMoreTokens()) {
			System.out.println(s1.nextToken());
		}
		while(s2.hasMoreTokens()) {
			System.out.println(s2.nextToken("..."));//Token nextToken(),Token nextToken(String delim)
		}
		//2. boolean hasMoreElement(): tuong tu hasMoreToken()
		while(s3.hasMoreElements()) {
			System.out.println(s3.nextElement());//Object nextElment()
		}
		//3.int countTokens()
			System.out.println(s2.countTokens());
	}
	/*
	 * => StringTokenizer la cu.
	 * Nen dung split() cua String or Regex(Regular Expression) de chia thanh cac Token
	 */
}
