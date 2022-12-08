package lambda_expressions;

import java.util.function.Consumer;

interface Addable{
	int addition(int a, int b);
}

class AddableImp implements Addable{

	@Override
	public int addition(int a, int b) {
		return (a+b);
	}
	
}

public class Ex2 {
	public static void main(String[] args) {
		//
		Addable addition = (int a,int b) -> (a+b);
//or:		Addable addition = (int a,int b) -> {
//			return (a+b);	
//		};
		int result = addition.addition(10, 20);
		System.out.println(result);
	}
}
