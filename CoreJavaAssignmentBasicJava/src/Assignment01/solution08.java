package Assignment01;

import java.io.IOException;

public class solution08 {
    public static void main(String[] args)throws IOException {
        // write your code here
        int[] array = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};

        System.out.println("Unsorted Array: ");

        for ( int i=0 ; i<array.length ; i++ ) {
            System.out.print(array[i] + "\t");
        }

        for ( int i=0 ; i<15-1 ; i++) {
            for ( int j=0 ; j<15-i-1 ; j++) {
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("\n\nSorted Array: ");

        for ( int i=0 ; i<array.length ; i++ ) {
            System.out.print(array[i] + "\t");
        }

    }
}

