package TP2;

import java.util.Scanner;

public class tast11 {
//     Write a small calculator! 
// a) Ask the user for 2 numbers 
// b) Ask the user for an operation. (Similar to Exercise 3: 1 -> +, 2 -> -, 3 -> *, 4 -> /) 
// c) Execute the operation with the two numbers and print the result to the screen 
public static void main(String [] args){
Scanner scan =new Scanner(System.in);
System.out.print("please enter the first number :");
int firstNum=scan.nextInt();
System.out.print("please enter the second number :");
int secondNum=scan.nextInt();
System.out.println("please spicefy an operation : ");
System.out.println(" 1 -> +\n 2 -> -\n 3 -> *\n 4 -> /");
int operationNum=scan.nextInt();
switch(operationNum){
    case 1: System.out.println("the results is: " +(firstNum+secondNum));
    break;
    case 2:System.out.println("the results is: " +(firstNum-secondNum));
    break;
    case 3:System.out.println("the results is: " +(firstNum*secondNum));
    break;
    case 4:System.out.println("the results is: " +(firstNum/secondNum));
    break;
}
}
}
