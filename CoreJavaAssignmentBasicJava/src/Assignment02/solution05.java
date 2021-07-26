package Assignment02;

abstract class Shape {
	abstract void draw();
}

class Line extends Shape {
	void draw() {
		System.out.println("drawing a line");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing a rectangle");
	}
}

class Cube extends Shape {
	void draw() {
		System.out.println("drawing a cube");
	}
}




public class solution05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape obj1 = new Line();
		obj1.draw();
		Shape obj2 = new Rectangle();
		obj2.draw();
		Shape obj3 = new Cube();
		obj3.draw();
	}

}
