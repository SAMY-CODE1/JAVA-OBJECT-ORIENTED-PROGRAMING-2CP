package tp5.SchoolManagmentSystem;

public class Student extends Person {
    private int gradeLevel;
    private double avg;

    public Student(String name, int age, int ID, int gradeLevel, double avg) {
        super(name, age, ID);
        this.gradeLevel = gradeLevel;
        this.avg = avg;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade Level: " + gradeLevel + ", AVG: " + avg);
    }
}
