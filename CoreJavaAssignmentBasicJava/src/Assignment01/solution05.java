package Assignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution05 {
    public static void main(String[] args)throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter CTC to check applicable income tax: ");
        float ctc = Float.parseFloat(br.readLine());

        System.out.print("Income Tax: ");
        if ( ctc>=0 && ctc<180001 ) {
            System.out.print(0);
        } else if ( ctc>18000 && ctc<300001 ) {
            System.out.println(ctc * 10 / 100);
        } else if ( ctc>300000 && ctc<500001 ) {
            System.out.println(ctc * 20 / 100);
        } else if ( ctc>500000 && ctc<1000001 ) {
            System.out.println(ctc * 30 / 100);
        } else {
            System.out.println("INVALID");
        }



    }
}
