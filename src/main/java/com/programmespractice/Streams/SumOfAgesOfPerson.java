package com.programmespractice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


//sum of ages of person whose age is greater then 20
public class SumOfAgesOfPerson {
    public static void main(String[] args) {
         List<Person> list = Arrays.asList(new Person(1, "Tejal", 20), 
      new Person(2, "Kajal", 27),
      new Person(3, "Gaurav", 32),
      new Person(4, "Prathmaa", 28));

      int integer = list.stream().filter(person->person.getAge() > 20).map(Person::getAge).reduce(0, (sum,age) -> sum + age);
      System.out.println(integer);

      Integer integer2 = list.stream().filter(person->person.getAge()>20).map(Person::getAge).reduce(Integer::sum).get();
      System.out.println(integer2);

    }
}
