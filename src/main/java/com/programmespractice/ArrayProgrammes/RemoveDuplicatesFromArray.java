package com.programmespractice.ArrayProgrammes;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] num = {5,2,9,1,6,2,5};
        Set set = new HashSet<>();

        for (int numbers : num) {
            set.add(numbers);
        }

        System.out.println("Array with duplicates remove :" +set);
    }
}
