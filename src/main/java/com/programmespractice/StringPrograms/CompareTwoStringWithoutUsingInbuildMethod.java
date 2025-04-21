package com.programmespractice.StringPrograms;

import java.util.Scanner;

public class CompareTwoStringWithoutUsingInbuildMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String :");
        String str1=sc.nextLine();
        System.out.println("enter second string :");
        String str2 = sc.nextLine();

        boolean isComapare = false;

       for(int i= 0 ;i<str1.length();i++){
        if (str1.charAt(i) == str2.charAt(i)) {
            
        } else {
            
        }
       }
        System.out.println("Comparison status :" + isComapare);

       System.out.println(str1.equals(str2));
    }
}
