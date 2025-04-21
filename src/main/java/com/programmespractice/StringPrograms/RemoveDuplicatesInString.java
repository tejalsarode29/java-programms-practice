package com.programmespractice.StringPrograms;

import java.util.HashSet;
import java.util.Set;

// Pring the string by removing the duplicates
public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String str = new String("ABCABCCDR");

        //covert it into hasset 
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i<str.length() ; i++){
         set.add(str.charAt(i));

        }

        StringBuilder sb2 = new StringBuilder(); 
        //is used to store the result  and convert from hasset into string

        
        for (Character ch : set){
            sb2.append(ch);

        }
        System.out.println(sb2);
        
    }
}
