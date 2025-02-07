package tp1;

import java.util.Scanner;

public class task2 {
     // calculate the sum 
    public static int sum( int a,int b, int c){
       return  a + b + c;
    } 
    // calculate teh average
public static double average(int a){
    return a/3.0;
}
    //calculat the average of three number
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("write the first number:");
        int fistNumber = scanner.nextInt();
        System.out.println("write the second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("write the third number:");
        int thirdNumber = scanner.nextInt();
       
      int globalSum= sum(fistNumber, thirdNumber, secondNumber);
     System.out.println("the sum of the three number " + fistNumber+ " & " + secondNumber + " & "+ thirdNumber + " :"+globalSum);
     double average=  average(globalSum);
System.out.printf("The average is: %.1f\n", average);
scanner.close();

    }
   
}
