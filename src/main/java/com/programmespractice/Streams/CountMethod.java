package com.programmespractice.Streams;

import java.util.Arrays;
import java.util.List;

public class CountMethod {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person(1, "Tejal", 23), 
                                        new Person(2, "Kajal", 27),
                                        new Person(3, "Gaurav", 32));
        long count = list.stream().filter(x-> x.getAge() >23).count();
        System.out.println(count);
    }    
}
