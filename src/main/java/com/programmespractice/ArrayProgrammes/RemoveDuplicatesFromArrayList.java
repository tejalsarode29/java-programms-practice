package com.programmespractice.ArrayProgrammes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Tejal");
        list.add("Gaurav");
        list.add("Prathmaa");
        list.add("Kajal");
        list.add("Kajal");
        Collections.sort(list);
        System.out.println("Arraylist with duplicates:"+list);

        Set set = new HashSet<>(list); // converting list to set

        // Their is no way to sort the elements in the hasset. 
        //convert it into the set into list and then sort the elements using Collections.sort() Method.
        List list2 = new ArrayList<>(set);  
        Collections.sort(list2);
        System.out.println("ArrayList Without Duplicates :" + list2);
            
        }

    }

