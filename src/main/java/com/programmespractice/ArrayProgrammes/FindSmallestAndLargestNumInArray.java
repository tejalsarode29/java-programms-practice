package com.programmespractice.ArrayProgrammes;
// 1] take two variables min and max and assign it to arr[0]

// I have solve this program with the help of method and without method

public class FindSmallestAndLargestNumInArray {

    public static int[] FindSmallestAndLargestNumber(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[] { min, max };
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 9, 8, 5, 2 };
        int[] result = FindSmallestAndLargestNumber(arr);
        System.out.println("Smallest Element :" + result[0]);
        System.out.println("Largest Number :" + result[1]);

        // Without Method

        int[] SmallAndLargeNum = { 10, 12222, 666, 899, 466, 78, 5 };

        int large = SmallAndLargeNum[0];
        int small = SmallAndLargeNum[0];

        for (int i = 0; i < SmallAndLargeNum.length; i++) {
            if (SmallAndLargeNum[i] < small) {
                small = SmallAndLargeNum[i];
            } else if (SmallAndLargeNum[i] > large) {
                large = SmallAndLargeNum[i];
            }
        }

        System.out.println("Smallest Number in Array :" + small);
        System.out.println("Largest Number in Array :" + large);

    }
}
