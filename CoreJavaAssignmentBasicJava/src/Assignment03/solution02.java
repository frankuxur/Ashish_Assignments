package Assignment03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class solution02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> hash = new HashSet<>();
		
		hash.add(89);
		hash.add(45);
		hash.add(21);
		hash.add(66);
		
		System.out.println("Unordered Set: ");
		System.out.println(hash);
		
		Set<Integer> linkedHash = new LinkedHashSet<>();
		
		linkedHash.add(89);
		linkedHash.add(45);
		linkedHash.add(21);
		linkedHash.add(66);
		
		System.out.println("\nOrdered Set: ");
		System.out.println(linkedHash);
	}

}
