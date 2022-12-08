package quiz;

import java.util.Arrays;
import java.util.Stack;

public class C1 {
	public static int max(Stack<Integer> s) {
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue = s.pop();
		backup.push(maxValue);
		while (!s.isEmpty()) {
		int next = s.pop();
		backup.push(next);

		System.out.println(maxValue+" "+next);
		maxValue = Math.max(maxValue, next);
		}
		while (!backup.isEmpty()) {
		s.push(backup.pop());
		}
		return maxValue;
	}
	public static void main(String[] args) {
		Stack<Integer> backup = new Stack<Integer>();
		backup.add(1);
		backup.push(4);
		backup.add(5);
		backup.push(3);
		
		System.out.println(max(backup));
	}
}
