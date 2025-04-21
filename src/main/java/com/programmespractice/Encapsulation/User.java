package com.programmespractice.Encapsulation;

public class User {
    private int id;
    private String name;

    // this variables cannot be accessible directly if we want to access it we have
    // to set getter and seeter

    public User() {
    };

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Employee extends User {
    Employee(String name, int id) {
        super(name, id);
    }

}

class main {
    public static void main(String[] args) {
        User user = new User();
        // using getter and setter
        user.setId(1);
        user.setName("Tejal Sarode");
        System.out.println("Id :" + user.getId() + "  " + "name :" + user.getName());

        // Using Parameterized Constructor
        // if we using parameterized constructor then also we have to create getter no
        // need for the setter
        Employee emp = new Employee("Prathmaa", 2);
        System.out.println(emp.getName() + " " + emp.getId());

    }
}
