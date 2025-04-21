package com.programmespractice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Que2 {
    public static void main(String[] args) {
        
    
    List<Person> list = Arrays.asList(new Person(1, "Gaurav", 28),new Person(2, "Kajal", 27),new Person(3, "Tejal", 25));
    Person filterList = list.stream().filter(x->"Tejal".equals(x.getName()) && x.getAge()==25).findAny().orElse(null);
    System.out.println(filterList);
    }
    
}
