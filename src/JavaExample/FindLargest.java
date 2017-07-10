package JavaExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ericcalabrese on 7/10/17.
 */
public class FindLargest {
    public static void main( String[] args ) {
        System.out.println( "This program will find the largest of the three numbers " );
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( isr );
        String input;
        try {
            System.out.println("Enter Number1 : ");
            input = br.readLine();
            float num1 = Float.parseFloat( input );
            System.out.println("Enter Number2: ");
            input = br.readLine();
            float num2 = Float.parseFloat( input );
            System.out.println("Enter Number3: ");
            input = br.readLine();
            float num3 = Float.parseFloat( input );
            System.out.println( "Numbers Entered:  " + num1 + "  " + num2 + "  " + num3 );

            float largest = num1;
            if ( num2 > largest ) {
                largest = num2;
            }
            if ( num3 > largest ) {
                largest = num3;
            }

            System.out.println( "Largest : " + largest );
        }
        catch( Exception ex ) {
            System.out.println( ex.getMessage() );
            ex.printStackTrace();
        }
    }
}

