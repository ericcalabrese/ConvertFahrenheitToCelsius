package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by ericcalabrese on 7/6/17.
 */
public class ConvertCelsiusToFahrenheit{
    public static void main( String[] args ) {
        System.out.println( "This program will convert temperature in Celcius to Fahrenheit " );
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( isr );
        String input;
        try {
            System.out.println("Enter temperature in Celsius : ");
            input = br.readLine();
            float tempC = Float.parseFloat( input );
            float tempF = tempC * 9 / 5 + 32 ;
            DecimalFormat decFormat = new DecimalFormat( "0.00" );
            System.out.print( "Temperature in Fahrenheit : " + decFormat.format( tempF ));
        }
        catch( Exception ex ) {
            System.out.println( ex.getMessage() );
            ex.printStackTrace();
        }
    }

}
