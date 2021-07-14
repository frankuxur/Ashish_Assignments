package Assignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution09 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // write your code here
        int[][] students = new int[3][3];
        String[] sub = {"A", "B", "C"};

        for ( int i=0 ; i<3 ; i++ ) {
            System.out.println("Enter marks of subjects A, B and C for Student_" + (i+1) + ": ");

            for ( int j=0 ; j<3 ; j++ ) {
                students[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("\n");

        System.out.println("Total And Average scored of each Student: ");

        for ( int i=0 ; i<3 ; i++ ) {
            System.out.println("Student_" + (i+1) + ": ");

            int total = 0;
            for ( int j=0 ; j<3 ; j++ ) {

                total += students[i][j];

            }

            System.out.println("Total Score: " + total);
            System.out.println("Average Score: " + total/3 + "\n");
        }

        System.out.println("\n");

        System.out.println("Total And Average scored by students in each Subject: ");

        for ( int i=0 ; i<3 ; i++ ) {
            System.out.println("Subjects " + sub[i] + ": ");

            int total = 0;
            for ( int j=0 ; j<3 ; j++ ) {

                total += students[j][i];

            }

            System.out.println("Total Score: " + total);
            System.out.println("Average Score: " + total/3 + "\n");
        }

    }
}
