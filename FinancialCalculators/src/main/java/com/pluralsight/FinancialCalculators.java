package com.pluralsight;

import java.sql.SQLOutput;
import java.util.*;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println(" Enter loan amount: ");
        double principal = myScanner.nextDouble();

        System.out.println(" Enter your interest rate: ");
        double interestRate = myScanner.nextDouble();

        System.out.println(" Enter how many years your loan is: ");
        int loanLength = myScanner.nextInt();

        double monthlyRate = interestRate / 12;
        int payments = loanLength * 12;

        double monthlyPayment = principal * monthlyRate* (Math.pow( 1 + monthlyRate, payments )) / (Math.pow( 1 + monthlyRate, payments )) - 1 ;

        System.out.println(" Monthly payment: " + monthlyPayment);
        System.out.println(" Total interest: " + monthlyPayment * monthlyRate);




    }

}