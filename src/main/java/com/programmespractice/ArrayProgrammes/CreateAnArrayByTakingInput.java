package com.programmespractice.ArrayProgrammes;

import java.util.Scanner;

public class CreateAnArrayByTakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        
        int size = sc.nextInt();  //array size = 5

        int[] array = new int[size]; // put the size of the array and initialize it

        for (int i =0 ; i<size ;i++){
            array[i] = sc.nextInt();     //adding elements in the array
        }

        System.out.println("------------------------------------------------------");

        for(int i = 0 ; i<array.length;i++){
            System.out.println(array[i]);
        }

        
    }
    
}
