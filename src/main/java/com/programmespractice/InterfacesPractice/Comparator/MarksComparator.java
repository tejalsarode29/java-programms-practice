package com.programmespractice.InterfacesPractice.Comparator;

import java.util.Comparator;

import com.programmespractice.InterfacesPractice.Comparable.Student;

public class MarksComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMarks()-o2.getMarks();
    }
    
}
