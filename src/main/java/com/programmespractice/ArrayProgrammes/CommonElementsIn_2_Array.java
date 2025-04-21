package com.programmespractice.ArrayProgrammes;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsIn_2_Array {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {4,5,6,7};

        Set<Integer> set = new HashSet<>();
        Set<Integer> commIntegers =new HashSet<>();

       for(int num : array1){
        set.add(num);
       }
       System.out.println(set);

       for(int num : array2){
        if (set.contains(num)) {
            commIntegers.add(num);
        }
       }

       System.out.println("CommonElements in both the array are :"+commIntegers);
    }
}
