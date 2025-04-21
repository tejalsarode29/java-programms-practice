package com.programmespractice.ArrayProgrammes;
// input int[] num = {1,3,4,5} 
// output = 2

//steps
//1] find num by using num= arr.length + 1
//2] calculate sum of the array by using this formula- int sum = (num*(num+1))/2
//3] apply for loop and subtract arr[i] from sum
public class FindMissingNumInArray {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,7,2};  //2 is  missing
        int n = array.length+1;   //4+1 n=5
        int sum = (n*(n+1))/2 ;   //sum =15

        for (int i = 0;i<array.length;i++){
            sum=sum-array[i];                
        }

        System.out.println("missing number:"+sum);

    }
}
