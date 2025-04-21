package com.programmespractice.Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertArrayToStreamsViceVersa {


    
    public static void main(String[] args) {
        String[] array = {"Tejal" , "Gaurav" ,"Kajal","Sohamaa"};
        Stream<String> stream = Arrays.stream(array); //convert array to stream
        Stream<String> stream2 = stream.map(e->e.toUpperCase());
        String[] arrStrings =     stream2.toArray(String[]::new); //convert from stream to array ot strings
        for (String string : arrStrings) {
            System.out.println(string);
        }
        System.out.println("---------------------------------------------------------------");

        //How to filter strings longer than 4 character
        String[] strings = Arrays.stream(array).filter(e->e.length()>5).toArray(String[]::new);
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        //we can perfom sum,min,max,count,average
        int[] arraynum = {1,2,3};
        int num = Arrays.stream(arraynum).sum();
        System.out.println(num);

        System.out.println("---------------------------------------------------------------");
        //using reduce method how to concenate two strings
        String[] stringarray = {"Tejal" ,"Talele", "Gaurav" ,"Kajal","Sohamaa"};
        String string = Arrays.stream(stringarray).reduce(" ",(a,b)->a+b);
        System.out.println(string);


        
    }
}