package com.programmespractice.ArrayProgrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckIFDuplicatesAvailableOrNotinArray {
    public static void main(String[] args) {
        String[] str = {"Java" ,"C","c++", "Java"};

        List list = Arrays.asList(str);   //converting Array into Arraylist

        Set set = new HashSet<>(list);  // Put list into set For converting list into set 
        
        if (list.size() == set.size()) { 
            System.out.println("Array does not contain  duplicates");
        } else {
            System.out.println("Array contain duplicates");
        }
    }
}
