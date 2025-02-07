package TP2;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        
        String respone="yes";
        while (respone=="yes") {

       System.out.println("welcom to this game you will try to guus the number chosen by the computer ");

        Random rand=new Random();
        int randomNum=rand.nextInt(100)+1;
        // System.out.println(randomNum);
        System.out.print(" please! guss a number :");
        Scanner scan=new Scanner(System.in);
        int gussNum=scan.nextInt();
        boolean fond=false;
        while (fond==false) {

if (gussNum>randomNum){
    System.out.println("too haight");
    System.out.print("inter a number from 0 to "+gussNum+ " : ");
    gussNum=scan.nextInt();
}
if (gussNum<randomNum){
    System.out.println("too llow");
    System.out.print("inter a number from "+gussNum +" to 100 : ");
    gussNum=scan.nextInt();
}
if (gussNum==randomNum){
    System.out.println("Graight job");
    fond=true;
}

}
System.out.println("whoud you to play the game again : " );
 respone=scan.next();
}
System.out.println("thank you ");
}

}