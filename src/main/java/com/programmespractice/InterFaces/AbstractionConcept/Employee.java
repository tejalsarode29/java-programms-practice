package com.programmespractice.InterFaces.AbstractionConcept;

public abstract class Employee {
    String name;
    int paymentPerHour;

    public Employee(){};
    public Employee(String name , int paymentPerHour){
        this.name = name;
        this.paymentPerHour=paymentPerHour;
    }
    
        public abstract int calculateSalary();
        public String getName(){
            return name;
        }

        public int getPaymentPerHour(){
            return paymentPerHour;
        }

        public void setName(String name){
            this.name = name;
        }
        public void setPaymentPerHour(int hour){
            this.paymentPerHour = hour;
        }

}



// Not using getter and setter
class Contractor extends Employee{
     int workingHours;
    public Contractor(String name , int paymentPerHour ,int workingHours ){
        super(name,paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }
    
}


 class main {
    public static void main(String[] args) {
        Employee employee = new Contractor("Contractor" , 30 , 3);
        System.out.println(employee.calculateSalary());

    }
    
}
