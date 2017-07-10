package JavaExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

/**
 * Created by ericcalabrese on 7/10/17.
 */
public class CalculateAge {
    public static void main( String[] args ) {
        System.out.println( "This program accepts date of birth and calculates age" );
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( isr );
        String input;
        try {
            System.out.println("Enter Year of Birth (> 1900, Enter four digits): ");
            input = br.readLine();
            int year = Integer.parseInt( input );
            System.out.println("Enter Month of Birth (1-12) : ");
            input = br.readLine();
            int month = Integer.parseInt( input );
            System.out.println("Enter day of birth ( 1- 31 ): ");
            input = br.readLine();
            int day = Integer.parseInt( input );

            System.out.println( "Date of Birth (mm-dd-yyyy) : " + month + " - " + day + " - " + year );
            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.of(year, month, day);
            Period period = Period.between( birthday, today );
            System.out.println( "Age: "
                    + period.getYears() + " years "
                    + period.getMonths() + " months and "
                    + period.getDays() + " days ");

        }
        catch( Exception ex ) {
            System.out.println( ex.getMessage() );
            ex.printStackTrace();
        }
    }
}
