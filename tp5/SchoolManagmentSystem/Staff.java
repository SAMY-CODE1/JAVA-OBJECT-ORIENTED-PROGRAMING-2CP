package tp5.SchoolManagmentSystem;


public class Staff extends Person {
    private String role;
    private int workHours;

    public Staff(String name, int age, int ID, String role, int workHours) {
        super(name, age, ID);
        this.role = role;
        this.workHours = workHours;
    }

    public void work() {
        System.out.println(name + " is working as a " + role + " for " + workHours + " hours.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: " + role + ", Work Hours: " + workHours);
    }
}
