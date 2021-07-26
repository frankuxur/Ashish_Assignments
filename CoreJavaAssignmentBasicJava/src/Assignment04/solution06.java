package Assignment04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class solution06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("Ashish");
		list.add("Frank");
		list.add("Kujur");
		list.add("Is");
		list.add("Learning");
		list.add("Core");
		list.add("Java");
		
		System.out.print("Old List: ");
		System.out.println(list);
		
		UnaryOperator<String> uop = x -> x.toUpperCase();
		
		for(String str: list) {
			String upper = uop.apply(str);
			Collections.replaceAll(list, str, upper);
		}
			
		
		System.out.print("\nNew List: ");
		System.out.print(list);
		
	}

}
