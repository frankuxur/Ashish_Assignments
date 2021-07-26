package Assignment04;

import java.util.*;

public class solution04 {

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
		
		list.removeIf(name -> ( name.length()%2 !=0 ) );
		
		for( String x: list ) {
			System.out.println(x);
		}
	}

}
