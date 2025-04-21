package com.programmespractice.InterFaces.Comparable;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;

    public Employee(String name, int id) {
        this.id = id;
        this.name = name;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {

        return this.id - o.id;
    }

    public String toString() {
        return "Employee name"+":" + name + "  id : " + id;
    }

}
