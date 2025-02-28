package tp5.SchoolManagmentSystem;

public class Person {
    protected String name;
    protected int age;
    protected int ID;

    public Person(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + ID);
    }
}
