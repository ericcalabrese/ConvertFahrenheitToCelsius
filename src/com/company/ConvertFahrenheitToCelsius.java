package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by ericcalabrese on 7/6/17.
 */
public class ConvertFahrenheitToCelsius {
    public static void main( String[] args ) {
        System.out.println( "This program will convert temperature in Fahrenheit into Celsius " );
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( isr );
        String input;
        try {
            System.out.println("Enter temperature in Fahrenheit : ");
            input = br.readLine();
            float tempF = Float.parseFloat( input );
            float tempC = (tempF-32)*5/9 ;
            DecimalFormat decFormat = new DecimalFormat( "0.00" );
            System.out.print( "Temperature in Celsius : " + decFormat.format( tempC ));
        }
        catch( Exception ex ) {
            System.out.println( ex.getMessage() );
            ex.printStackTrace();
        }
    }
}
