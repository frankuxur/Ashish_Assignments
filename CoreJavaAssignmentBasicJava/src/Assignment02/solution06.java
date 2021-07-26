package Assignment02;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

abstract class Persistence { 
	abstract void persist();
}

class FilePersistence extends Persistence {
	void persist() {
		System.out.println("file");
	}
}

class DatabasePersistence extends Persistence {
	void persist() {
		System.out.println("database");
	}
}

public class solution06 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Press 1 to save data in file and 2 to save in database: ");
		byte i = Byte.parseByte(br.readLine());
		
		Persistence p;
		
		if ( i==1 ) {
			p = new FilePersistence();
			p.persist();
		}
		
		else if ( i==2 ) { 
			p = new DatabasePersistence();
			p.persist();
		}
		 
		else { 
			System.out.println("INVALID");
		}
	}

}
