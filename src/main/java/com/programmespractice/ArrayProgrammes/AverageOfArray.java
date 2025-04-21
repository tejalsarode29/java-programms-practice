package com.programmespractice.ArrayProgrammes;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] num = {10,20,30};
        int sum =0;
        for (int i =0 ; i<num.length ; i++){
             sum += num[i];
        }

        System.out.println(sum);
        System.out.println(sum/num.length);
    }
}
