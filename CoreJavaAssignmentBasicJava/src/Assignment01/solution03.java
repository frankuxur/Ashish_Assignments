package Assignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution03 {
	public static void main(String[] args)throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Principal, Rate and Time to calculate Simple and Compound Interest : ");
        float p = Float.parseFloat(br.readLine());
        float r = Float.parseFloat(br.readLine());
        float t = Float.parseFloat(br.readLine());

        float s = ( p * r * t ) / 100;
        var ci = p * (Math.pow(( 1 + (r/100) ), t) - 1);
        System.out.println("Simple Interest: " + s + "\nCompound Interest: " + ci);
    }

}
