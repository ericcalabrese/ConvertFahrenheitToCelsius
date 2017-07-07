package com.company;

/**
 * Created by ericcalabrese on 7/7/17.
 */
public class SwapFirstNameLastName {
    public static void main ( String[] args ) {
        String name = "Will Smith";
        System.out.println( "Name before Swap: " + name );
        String firstName = name.substring( 0, name.indexOf( " " ) );
        String lastName = name.substring( name.indexOf( " " ) );
        String swappedName = lastName + ", " + firstName;
        System.out.println( "Swapped Name: " + swappedName );
    }
}
