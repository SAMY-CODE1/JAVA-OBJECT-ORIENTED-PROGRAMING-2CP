package tp1;

import java.util.Scanner;

public class task4 {
    //check the number odd or iven
    // iven pair
    public static void main( String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number:");
    
        if(scan.hasNextInt()){
            int a=scan.nextInt();
            System.out.printf("the number %d is %s.",a,(a%2==0)?"even":"odd");
        } else { 
            System.out.println("invalide input");
        }
        scan.close();
    }
}
