package Assignment02;

abstract class Animal { 
	abstract void color();
}

class Cat extends Animal {
	void color() {
		System.out.print("Black");
	}
}


public class solution04b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Cat(); // abstract class cannot be instantiated, it should be 'Car obj = new Maruti800();'
		obj.color();
		
	}

}
