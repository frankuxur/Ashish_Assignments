package Assignment04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution01 {

	interface calculate {
		double cal(double a, double b, int c);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1--add, 2--sub, 3--multiply, 4--divide");
		int c = Integer.parseInt(br.readLine());
		
		System.out.print("Enter 2 numbers: ");
		double a = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		
		
		calculate myLambda = (double x, double y, int z) -> {
			if(z==1) {
				return x+y;
			} else if(z==2){
				return x-y;
			} else if(z==3) {
				return x*y;
			} else if(z==4) {
				return x/y;
			} else {
				return 0;
			}
		};
		
		System.out.println(myLambda.cal(a, b, c));
	}

}
