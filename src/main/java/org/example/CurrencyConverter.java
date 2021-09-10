package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class CurrencyConverter
{
    public static void main( String[] args )
    {
        // Program calculating the exchange from euros to dollars
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double num_euros = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        double exchange_rate = input.nextDouble();

        double dollars = num_euros * exchange_rate;
        dollars = Math.round(dollars * 100.0) / 100.0;

        System.out.println(num_euros + " euros at an exchange rate of " + exchange_rate + " is " + dollars + " U.S. dollars.");
    }
}
