package com.programmespractice.ArrayProgrammes;
//  we have to find the index of the specified element in the array


public class SearchElementInAnArray {
    public static void main(String[] args) {
        
        int[] array ={1,5,6,8,9};
        int target = 8;
        int index = 0 ;

        for(int i = 0 ; i<array.length ;i++){
            if (array[i] == target) {
                index = i;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index :"+index);
        } else {
            System.out.println("Element Found at index :"+index);
        }
        





    }
}
