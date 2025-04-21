package com.programmespractice.interviewPrograms;

public class SumOfDigit {

    // input = 123 output = 6
    public static void main(String[] args) {
        int number = 123;
        int sum =0;
        while (number>0) {
            int digit = number%10;
             sum = sum + digit;
             number = number/10;

            
        }

        System.out.println("Sum of the Number is:"+sum);

    }
}
