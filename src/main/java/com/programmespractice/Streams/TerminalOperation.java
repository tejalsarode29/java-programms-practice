package com.programmespractice.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TerminalOperation {
    // collect(),foreach(),count()
    public static void main(String[] args) {
        System.out.println("-----------------------collect------------------------");
        List<String> list = Arrays.asList("Tejal", "Prathmaa", "Chanchu", "Soham", "Gaurav", "Talele");
        List<String> list2 = list.stream().filter(e -> e.startsWith("T")).map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(list2);
        System.out.println("--------------------------------------------------");

        List<Person> listtt = Arrays.asList(new Person(1, "Tejal", 10), new Person(2, "Gaurav", 32),
                new Person(3, "Tejal", 23));
        Map<Integer, String> maolist = listtt.stream().collect(Collectors.toMap(Person::getId, Person::getName));
        System.out.println(maolist);

        System.out.println("------------------count--------------------------------");
        long integer = list.stream().filter(e -> e.contains("T")).count();
        System.out.println(integer);

        System.out.println("------------------forEach()------------------------------");
        List<String> list3 = list.stream().distinct().toList();
        list3.forEach(System.out::println);

        System.out.println("--------------------------------------------------");
        System.out.println("---------------Reduce methode------------------------");

        int[] integer2 = { 1, 2, 5, 8, 9, 10 };
        int i = Arrays.stream(integer2).reduce(Integer::sum).getAsInt();
        System.out.println(i);

        System.out.println(
                "--------------//find the total using reduce(identity , accumulator)------------------------------------");

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 4);
        int num1 = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(num1);

        // reduce(accumulator)
        int num2 = integers.stream().reduce((a, b) -> a > b ? a : b).get();
        System.out.println(num2);

        System.out.println("--------------------------------------------------");

        // anyMatch() , aalMatch() , nonematcg this takes predicates

        boolean liStream = Arrays.stream(integer2).anyMatch(num -> num < 5);
        System.out.println(liStream);

        System.out.println("--------------------------------------------------");
        boolean name = Arrays.stream(integer2).allMatch(n -> n < 11);
        System.out.println(name);
        System.out.println("--------------------------------------------------");
        boolean name2 = Arrays.stream(integer2).noneMatch(n -> n > 10);
        System.out.println(name2);

        System.out.println("---------------------min() & max()---------------------------");
        // min and max method return optional and takes comparator
        Optional<Integer> num3 = integers.stream().min((a, b) -> a < b ? a : b);
        System.out.println("Min : " + num3);

        Optional<Integer> num4 = integers.stream().max((a, b) -> a > b ? a : b);
        System.out.println("Max : " + num4);

        System.out.println("--------------------------------------------------");
        System.out.println("------contination of two stream----------");
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);

        Stream<Integer> concatStream = Stream.concat(l1.stream(), l2.stream());
        concatStream.forEach(System.out::println);

        System.out.println("-------------------------distinct()- return list------------------------");
        List<Integer> distintList = Arrays.asList(1, 2, 3, 3, 2, 1, 10, 8, 4, 6);
        List<Integer> dIntegers = distintList.stream().distinct().collect(Collectors.toList());
        System.out.println(dIntegers);

        System.out.println("--------Even Num List----------------------");
        System.out.println(distintList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));

        System.out.println("-------findAny() , findFirst() returns optional----------------------");
        System.out.println(distintList.stream().findAny().get());
        System.out.println(distintList.stream().findFirst().get());

        System.out.println("------------Intermidate Operations---------------");
        System.out.println("-----------flatMap()-----------------------------");
        //flatmap is the extension of map. it flaten the list
        List<List<String>> flatMap = new ArrayList<>();
        flatMap.add(Arrays.asList("ABC","BAC"));
        flatMap.add(Arrays.asList("CCC","BBA"));
        flatMap.add(Arrays.asList("GGG","PPP"));
        System.out.println(flatMap);   //output -- [[ABC, BAC], [CCC, BBA], [GGG, PPP]]

        List<String> flatmaplist = flatMap.stream()
                                .flatMap(x->x.stream()) //convert all inner list into the stream
                                .collect(Collectors.toList());
        System.out.println(flatmaplist);

        List<Integer> lengthoflist = flatMap.stream() // List<String> to List<Stream>
                                    .flatMap(e->e.stream()) //flatting the list of list into strem
                                    .map(String::length) // mapping each string to length
                                    .collect(Collectors.toList());
        System.out.println(lengthoflist);

        System.out.println("-----Conversion MapToInt , MapToDouble, MapToLong-----------------");

        System.out.println("----------------MapTOInt--------------------");
        List<Integer> nuList=Arrays.asList(1,2,3,4,5,6);
        IntStream mapToInt = nuList.stream().mapToInt(c->c*c);
        mapToInt.forEach(s->System.out.print(" "+s));
        System.out.println();

        System.out.println("----------------MapToDouble-----------");
        DoubleStream doubleStream = nuList.stream().mapToDouble(d->d+d);
        doubleStream.forEach(s->System.out.print(" "+s));
        System.out.println();

        System.out.println("------mapToLong-----------");
        LongStream longStream = nuList.stream().mapToLong(a->a*a);
        longStream.forEach(b->System.err.print(" "+b));




        



    }

}
