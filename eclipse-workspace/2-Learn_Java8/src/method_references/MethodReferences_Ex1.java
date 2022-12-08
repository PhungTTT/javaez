package method_references;

import java.util.function.Function;

public class MethodReferences_Ex1 {
	public static void main(String[] args) {
		//using lambda expression
		Function<Integer, Double> functionL = (input) -> Math.sqrt(input);
		System.out.println(functionL.apply(4));
		
		//using method references
		Function<Integer, Double> functionM = Math::sqrt;
		System.out.println(functionM.apply(16));
		
	}
}
