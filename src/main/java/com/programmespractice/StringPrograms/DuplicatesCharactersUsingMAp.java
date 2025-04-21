package com.programmespractice.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesCharactersUsingMAp {
    
    public static void main(String[] args) {
        String str = new String("abacccs");
        

       Map<Character , Integer> dupcharMap =new HashMap<>();
       char[] ch = str.toCharArray(); //a,b,a,c,c,c,s
       for(char keys : ch ){
        if (dupcharMap.containsKey(keys)) {
            dupcharMap.put(keys, dupcharMap.get(keys)+1);
        } else {
         dupcharMap.put(keys, 1);
        }

       }

       System.out.println("Duplicate Keys:"+dupcharMap);

    }
}
