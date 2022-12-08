package lab7.set_student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

import using_hashset.Student;

public class MyWordCount {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "data/fit.txt";

	private List<String> words = new ArrayList<>();

	public MyWordCount() {
		try {
			this.words.addAll(Utils.loadWords(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public List<WordCount> getWordCounts() {
		List<WordCount> re = new ArrayList<WordCount>();
		for (String  w : words) {
			WordCount wc = new WordCount(w, 1);
			int count = 1;
			
			Iterator<WordCount> iter = re.iterator();
			while(iter.hasNext()) {
				WordCount element = iter.next();
				if(element.getWord().equals(wc.getWord())) {
					count++;
					element.setCount(element.getCount()+1);
				}
			}
			
			if(count==1) {
				re.add(wc);	
			}
		}
		return re;
	}

	// Returns the words that their appearance are 1, do not consider duplidated
	// words
	public Set<String> getUniqueWords() {
		Set<String> re = new HashSet<String>();
		for (String  w : words) {
			WordCount wc = new WordCount(w, 0);
			//start: Nen duyet bang iterator de remove chu nhu nay ruom ra
			for (String  t : words) {
				WordCount temp = new WordCount(t, 1);
				if(wc.getWord().equals(temp.getWord())) {
					if(wc.getCount()<=1) {
						wc.setCount(wc.getCount()+1);
					} else break;

				}
			}
			if(wc.getCount()==1) {
				re.add(wc.getWord());
			}
			//end
		}
		return re;
	}

	// Returns the words in the text file, duplicated words appear once in the
	// result
	public Set<String> getDistinctWords() {
		// TODO
		return null;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public Set<WordCount> printWordCounts() {
		Set<WordCount> re = new TreeSet<WordCount>(getWordCounts());
		return re;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according descending order of occurences
	// Example: Bug - 10, An - 3, Nam - 2.
	public Set<WordCount> exportWordCountsByOccurence() {
		 Set<WordCount> re = 
		            ((TreeSet<WordCount>)printWordCounts()).descendingSet();
		return re;
	}

	// delete words begining with the given pattern (i.e., delete words begin with
	// 'A' letter
	public Set<String> filterWords(String pattern) {
		//if w.startWith(A) false them vao set
		Set<String> re = new LinkedHashSet<>();
		for(String w : words) {
			if(!w.startsWith(pattern)) {
				re.add(w);
			}
			
		}
		return re;
	}
	public static void main(String[] args) {
		MyWordCount test = new MyWordCount();
		
		List<WordCount> t1 = test.getWordCounts();
		t1.forEach(t -> System.out.println(t));
		System.out.println("------");
		
		Set<String> t2 = test.getUniqueWords();
		t2.forEach(t -> System.out.println(t));
		System.out.println("------");
		
		Set<WordCount> t4 = test.printWordCounts();
		t4.forEach(t -> System.out.println(t));
		System.out.println("------");
		
		Set<WordCount> t5 = test.exportWordCountsByOccurence();
		t5.forEach(t -> System.out.println(t));
		System.out.println("------");
		
		Set<String> t6= test.filterWords("D");
		t6.forEach(t -> System.out.println(t));
	}
}
