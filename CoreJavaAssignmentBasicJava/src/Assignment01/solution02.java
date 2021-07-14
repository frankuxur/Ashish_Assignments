package Assignment01;

public class solution02 {

	public static void main(String[] args) {
		
        for ( int n=100 ; n<1000 ; n++) {
            int sum = 0;
            int temp = n;
            while( n!=0 )
            {
                int x = n%10;
                sum += Math.pow(x, 3);
                n = n/10;
            }

            if( sum == temp) {
                System.out.println(temp);
            }

            n = temp;
        }

    }


}
