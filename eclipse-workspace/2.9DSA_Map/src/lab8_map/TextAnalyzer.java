package lab8_map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.*;
import java.util.zip.ZipEntry;

public class TextAnalyzer {
	// <word, its positions>
	private Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

	// load words in the text file given by fileName and store into map by using add
	// method in Task 2.1.
	// Using BufferedReader reffered in file TextFileUtils.java
	public void load(String fileName) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line =null;
		
		int pos = 1;
		while(true) {
			line = reader.readLine();
			
			if(line == null) break;
			StringTokenizer tokens = new StringTokenizer(line);
			while(tokens.hasMoreTokens()) {
				String word = tokens.nextToken();
				if(tokens.hasMoreTokens()) {
					add(word, pos++);
				}else add(word, -pos++);
			}
		}
		reader.close();
	}
	// In the following method, if the word is not in the map, then adding that word
	// to the map containing the position of the word in the file. If the word is
	// already in the map, then its word position is added to the list of word
	// positions for this word.
	// Remember to negate the word position if the word is at the end of a line in
	// the text file

	public void add(String word, int position) {
		if(map.containsKey(word)) {
			ArrayList<Integer> values = map.get(word); 
			values.add(position);
		}else {
			ArrayList<Integer> values = new ArrayList<Integer>();
			values.add(position);
			map.put(word, values);
		}
	}

	// This method should display the words of the text file along with the
	// positions of each word, one word per line, in alphabetical order
	public void displayWords() {
		TreeMap<String, ArrayList<Integer>> re = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		re.putAll(map);
		re.forEach((t, u) -> System.out.println(t+" = "+u));
		
	}

	// This method will display the content of the text file stored in the map
	public void displayText() {
		//idea: dua vao index -> in ra man hinh key do
		//tim size
		int size =0;
		for (java.util.Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			ArrayList<Integer> val = new ArrayList<>(entry.getValue());
			size += val.size();
		}
		//add vao mang
		String[] re = new String[size];
		
		for (java.util.Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			ArrayList<Integer> val = new ArrayList<>(entry.getValue());
			String key = entry.getKey();
		       for(int i=0;i<val.size();i++) {
		    	   int in =val.get(i);
		    	   if(in<0) {
		    		   in =in*(-1);
		    		   re[in-1] =key+"\n";
		    	   }
		    	   else { 
		    		   re[in-1] =key+" ";
		    	   }
				}
	    }
		//inra ket qua
		for(int i=0;i < re.length;i++)
		System.out.print(re[i]);
	}

	// This method will return the word that occurs most frequently in the text file
	//Tra ve tu xuat hien nhieu nhat
	public String mostFrequentWord() {
		/*
		 * Y tuong: 
		 * Tao treemap luu tru <so lan xuat hien, tu>
		 * Neu so lan xuat hien cac tu bang nhau ==> khong them vao treemap
		 * Con khong thi them vao treemap
		 * => ket qua: vi treemap sap xep tang dan nen chon phan tu cuoi cung!
		 */
		TreeMap<Integer,String> m = new TreeMap<>();
		//Tao 1 mang duplicate: luu tru gia tri xuat hien bi trung lap
		ArrayList<Integer> duplicate = new ArrayList<>();
		
		ArrayList<Integer> val = null;
		for (java.util.Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			 val = new ArrayList<>(entry.getValue());
			String key = entry.getKey();
			
			if(m.containsKey(val.size())) {//neu treemap da co gia tri val.size()
				duplicate.add(val.size());		//val.size duoc luu vao mang duplicate
				m.remove(val.size());				//xoa no khoi treemap
			}else {						  //else
				if(!duplicate.contains(val.size())){//neu val.size ko co trong duplicate
					m.put(val.size(), key);	
				}
			}
		}
		if(m.size()!=0) return m.lastEntry().getValue();
		return null;
	}
	/*
	 * Test
	 */
	public static void main(String[] args) throws IOException {
		TextAnalyzer t = new TextAnalyzer();
		String path = "data/fit.txt";
		t.load(path);
		System.out.println("---map---");
		t.map.forEach((k, u) -> System.out.println(k+" = "+u));
		System.out.println("---alphabetical order---");
		t.displayWords();
		System.out.println("---displayText---");
		t.displayText();
		System.out.println("---mostFrequentWord---");
		System.out.println(	t.mostFrequentWord());
	}

}
