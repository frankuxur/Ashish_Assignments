package Assignment04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class solution05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		
		List<String> list = new ArrayList<>();
		
		list.add("Life");
		list.add("Is");
		list.add("Amazing");
		list.add("With");
		list.add("Frank");
		
		Consumer<String> con = x -> sb.append(x.charAt(0));
				
		for(String str: list) {
			con.accept(str);
		}
		
		System.out.print(sb);
		
		
	}

}
