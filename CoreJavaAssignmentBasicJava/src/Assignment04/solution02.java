package Assignment04;

import java.util.*;

public class solution02 {

	interface print {
		void display(Orders obj);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Orders> list = new ArrayList<>();
		

		Orders one = new Orders("mirror", 12000, "COMPLETED");
		Orders two = new Orders("chair", 1000, "PENDING");
		Orders three = new Orders("table", 90000, "ACCEPTED");
		Orders four = new Orders("phone", 40000, "PENDING");
		Orders five = new Orders("mouse", 1000, "ACCEPTED");
		Orders six = new Orders("keyboard", 1000, "PENDING");
		Orders seven = new Orders("monitor", 20000, "ACCEPTED");
	
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		list.add(five);
		list.add(six);
		list.add(seven);
		
		
		print MyLambda = obj -> System.out.println(obj.item);
		
		for(Orders obj: list) {
			if(obj.price>10000 && (obj.status.equals("COMPLETED") || obj.status.equals("ACCEPTED"))) {
				MyLambda.display(obj);
			}
		}
	}

}

class Orders {
	String item, status;
	int price;
	
	Orders(String item, int price, String status) {
		this.item = item;
		this.price = price;
		this.status = status;		
	}
	
}