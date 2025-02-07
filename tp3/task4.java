package tp3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class task4 {
      public static void main(String[]args){
      
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a string : ");
        String str=scan.next();
        char [] Arr= str.toCharArray();
        String  arrChar=Arrays.toString(Arr);
        System.out.println( arrChar);
       
        scan.close(); 
      }
}
