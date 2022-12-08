package lab9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyLIFO_App {
	// method stutter that accepts a queue of integers as
	//a parameter and replaces
	// every element of the queue with two copies of that
	//element
	// front [1, 2, 3] back
	// becomes
	// front [1, 1, 2, 2, 3, 3] back
	public static <E> void stutter(Queue<E> input) {
		int size = input.size();
		for(int i =0;i<size;i++) {
			E e = input.remove();
			input.add(e);
			input.add(e);
		}
	}
	// Method mirror that accepts a queue of strings as a
	//parameter and appends the
	// queue's contents to itself in reverse order
	
	// front [a, b, c] back
	// becomes
	// front [a, b, c, c, b, a] back
	public static <E> void mirror(Queue<E> input) {
		Stack<E> s = new Stack<>();
		int size = input.size();
		for(int i =0; i<size;i++) {
			s.add(input.remove());
		}
		
		for(int i =0; i<size;i++) {
			input.add(s.pop());
		}
	}
	
	// This method reserves the given array
	public static <E> void reserve(E[] array) {
		Stack<E> s = new Stack<>();
		for(int i =0; i<array.length;i++) {
			s.add(array[i]);
		}
		int size = s.size();
		for(int i =0; i<size;i++) {
			array[i] = s.pop();
		}
		
	}
	// This method checks the correctness of the
	//given input
	// i.e. ()(())[]{(())} ==> true, ){[]}() ==>
	//false
	public static boolean isCorrect(String input) {
		Stack<Character> s1 = new Stack<>();
		Queue<Character> s2 = new LinkedList<>();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='['||input.charAt(i)=='{'||input.charAt(i)=='(') {
				s1.add(input.charAt(i));
			}else if(input.charAt(i)==']'||input.charAt(i)=='}'||input.charAt(i)==')') {
				s2.add(input.charAt(i));
			}
		}

		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.size()!=s2.size()) return false;
		else {
			int size = s1.size();
			for(int i =0;i<size;i++) {
				if(s1.pop()!=s2.poll()) return false;
			}
		}
	return true;
	}
	// This method evaluates the value of expression
	// i.e. 51 + (54 *(3+2)) = 321
	public static int evaluateExpression(String expression) {
		Stack<Character> s1 = new Stack<>();//((
		Stack<Character> s2 = new Stack<>();//))
		Stack<Double> s3 = new Stack<>();//3+2, 54*,51+
		
		for(int i=0;i<expression.length();i++) {
			
		}
	return 0;
	}
	// This method checks the well-defined of a given
	//HTML or XML file
	public static boolean isWell_Defined(String
	fileName) {
	// TODO
	return false;
	}
	public static void main(String[] args) {
		Integer[] arr = {2,4,1};
		Queue<Integer> input = new LinkedList<Integer>(Arrays.asList(arr));
		//stutter
		MyLIFO_App.stutter(input);System.out.println(input);
		//mirror
		MyLIFO_App.mirror(input);System.out.println(input);
		//reserve
		MyLIFO_App.reserve(arr);
		for(Integer i : arr) System.out.print(i+" ");
		System.out.println();
		//
		System.out.println(isCorrect("{[]}()"));
//		System.out.println(isCorrect("()(())[]{(())}"));
//		System.out.println(evaluateExpression("51 + (54 *(3+2))"));
		
		
	}
}