package tp1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your name ");
        String name=scan.next();
        System.out.println("enter your BirthData");
        String birthDate=scan.next();
        System.out.println("enter your age");
        int age=scan.nextInt();
        System.out.println("enter your weight");
        int weight=scan.nextInt();
        System.out.println("My name is : "+name+"`\nBorn on :"+birthDate+"\n I have "+age+" Years old \nI weight "+weight+" Kg");
        scan.close();
    }
}
