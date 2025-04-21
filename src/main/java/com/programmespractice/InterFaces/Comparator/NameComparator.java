package com.programmespractice.InterFaces.Comparator;

import java.util.Comparator;

import com.programmespractice.InterFaces.Comparable.Employee;

public class NameComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
