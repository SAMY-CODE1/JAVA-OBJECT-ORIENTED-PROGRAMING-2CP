package tp5.SchoolManagmentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> schoolMembers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        schoolMembers.add(new Student("sam", 17, 101, 2, 13.8));
        schoolMembers.add(new Teacher("Ali", 45, 201, "Math", 50000));
        schoolMembers.add(new Staff("moh", 30, 301, "Librarian", 8));

        boolean running = true;
        while (running) {
            System.out.println("\n--- School Management System ---");
            System.out.println("1. Show all members");
            System.out.println("2. Add Student");
            System.out.println("3. Add Teacher");
            System.out.println("4. Add Staff");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    for (Person member : schoolMembers) {
                        member.displayDetails();
                        System.out.println("----------------------");
                    }
                    break;
                case 2:
                    System.out.print("Enter Student Name: ");
                    String sName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int sAge = scanner.nextInt();
                    System.out.print("Enter ID: ");
                    int sID = scanner.nextInt();
                    System.out.print("Enter Grade Level: ");
                    int gradeLevel = scanner.nextInt();
                    System.out.print("Enter AVG: ");
                    double avg = scanner.nextDouble();
                    schoolMembers.add(new Student(sName, sAge, sID, gradeLevel, avg));
                    System.out.println("Student added successfully!");
                    break;
                case 3:
                    System.out.print("Enter Teacher Name: ");
                    String tName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int tAge = scanner.nextInt();
                    System.out.print("Enter ID: ");
                    int tID = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Subject: ");
                    String subject = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    schoolMembers.add(new Teacher(tName, tAge, tID, subject, salary));
                    System.out.println("Teacher added successfully!");
                    break;
                case 4:
                    System.out.print("Enter Staff Name: ");
                    String staffName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int staffAge = scanner.nextInt();
                    System.out.print("Enter ID: ");
                    int staffID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Role: ");
                    String role = scanner.nextLine();
                    System.out.print("Enter Work Hours: ");
                    int workHours = scanner.nextInt();
                    schoolMembers.add(new Staff(staffName, staffAge, staffID, role, workHours));
                    System.out.println("Staff added successfully!");
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}

