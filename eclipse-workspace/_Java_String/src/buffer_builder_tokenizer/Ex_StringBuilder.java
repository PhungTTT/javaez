package buffer_builder_tokenizer;

public class Ex_StringBuilder {
	//Giong voi StringBuffer
	/*
	 * Khac:
	 * 		StringBuffer 					|		StringBuilder
	 * 	synchronized(dong bo): luong an toan|non-synchronized(dong bo): da luong
	 * 	->chi co 1 luong truy cap method	|
	 *  cua StringBuffer					|=> duoc xem la hieu qua hon:>
	 * 
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Hoclaptrinh");  
        }  
        System.out.println("Thoi gian tieu ton boi StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Hoclaptrinh");  
        }  
        System.out.println("Thoi gian tieu ton boi StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
    }  
}
