package com.programmespractice.interviewPrograms;

import java.util.Scanner;
//factorial num = 5*4*3*2*1=120
public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number");
            int num = sc.nextInt();

            int factorial = 1;
            
            for(int i = num ; i>=1 ; i--){
                factorial = factorial*i; 
            }
        }
        
    }
}
