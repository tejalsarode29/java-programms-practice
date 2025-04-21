package com.programmespractice.interviewPrograms;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter num");
            int num = sc.nextInt();
            int rev = 0;
             int r;
            

            while (num>0) {
                r = num%10;
                rev = rev*10+r;
                num=num/10;
            }


            System.out.println("Reverse"+rev);
        }
    }
}
