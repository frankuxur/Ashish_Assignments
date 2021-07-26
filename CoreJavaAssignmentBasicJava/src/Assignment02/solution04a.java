package Assignment02;

abstract class Car { // class Car should be 'abstract class Car'
	abstract void color();
}

class Maruti800 extends Car {
	void color() {
		System.out.print("Red");
	}
}


public class solution04a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Maruti800();
		obj.color();
		
	}

}
