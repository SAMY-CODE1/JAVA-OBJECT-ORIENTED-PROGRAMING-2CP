package ClassAbstractTP6.abstractclasses;

import ClassAbstractTP6.classes.Person;

public abstract class Employee extends Person {  
    protected int salery;
    private int employeeId;
    
    public Employee(String name, int age, int salery, int employeeId) {
        super(name, age);
        this.salery = salery;
        this.employeeId = employeeId;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

   
    public abstract double calculateBonus();

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("salery: " + getSalery());
    }
}