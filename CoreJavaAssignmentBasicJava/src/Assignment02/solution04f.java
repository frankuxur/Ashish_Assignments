package Assignment02;

abstract class asset {
	void type() { // an abstract class can be abstract without any abstract method
		System.out.print("Laptop");
	}

}

class Laptop extends asset {
	
}


public class solution04f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asset obj = new Laptop();
		obj.type();
		
	}

}
