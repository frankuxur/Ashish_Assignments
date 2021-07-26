package Assignment04;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class solution03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> pr = a -> (a>15);
		boolean foo1 = pr.test(10);
		System.out.println(foo1);
		
		Supplier<Double> sup = () -> Math.random();
		double foo2 = sup.get();
		System.out.println(foo2);
		
		String name = "Frank";
		
		Consumer<String> con = n -> {
		    int len = n.length();
		    System.out.println(len);
		}; 
		
		con.accept(name);
		
		Function<String, Integer> fun = n -> n.length();
		System.out.println(fun.apply(name));
	}

}