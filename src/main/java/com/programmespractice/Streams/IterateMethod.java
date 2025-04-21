package com.programmespractice.Streams;

import java.util.stream.Stream;

public class IterateMethod {
    public static void main(String[] args) {
        Stream.iterate(1, element->element+1).filter(element->element%10 == 0).limit(5).forEach(System.out::println);

        Stream<Integer> liStream = Stream.iterate(10, n->n +1).filter(n->n%2 == 0).limit(10);
        liStream.forEach(System.out::println);

    }
}
