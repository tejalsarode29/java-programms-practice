package com.programmespractice.ArrayProgrammes;

import java.util.Scanner;

public class RevereseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0 ; i<size ; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("-----------------------------------------------");

        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }

        for(int i=array.length-1 ; i>=0 ; i--){
            System.out.println("Reverse Array :"+array[i]);
        }
    }
}
