package com.programmespractice.StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

//str1 = talent & str2 = latent then they are equals
//1] convert it into array
//2] sort by using arrays.sort method
//3] check if it is equal by arryas.equals() method 
//4 if they are equal then it is anagrams


public class StringsAreAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.nextLine();
        System.out.println("Enter Secong string");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Length are not equals");
        } else {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)) {
                System.out.println("Strings are angrams");
            } else {
                System.out.println("Strings are not anagrams");
            }
        }


        
        }

   
    }
    

