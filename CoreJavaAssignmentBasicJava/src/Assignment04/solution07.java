package Assignment04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;


public class solution07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		HashMap hm = new HashMap();

	      // Put elements to the map
	      hm.put("First", 34);
	      hm.put("Second", 12);
	      hm.put("Third", 18);
	      hm.put("Fourth", 22);
	      hm.put("Fifth", 8);
	      
	      // Get a set of the entries
	      Set set = hm.entrySet();
	      
	      // Get an iterator
	      Iterator i = set.iterator();
	     
	      // Display elements 
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         
//	         System.out.print(me.getKey() + ": ");
//	         System.out.println(me.getValue());
	         
	         sb.append(me.getKey() + ": " + me.getValue() + " ");
	      }
	      System.out.println(sb);
	}

}
