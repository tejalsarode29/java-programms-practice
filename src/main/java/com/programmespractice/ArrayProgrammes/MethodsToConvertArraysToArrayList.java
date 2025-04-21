package com.programmespractice.ArrayProgrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//their are two methods to convert array to arrayList
//1] = Arrays.asList(" Array Refferance Var")
//2] = Collections.addAll(aarayList refferVar , Array Refferance Var )


public class MethodsToConvertArraysToArrayList {
    public static void main(String[] args) {
        String[] colours = {"REd" , "Blue" ,"Orange","Yellow"};
        List list = Arrays.asList(colours);

        System.out.println(list);

        List<String> l =new ArrayList<>();
        Collections.addAll(l, colours);
        System.out.println(l);


    }
}
