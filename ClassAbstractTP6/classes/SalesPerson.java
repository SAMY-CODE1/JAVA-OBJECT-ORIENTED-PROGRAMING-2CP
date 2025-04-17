
package ClassAbstractTP6.classes;

import ClassAbstractTP6.abstractclasses.Employee;
import ClassAbstractTP6.interfaces.Manager;

public class SalesPerson extends Employee implements Manager {
    private double salesAmount;  

    public SalesPerson(String name, int age, int salary, int employeeId, double salesAmount) {
        super(name, age, salary, employeeId);
        this.salesAmount = salesAmount;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public double calculateBonus() { 
        return salesAmount * 0.1;
    }

    @Override
    public void approveLeave(String employeeName) {
        System.out.println("Sales Manager approved leave for: " + employeeName);
    }

    public void displaySalesPersonDetails() {
        displayDetails();
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Bonus: " + calculateBonus());  // Corrected method call
    }
}