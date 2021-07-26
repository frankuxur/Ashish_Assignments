package Assignment03;

import java.util.*;

public class solution03 {

	public static void main(String[] args)
    {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(21);
		num.add(4);
		num.add(76);
  
        ListIterator<Integer> i = num.listIterator();
  
        while (i.hasNext()) {
            i.next();
        }
  
        System.out.println("Backward Direction Iteration:");
        while (i.hasPrevious()) {
            System.out.println(i.previous());
        }
    }

}
