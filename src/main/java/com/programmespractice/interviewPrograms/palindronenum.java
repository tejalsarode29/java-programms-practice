package com.programmespractice.interviewPrograms;

import java.util.Scanner;

public class palindronenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int num = sc.nextInt();
        int reversedNum = 0;
        int r;
        int originalNum = num;


        while (num>0) {
            r = num%10;
            reversedNum = reversedNum*10+r;
            num= num/10;
            
        }

        if (originalNum == reversedNum) {
            System.out.println("This num is Palindrome :" +reversedNum);
        } else {
            System.out.println("This num is not Palindrome :"+reversedNum);
        }
    }
}
