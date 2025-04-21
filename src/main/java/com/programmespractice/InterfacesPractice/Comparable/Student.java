package com.programmespractice.InterfacesPractice.Comparable;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int marks;

    public Student(int id , String name , int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;

    }

    public int getMarks(){
        return marks;
    }

    public String toString(){
        return "Student {"+id +" "+ name +" " + marks+"}";
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }
        
    
}
