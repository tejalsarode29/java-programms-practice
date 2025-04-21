package com.programmespractice.StringPrograms;

import java.util.HashSet;
import java.util.Set;

//String : Learn Java Programming         Output=a-4 ,g=2 ,m-2 , n-2 ,r-3 
public class PrintDuplicateCharactersINString {
    public static void main(String[] args) {
        String str = new String("abcabb");
        int count = 0;
        char[] ch = str.toCharArray(); //{a,b,c,a,b,b}
        for(int i =0 ; i<ch.length ; i++){
            for(int j = i+1 ;j<ch.length ;j++){
                if (ch[i] == ch[j]) {
                    System.out.println("Duplicate characters are : "+ ch[i]);
                    count=count +1;
                    
                }

            }
        }
        
        System.out.println("Duplicate characters count :"+count);

    }
}
