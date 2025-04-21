package com.programmespractice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStreanOfPersonTostring {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person(1, "Tejal", 23), new Person(2, "Kajal", 27),new Person(3, "Gaurav", 32));
        //convert ListOFPerson to String

        // map method convert stream of person to list
        // findAny method returns optional
        String personList = list.stream().filter(x->"Tejal".equals(x.getName())).map(Person::getName).findAny().orElse(null);
        System.out.println(personList);
    }
}
