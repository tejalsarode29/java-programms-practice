package com.programmespractice.ArrayProgrammes;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastElementInArrayList {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();

        arrList.add("Mango");
        arrList.add("Kiwi");
        arrList.add("Orange");
        arrList.add("Pinaple");
        arrList.add("Apple");

        String firstElement = arrList.get(0);
        String LastElement = arrList.get(arrList.size()-1);

        System.out.println("FirstElement:"+firstElement);
        System.out.println("LastElement : "+LastElement);
    }

}
