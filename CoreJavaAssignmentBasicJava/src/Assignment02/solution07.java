package Assignment02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class DessertItem {
	abstract void getCost();
}

class Candy extends DessertItem {
	void getCost() {
		System.out.println("Candy: Rs.120");
	}
}

class Cookie extends DessertItem {
	void getCost() {
		System.out.println("Cookie: Rs.140");
	}
}

class IceCream extends DessertItem {
	void getCost() {
		System.out.println("IceCream: Rs.180");
	}
}




public class solution07 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DessertItem obj1 = new Candy();
		DessertItem obj2 = new Cookie();
		DessertItem obj3 = new IceCream();
		
		String[] storage = new String[30];
		
		System.out.println("Press O -- Owner\nPress C -- Customer");
		String s = br.readLine();
		
		switch(s) {
			case "O": {
				System.out.println("Press:\n1 -- to store Candy\n2 -- to store Cookie\n3 -- to store IceCream ");
				byte x = Byte.parseByte(br.readLine());
				int c = 0;
				switch(x) {
					case 1: {
						storage[c] = "Candy";
						c++;
						break;
					}
					case 2: {
						storage[c] = "Cookie";
						c++;
						break;
					}
					case 3: {
						storage[c] = "IceCream";
						c++;
						break;
					}
					default: 
						System.out.println("Invalid Entry");
				}
				break;
			}
			case "C": {
				System.out.println("Press:\n1 -- to order Candy\n2 -- to order Cookie\n3 -- to order IceCream ");
				byte x = Byte.parseByte(br.readLine());
				switch(x) {
					case 1: {
						obj1.getCost();
					}
					case 2: {
						obj2.getCost();
					}
					case 3: {
						obj3.getCost();
					}
				}
				break;
			}
			default: 
				System.out.println("Invalid Entry");
		}
	}

}
