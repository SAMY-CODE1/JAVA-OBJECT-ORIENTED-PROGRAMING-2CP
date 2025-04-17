package ClassAbstractTP6.classes;

import ClassAbstractTP6.abstractclasses.Employee;
import ClassAbstractTP6.interfaces.Manager;

public class Developer extends Employee implements Manager {

    private int experience;

    public Developer(String name, int age, int employeeId, int salary, int experience) {
        super(name, age, salary, employeeId);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void approveLeave(String employeeName) {
        System.out.println("Leave approved for developer: " + employeeName);
    }

    
    public double calculateBonus() {
        return salery*(experience*0.01);
    }

    public void displayDeveloperDetails() {
        displayDetails(); 
        System.out.println("Experience (years): " + experience);
        System.out.println("Bonus: " + calculateBonus());
    }
}
