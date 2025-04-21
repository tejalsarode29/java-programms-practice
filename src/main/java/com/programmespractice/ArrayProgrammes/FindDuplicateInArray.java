package com.programmespractice.ArrayProgrammes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//print duplicates
public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] inputArrayWithDupElements = {5,8,5,50,26,26,100,1001,5,120};
        Set nonDuplicates = new HashSet<>();
        Set Duplicates = new HashSet<>();

        for (int num : inputArrayWithDupElements) {
            if (!nonDuplicates.contains(num)) {
                nonDuplicates.add(num);
            } else {
                Duplicates.add(num);
            }
        }

        System.out.println("Duplicates Element:"+Duplicates);
        System.out.println("NonDuplicates Elements:"+nonDuplicates);
    }
}
