package Assignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution07 {
    public static void main(String[] args)throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];

        for( int i=0 ; i<15 ; i++ ) {
            int randomNo = (int) Math.ceil(Math.random() * 20);
            array[i] = randomNo;
            // System.out.println(random);
        }

        System.out.print("Enter a number to check it's presence in a random array: ");
        int n = Integer.parseInt(br.readLine());

        boolean x = false;

        for ( int i=0 ; i<15 ; i++ ) {
            if ( array[i] == n ) {
                System.out.println(n + " found at position " + (i+1));
                x = true;
                break;
            }
        }

        if (!x) {
            System.out.println(n + " not found :/ ");
        }

        for ( int i=0 ; i<15 ; i++ ) {
            System.out.print(array[i]+ "\t");
        }

    }
}

