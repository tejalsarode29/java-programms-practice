package com.programmespractice.interviewPrograms;

import java.util.Scanner;


public class PrimeNumbers 
{

    public static boolean PrimeNum( int num){
            
        for(int i=2;i<=num/2;i++){    
            if (num % 2 == 0) {
                return false; 
                
            } 
        }
                return true; //num is prime

    }
    public static void main( String[] args )
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number");
            int num = sc.nextInt();

            if (PrimeNum(num)) {
                System.out.println("This is prime");
            } else {
                System.out.println("this is not prime");
            }
        }
        System.out.println( "Hello World!" );
    }
}
