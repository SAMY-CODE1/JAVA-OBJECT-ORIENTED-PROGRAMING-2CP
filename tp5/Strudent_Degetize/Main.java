package tp5.Strudent_Degetize;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    ArrayList<Student> Student_list = new ArrayList<Student>();
    ArrayList<Student> Student_list1 = new ArrayList<Student>();

    public void avg(ArrayList<Student> list) {
        double somme=0;
        for (int i = 0; i < list.size(); i++) {
         somme +=list.get(i).note;
        }
        double average = somme / list.size();
        System.out.printf("the average of all the student is : %.2  ",average);
    }

    public void add_Student(ArrayList<Student> list, String name, int note, int id) {

        list.add(new Student(note, id, name));
        System.out.println("new student was created ");
        show_AllStudent(list);
    }

    public void show_AllStudent(ArrayList<Student> list) {

        if (list.size() == 0) {
            System.out.println("there are  no Student !!!");
        } else {
            System.out.println("there are in the list " + list.size() + " Student !!");
            for (int i = 0; i < list.size(); i++) {

                System.out.println("       Student  name : " + list.get(i).name);
                System.out.println("       Student Id : " + list.get(i).id);
                System.out.println("       Student TP note : " + list.get(i).note);
                System.out.println("--------------------------");
            }
        }
    }

    public void search_AllStudent(ArrayList<Student> list, String input, ArrayList<Student> list1) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equalsIgnoreCase(input)) {
                list1.add(list.get(i));
            }

        }
        show_AllStudent(list1);

    }

    public static void main(String[] args) {
        Main Obj = new Main();
        Random rand = new Random();
        System.out.println("hello to student degetize System : ");
        System.out.println("-----------------------------------");
        Scanner scan = new Scanner(System.in);
        boolean continu = true;
        while (continu == true) {
            System.out.println("-----------------------------");
            System.out.println("1_Enter (add) to add a new student");
            System.out.println("2_Enter (show) to show all students");
            System.out.println("3_Enter (search) to search student by name");
            System.out.println("4_Enter (searchAll) to search students by name");
            System.out.println("5_Enter (avg) to compute and display the class average");
            System.out.println("6_Enter (exit) to exit the program");
            System.out.println("-----------------------------");
            System.out.print("chose from 1_5 : ");

            int chose = scan.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("enter the name: ");
                    String name = scan.next();
                    System.out.println("enter the TP note: ");
                    int note = scan.nextInt();
                    
                    Obj.add_Student(Obj.Student_list, name, note, rand.nextInt(1000));
                    break;
                case 2:
                    Obj.show_AllStudent(Obj.Student_list);
                    break;
                case 4:
                    System.out.println("enter the name you went to search for :  ");
                    String input = scan.next();
                    Obj.search_AllStudent(Obj.Student_list, input, Obj.Student_list1);
                    break;
                case 5:
                    Obj.avg(Obj.Student_list);
                    break;
                case 6:
                    continu = false;
            }
        }
        scan.close();
    }

}
