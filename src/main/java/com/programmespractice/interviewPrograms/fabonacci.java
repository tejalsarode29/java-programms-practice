package com.programmespractice.interviewPrograms;

import java.util.Scanner;

//input num 6 ; Output = 0 1 1 2 3 5
public class fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        int next ; 
        System.out.println("Fabonnachii series is :"+first);
       
        for(int i = 0 ; i <= num ; i++){
            System.out.println("fabonacci series  :"+first);
            next = first + second;
            first =second;
            second = next;
        }

    }
    
}
