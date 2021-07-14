package Assignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution01 {

	public static void main(String[] args)throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a 3 digit number to check if it's Armstrong: ");
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int temp = n;
        while( n!=0 )
        {
            int x = n%10;
            sum += Math.pow(x, 3);
            n = n/10;
        }

        if( sum == temp) {
            System.out.println("ARMSTRONG");
        } else {
            System.out.println("NOT ARMSTRONG");
        }
    }

}
