package TP2;

import java.util.Scanner;

public class task6 {
//     Write a program a JAVA program asks a user for his credentials (Username and password). 
// After 3 wrong inputs, the user will be rejected. Note: Username and password both must be 
// strings.  
public static void main(String [] args){
    //initialise the corredensiels
    String name="samy";
    String pass="boutalbi";
    ////////////////////////////////
    System.out.println("please enter your credentiels ");

    Scanner scan= new Scanner(System.in);
    int i=1;
    int checkTime=3;
    int rest=3;
     
    while ( i<=checkTime){
        System.out.println("------------------------------------------------------");
        System.out.print("enter your name : ");
    String tryName=scan.next();
    System.out.print("enter your password : ");
    String tryPass=scan.next();
    //check the condetions
    if(name.equals(tryName) && pass.equals(tryPass)){
        System.out.println("thank "+ name +"! you log in seccesfully");
        i=checkTime+1;
    }else{
        System.out.println("please enter the correct credensials");
        System.out.println("------------------------------------------------------");
        System.out.println(" you have only "+--rest+" try left");

    }
    if(rest==0){
       
        System.out.println("please dont try again because you wrong 3 time so you are rejected");
        i=checkTime+1;
    }
}
System.out.println("------------------------------------------------------");

scan.close();
}
}
