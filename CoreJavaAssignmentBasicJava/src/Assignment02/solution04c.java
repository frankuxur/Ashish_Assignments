package Assignment02;

abstract class Furniture { 
	abstract void color();
	abstract void price();
}

class Chair extends Furniture {
	// all methods from the abstract class must be overriden in its child class
	void color() {
		System.out.println("Brown");
	}
	
	void price() {
		System.out.print("Price: $10");
	}
}


public class solution04c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Furniture obj = new Chair(); 
		obj.color();
		obj.price();
		
	}

}