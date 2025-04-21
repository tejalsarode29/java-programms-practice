package com.programmespractice.ArrayProgrammes;

import java.util.Arrays;

public class CountEvenOddNumbers {

    public static void main( String[] args )
    { 
        int[] inputArr = new int[] { 1,2,3,4,5,6,7,8,9 };

        // Approach 1
        int evenCount = 0;
        int oddCount = 0;

        // for (int i = 0; i < inputArr.length; i++) {
        //     if (inputArr[i] % 2 == 0) {
        //         evenCount++;
        //     } else {
        //         oddCount++;
        //     }
        // }
        System.out.println("Even Count " + evenCount);
        System.out.println("Odd Count " + oddCount);

        // Approach 2: 
        long evenCount1 = Arrays.stream(inputArr)
              .filter(num -> num % 2 == 0)
              .count();

        long oddCount1 = Arrays.stream(inputArr)
              .filter(num -> num % 2 != 0)
              .count();

        System.out.println("Even Count " + evenCount1);
        System.out.println("Odd Count " + oddCount1);

        //Approch 3
        for(int i = 0 ; i<inputArr.length; i++){
            if (inputArr[i] % 2 ==  0 ) {
                evenCount = evenCount+1;
            } else {
                oddCount = oddCount+1;
            }
        }


        System.out.println("Even Count " + evenCount);
        System.out.println("Odd Count " + oddCount);

        for(int i = 0 ;i<inputArr.length;i++){
            if (inputArr[i] % 2 == 0) {
                System.out.println("Even Index Of " + i +":" + inputArr[i]);
            } else {
                System.out.println("Odd Index Of "+ i +" :"+inputArr[i]);
            }
        }


    }
    
}
