package buffer_builder_tokenizer;

public class Ex_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Chao cac ban");
		//append
		sb.append(" nha");
		System.out.println(sb);
		//insert
		sb.insert(4, " mung");
		System.out.println(sb);
		//replace
		sb.replace(0, 9,"Rat vui khi duoc gap");
		System.out.println(sb);
		//delete
		sb.delete(7, 11);
		//reverse: Dao nguoc
		System.out.println(sb.reverse());
		sb.reverse();
		
		//capacity
		System.out.println("str: "+sb);
		System.out.println("capacity: "+sb.capacity());//default capacity =16 => muon thay doi thi ensureCapacity()
		System.out.println("length: "+sb.length());
		//subString
		String s = sb.substring(4);
		System.out.println(s);
	}
	
}
