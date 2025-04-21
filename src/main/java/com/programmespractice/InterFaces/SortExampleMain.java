package com.programmespractice.InterFaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.programmespractice.InterFaces.Comparable.Employee;
import com.programmespractice.InterFaces.Comparator.IdComparator;
import com.programmespractice.InterFaces.Comparator.NameComparator;

public class SortExampleMain {
    public static void main(String[] args) {
        List list = new ArrayList<Employee>();
        list.add(new Employee("Tejal", 1));
        list.add(new Employee("Gaurav", 3));
        list.add(new Employee("Soham", 4));
        list.add(new Employee("Prathmaa", 2));
        System.out.println("Before Sorting :" + list);
        Collections.sort(list);
        System.out.println("After Sorting :" + list);

        System.out.println("------------------------------------------");

        Collections.sort(list, new IdComparator());
        System.out.println("Sorting with Comparator" + list);
        Collections.sort(list, new NameComparator());
        System.out.println("Sorting By Name In Comparator" + list);

    }
}
