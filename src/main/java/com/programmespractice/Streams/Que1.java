package com.programmespractice.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// How to filter the list of names
public class Que1 {

    private static List<String> getFilterOutput(List<String> namesList , String filter){
        List<String> filterList = new ArrayList<>();
        for (String string : namesList) {
            if (string.startsWith(filter)) {
                filterList.add(string);
            } 
        }
        return filterList;
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Tejal","Gaurav","Prathmaa","TTTTTTajal");
        // System.out.println(Que1.getFilterOutput(list, "G"));
        // System.out.println(list);

        //using stream;
        List<String> list2 = list.stream().filter(names -> names.startsWith("T")).collect(Collectors.toList());
        list2.forEach(System.out::println);

        //convert list into stream 
        //filter it by giving the cinditions
        //collect output usting collect//convet it stream into list by collectors.toList() method

        String str1 = "Java";  
        String string="Java";
        String str2 = new String("Java");
        System.out.println(str1==string);
        System.out.println(10+20+"Java"+10+20);

        
       
    }
}
