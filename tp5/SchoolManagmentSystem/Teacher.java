package tp5.SchoolManagmentSystem;

public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, int ID, String subject, double salary) {
        super(name, age, ID);
        this.subject = subject;
        this.salary = salary;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject + ", Salary: $" + salary);
    }
}