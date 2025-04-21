package com.programmespractice.InterFaces.Comparator;

import java.util.Comparator;

import com.programmespractice.InterFaces.Comparable.Employee;

public class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getId() - o2.getId();
    }

}
