package com.programmespractice.interviewPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
     // armstrong number 153 = 1*1*1+5*5*5+3*3*3 

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number");
            int num = sc.nextInt();

            int d = num ;
            int arm =0;
            while (num>0) {
                int r  = num%10;
                num= num/10;
                arm = arm + r*r*r;
                
                
            }
            if (arm == d) {
                System.out.println("This is armstrong number");
            } else {
                System.out.println("this is not armstrong number");
            }
        }

    }
}