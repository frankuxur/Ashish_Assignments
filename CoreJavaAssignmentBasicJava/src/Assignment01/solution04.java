package Assignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution04 {
    public static void main(String[] args)throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the marks of 3 subjects: ");
        float s1 = Float.parseFloat(br.readLine());
        float s2 = Float.parseFloat(br.readLine());
        float s3 = Float.parseFloat(br.readLine());

        int count = 0;

        if ( s1>60 ) {
            count++;
        }
        if ( s2>60 ) {
            count++;
        }
        if( s3>60 ) {
            count++;
        }

        if( count==3 ) {
            System.out.println("PASSED");
        } else if ( count==2 ) {
            System.out.println("PROMOTED");
        } else {
            System.out.println("FAILED");
        }

    }
}
