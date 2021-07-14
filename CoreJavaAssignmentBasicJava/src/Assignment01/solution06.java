package Assignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution06 {
    public static void main(String[] args)throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String user_id = "test";
        String password = "test";

        byte i=0;
        
        for ( i=0 ; i<3 ; i++ ) {

            System.out.print("Enter User ID: ");
            String enteredUserID = br.readLine();

            System.out.print("Enter Password: ");
            String enteredPassword = br.readLine();

            if ( enteredUserID.equals(user_id) && enteredPassword.equals(password) ) {
                System.out.println("Welcome " + user_id);
                break;
            } else {
                System.out.println("Incorrect UserID/Password, " + (2-i) + " tries left.");
            }
        }
        
        if( i==3 )
        	System.out.println("Contact Admin");
    }
}
