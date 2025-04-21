package com.programmespractice.StringPrograms;
// input str1 = "111" str2="222" = output="333"
public class AddTwoStrings {
    public static void main(String[] args) {
        String str1 = "111";
        String str2 = "222";

        int str3 = Integer.parseInt(str1);
        int str4 = Integer.parseInt(str2);

        int sum = str3 + str4 ;
        System.out.println("Sum of the two strings are :" + sum);
    }
}
