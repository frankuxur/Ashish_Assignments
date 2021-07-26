package Assignment02;

abstract class Country { // 'abstract class Country' cannot be 'private abstract class Country' or be declared as final(as it final classes cannot be extended)
	abstract void continent();
}

class Norway extends Country {
	void continent() {
		System.out.print("Europe");
	}
}


public class solution04d_e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country obj = new Norway();
		obj.continent();
		
	}

}