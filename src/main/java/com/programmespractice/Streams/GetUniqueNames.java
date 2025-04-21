package com.programmespractice.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetUniqueNames {

    //get the unique names of the person whose age is greater then 25
    public static void main(String[] args) {
      List<Person> list = Arrays.asList(new Person(1, "Tejal", 20), 
      new Person(2, "Kajal", 27),
      new Person(3, "Gaurav", 32));

     for (int i = 0; i < list.size(); i++) {
        List<String> newList=new ArrayList<>();
        if (list.get(i).getAge()>25) {
            newList.add(list.get(i).getName().toUpperCase());
        }
    System.out.println(newList);

        }



        List<String> lStrings = list.stream().filter(person->person.getAge()>25). //filtering the names which age is greater thean25
        map(person->person.getName().toUpperCase())// Strems<person> to Strem<name> and uppercase
        .distinct() //gives only unique
        .collect(Collectors.toList());
        System.out.println(lStrings);

        
         
     }

     
         
    }

