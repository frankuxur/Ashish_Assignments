package Assignment04;

import java.util.ArrayList;
import java.util.function.Consumer;

public class solution08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(45);
		list.add(33);
		list.add(77);
		
		
		
		Thread myThread = new Thread(() -> System.out.println(list));
		
		Consumer<Thread> con = x -> x.run(); 
		con.accept(myThread);
			
	}

}
