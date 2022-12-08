package method;

public class String_Method {
	public static void main(String[] args) {
		String str = "Hello World";
		//charAt
		System.out.println(str.charAt(1));
		//length
		System.out.println(str.length());
		//Noi chuoi
		System.out.println(str.concat(" Love you!"));
		System.out.println(str + " BaiBai");
		
		//copyValueOf
		char[] c = {'g','o','o','d',' ','l','u','c','k'};
		System.out.println(String.copyValueOf(c));//char[] -> String
		System.out.println(String.copyValueOf(c,1,2));
		//getByte
		byte[] r =  str.getBytes();
		
		//startsWith & endWith
		System.out.println(str.startsWith("He"));
		System.out.println(str.endsWith("dl"));
		
		//compareTo & equals
		System.out.println(str.compareTo("Hello world"));//phan biet hoa, thuong
		System.out.println(str.compareToIgnoreCase("hello world"));//ko phan biet hoa, thuong
		
		System.out.println(str.equals("Hello world"));
		System.out.println(str.equalsIgnoreCase("hello world"));
		
 		//matches
 		System.out.println(str.matches("Hello World"));
 		
		//indexOf
		System.out.println(str.indexOf('l'));
 		System.out.println(str.indexOf('l',3));
 		System.out.println(str.indexOf("rl"));
 		System.out.println(str.lastIndexOf('l'));
 		
 		//replace
 		String rep = str.replace('l', 'L');
 		System.out.println(rep);
 		//replaceAll
 		String rep2 = str.replaceAll("LL", "ll");
 		System.out.println(rep2);
 		//
	}
}
