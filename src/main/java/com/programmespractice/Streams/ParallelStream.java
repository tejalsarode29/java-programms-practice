package com.programmespractice.Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        int[] array = {1,2,3,6,4,10,5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 ==0) {
            System.out.println(array[i]);
                
            }
        }

        
    }
}
