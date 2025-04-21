package com.programmespractice.InterfacesPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.programmespractice.InterfacesPractice.Comparable.Student;
import com.programmespractice.InterfacesPractice.Comparator.MarksComparator;

public class Main  {
    public static void main(String[] args) {
        List list = new ArrayList<Student>();
        list.add(new Student(2, "Prathmaa", 200));
        list.add(new Student(7, "Gaurav", 400));
        list.add(new Student(9, "Ketki", 900));
        list.add(new Student(1, "Tejal", 500));
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list , new MarksComparator());
        System.out.println("Comparator Sorting by marks"+list);
        

    }
}
